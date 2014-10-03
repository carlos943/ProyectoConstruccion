package Controlador;

import Modelo.Persona;
import Modelo.Empleado;
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
 * @created 19-sep-2014 02:34:45 p.m.
 */
public class ControladorEmpleados extends GestorBD {

    Connection Conexion;

    public ControladorEmpleados() {
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
        Empleado empleado = (Empleado) persona;
        boolean seAgregoEmpleado = false;
        Statement sentencia = Conexion.createStatement();

        sentencia.executeUpdate("INSERT INTO charmingstudio.empleado (`Nombre`, `Direccion`, `Telefono`, `Correo`,`Desempeno`,`Sueldo`)" + "VALUES("
                + "'" + empleado.getNombrePersona() + "',"
                + "'" + empleado.getDireccionPersona() + "',"
                + "'" + empleado.getTelefonoPersona() + "',"
                + "'" + empleado.getCorreoPersona() + "',"
                + "'" + empleado.getEmpDesempenio() + "',"
                + "'" + empleado.getEmpSueldo() + "')");
        seAgregoEmpleado = true;

        return seAgregoEmpleado;
    }

    /**
     *
     * @param nombrePersona
     */
    public boolean eliminar(int idEmpleado) throws SQLException {
        boolean seEliminoEmpleado = false;

        Statement sentencia = Conexion.createStatement();

        sentencia.executeUpdate("DELETE FROM charmingstudio.empleado WHERE idEmpleado= '" + idEmpleado + "'");
        seEliminoEmpleado = true;
        return seEliminoEmpleado;

    }

    /**
     *
     * @param nombrePersona
     */
    public LinkedList buscar(String nombrePersona) throws SQLException {
        LinkedList<Empleado> empleado = new LinkedList<>();

        Statement sentencia = Conexion.createStatement();
        ResultSet Busqueda = sentencia.executeQuery("SELECT * FROM charmingstudio.empleado WHERE Nombre='" + nombrePersona + "'");
        if (!Busqueda.wasNull()) {
            while (Busqueda.next()) {
                empleado.add(new Empleado(Busqueda.getInt(1),Busqueda.getString(2), Busqueda.getString(3), Busqueda.getString(4), Busqueda.getString(5), Busqueda.getFloat(6), Busqueda.getFloat(7)));
            }
            return empleado;
        }
        System.out.println("El empleado no se encuentra en la BD");

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
        ControladorEmpleados ctrl = new ControladorEmpleados();
        //Empleado emp = new Empleado("Romarito", "Americas", "9993155347", null, 10, 600);
        //ctrl.agregar(emp);
        //ctrl.eliminar("Romarito");
        LinkedList<Empleado> buscar;
        try {
            buscar = ctrl.buscar("Romarito");
            System.out.println(buscar.get(0));
        } catch (SQLException ex) {
            System.out.println("No se agrego cliente   " + ex.getLocalizedMessage());
        }

    }

    @Override
    public Persona buscarEspecificamente(String nombrePersona, String direccion, String telefono, String correo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
