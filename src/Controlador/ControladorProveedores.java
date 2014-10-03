package Controlador;

import Modelo.Persona;
import Modelo.Proveedor;
import Modelo.Servicio;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Lalo
 * @version 1.0
 * @created 19-sep-2014 02:34:26 p.m.
 */
public class ControladorProveedores extends GestorBD {

    Connection Conexion;

    public ControladorProveedores() {
        try {
            Conexion = BaseDeDatos.getInstanciaConexionDeBaseDatos().getConexionBD();
            System.out.println("Se conecto");
        } catch (SQLException ex) {
            System.out.println("No hay conexion");
            Logger.getLogger(ControladorClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void finalize() throws Throwable {

    }

    /**
     *
     * @param persona
     */
    public boolean agregar(Persona persona) throws SQLException {
        boolean seAgregoProveedor = false;
        Proveedor Proveedor = (Proveedor) persona;

        //Se crean tres para que no creen conflictos entre ellos.
        Statement sentenciaAgregaProveedor = Conexion.createStatement();
        Statement sentenciaBuscaIdProveedor = Conexion.createStatement();
        Statement sentenciaBuscaIdServicio = Conexion.createStatement();

        sentenciaAgregaProveedor.executeUpdate("INSERT INTO charmingstudio.proveedor (`Nombre`, `Direccion`, `Telefono`, `Correo`)" + "VALUES("
                + "'" + Proveedor.getNombrePersona() + "',"
                + "'" + Proveedor.getDireccionPersona() + "',"
                + "'" + Proveedor.getTelefonoPersona() + "',"
                + "'" + Proveedor.getCorreoPersona() + "')");

        ResultSet idProveedor = sentenciaBuscaIdProveedor.executeQuery("SELECT idProveedor FROM charmingstudio.proveedor WHERE Nombre='" + Proveedor.getNombrePersona() + "'");
        idProveedor.next();

        for (int i = 0; i < Proveedor.getProvServicios().length; i++) {
            ResultSet idServicio = sentenciaBuscaIdServicio.executeQuery("SELECT idServicios FROM charmingstudio.servicios WHERE Nombre='" + Proveedor.getProvServicios()[i].getServNombre() + "'");
            idServicio.next();
            sentenciaAgregaProveedor.executeUpdate("INSERT INTO charmingstudio.provee (`idProveedor`, `idServicios`, `costo`)" + "VALUES("
                    + "'" + idProveedor.getInt(1) + "',"
                    + "'" + idServicio.getInt(1) + "',"
                    + "'" + Proveedor.getProvServicios()[i].getCosto() + "')");
        }
        seAgregoProveedor = true;
        return seAgregoProveedor;

    }

    /**
     *
     * @param nombrePersona
     */
    public boolean eliminar(int idProveedor) {
        return false;
    }

    /**
     *
     * @param nombrePersona
     */
    public LinkedList buscar(String nombrePersona) throws SQLException {
        LinkedList<Proveedor> proveedor = new LinkedList<>();
        Statement sentencia = Conexion.createStatement();
        ResultSet Busqueda = sentencia.executeQuery("SELECT * FROM charmingstudio.cliente WHERE Nombre LIKE '%" + nombrePersona + "%'");
        if (!Busqueda.wasNull()) {
            while (Busqueda.next()) {
                Servicio[] ServiciosProveedor = new Servicio[6];
                
                proveedor.add(new Proveedor(Busqueda.getInt(1),Busqueda.getString(2), Busqueda.getString(3), Busqueda.getString(4),  Busqueda.getString(5), ServiciosProveedor));
            }
            return proveedor;
        }
        System.out.println("El cliente no se encuentra en la BD");
        return null;
    }

    /**
     *
     * @param nombrePersona
     */
    public boolean modificar( Persona Persona) {
        return false;
    }

    public static void main(String[] args) {

        ControladorProveedores ctrl = new ControladorProveedores();
        Servicio[] serv = new Servicio[2];

        serv[0] = new Servicio("Carpa", 800);
        serv[1] = new Servicio("Iluminacion", 500);

        //Proveedor prov = new Proveedor("Eduardo", "canche", "vazquez", null, serv);
        //ctrl.agregar(prov);
    }

    @Override
    public Persona buscarEspecificamente(String nombrePersona, String direccion, String telefono, String correo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
