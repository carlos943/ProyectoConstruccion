package Controlador;

import Modelo.Persona;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 * @author Lalo
 * @version 1.0
 * @created 19-sep-2014 02:34:05 p.m.
 */
public class ControladorClientes extends GestorBD {

    private Connection Conexion;

    @SuppressWarnings({"static-access", "static-access"})
    public ControladorClientes() {
        try {
            Conexion = BaseDeDatos.getInstanciaConexionDeBaseDatos().getConexionBD();
        } catch (SQLException ex) {
            System.out.println("No hubo conexión" + ex.getLocalizedMessage());
        }
    }
    
    public boolean existeUsuario(Cliente cliente) throws SQLException{
        
        LinkedList<Cliente> listaDeClientes = buscar(cliente.getNombrePersona());;
        boolean existeUsuario = false;

        for (Cliente clienteEnBD : listaDeClientes) {
            /*hay que modificar este if: */

            if (comparaClientes(clienteEnBD, cliente)) {
                //si se cumple, entonces encontramos una coincidencia:
                existeUsuario = true;
                //rompemos el ciclo en caso de que haya más de un cliente
                //con los mismos datos:
                break;
            }
        }
        return existeUsuario;
}

    /**
     * Este método se encarga de agregar un cliente específicamente a la base de
     * datos.
     *
     * @param cliente, que será el cliente a introducir a la base de datos.
     * @return verdadero o falso, dependiendo de si se pudo agregar o no a la
     * base de datos.
     * @throws java.sql.SQLException, en caso de que la conexión con la base de
     * datos no se logre o cualquier otra excepción relacionada con la base de
     * datos.
     */
    @Override
    public boolean agregar(Persona persona) throws SQLException {
        boolean seAgregoCliente = false;
        Cliente cliente = (Cliente)persona;
        Statement sentencia = Conexion.createStatement();
        if(!existeUsuario(cliente)){
            sentencia.executeUpdate("INSERT INTO charmingstudio.cliente (`Nombre`, "
                + "`Direccion`, `Telefono`, `Correo`)" + "VALUES("
                + "'" + cliente.getNombrePersona() + "',"
                + "'" + cliente.getDireccionPersona() + "',"
                + "'" + cliente.getTelefonoPersona() + "',"
                + "'" + cliente.getCorreoPersona() + "')");
        seAgregoCliente = true;
        }
        return seAgregoCliente;
    }

    /**
     * Método que se encarga de eliminar a una persona desde la base de datos.
     * ROMARIO ESTA FUNCIÓN CAMBIA!
     *
     * @param idCliente
     * @return
     * @throws java.sql.SQLException, en caso de que la conexión con la base de
     * datos no se logre o cualquier otra excepción relacionada con la base de
     */
    @Override
    public boolean eliminar(int idCliente) throws SQLException {
        boolean seEliminoCliente = false;
        Statement sentencia = Conexion.createStatement();
        sentencia.executeUpdate("DELETE FROM charmingstudio.cliente WHERE idCliente= '" + idCliente + "'");
        seEliminoCliente = true;

        return seEliminoCliente;
    }

    /**
     * Función que se encarga de buscar a una o varios clientes, dependiendo de
     * las coincidencias, de la base de datos.
     *
     * @param nombrePersona que es el nombre de la persona a buscar.
     * @return la lista de personas que coincidan con el nombre, si solo es una
     * regresa la lista con un solo cliente.
     * @throws java.sql.SQLException, en caso de que la conexión con la base de
     * datos no se logre o cualquier otra excepción relacionada con la base de
     */
    @Override
    public LinkedList buscar(String nombrePersona) throws SQLException {

        Statement sentenciaDeBusquedaDeClientes = Conexion.createStatement();
        ResultSet BusquedaDeClientes = sentenciaDeBusquedaDeClientes.executeQuery("SELECT * "
                + "FROM charmingstudio.cliente WHERE Nombre LIKE '%" + nombrePersona + "%'");
        if (!BusquedaDeClientes.wasNull()) {
            //creamos la lista:
            LinkedList<Cliente> clientes = new LinkedList<>();

            while (BusquedaDeClientes.next()) {
                //agregamos c/cliente a la lista:
                
                clientes.add(new Cliente(BusquedaDeClientes.getInt(1),BusquedaDeClientes.getString(2), BusquedaDeClientes.getString(3),
                        BusquedaDeClientes.getString(4), BusquedaDeClientes.getString(5)));

            }
            return clientes;
        }
        System.out.println("El cliente no se encuentra en la BD");
        return null;
    }
    
    /**
     * Función que se encarga de buscar a una o varios clientes, dependiendo de
     * las coincidencias, de la base de datos.
     *
     * @param nombrePersona que es el nombre de la persona a buscar.
     * @return la lista de personas que coincidan con el nombre, si solo es una
     * regresa la lista con un solo cliente.
     * @throws java.sql.SQLException, en caso de que la conexión con la base de
     * datos no se logre o cualquier otra excepción relacionada con la base de
     */
    
    @Override
    public Cliente buscarEspecificamente(String nombrePersona, String direccion, String telefono, String correo) throws SQLException {

        Statement sentenciaDeBusquedaDeClientes = Conexion.createStatement();
        ResultSet BusquedaDeClientes = sentenciaDeBusquedaDeClientes.executeQuery("SELECT * "+
                "FROM charmingstudio.cliente WHERE Nombre = '" + nombrePersona + "' AND "+ 
                "Direccion = '" + direccion +"' AND Telefono = '"+telefono+"' AND Correo = '"+correo+"'");
                
                
        if (!BusquedaDeClientes.wasNull()) {
            //como no fue nulo, el cliente si se encuentra en la BD
           

            if (BusquedaDeClientes.next()) {
                //agregamos c/cliente a la lista:
                Cliente cliente = new Cliente(BusquedaDeClientes.getInt(1),BusquedaDeClientes.getString(2), BusquedaDeClientes.getString(3),
                        BusquedaDeClientes.getString(4), BusquedaDeClientes.getString(5));
                System.out.println(cliente);
                return cliente;
            }
            return null;
        }
        System.out.println("El cliente no se encuentra en la BD");
        return null;
    }

    /**
     * Función que actualiza la información de un cliente en la base de datos,
     * primero encuentra la persona a modificar para saber que exista en la base
     * de datos, posteriormente realiza las actualizaciones de la información.
     *
     * @param persona que es el objeto cliente con las modificaciones ya hechas.
     * @return verdadero o falso, dependiendo de si se pudo modificar la
     * información o no.
     * @throws java.sql.SQLException, en caso de que la conexión con la base de
     * datos no se logre o cualquier otra excepción relacionada con la base de
     */
    @Override
    public boolean modificar(Persona persona) throws SQLException {
        //el parámetro solo es de entrada:
        Cliente clienteA_modificar = (Cliente) persona;

        //en caso de que no haya el usuario en la BD. 
        
            System.out.println(clienteA_modificar.getIdPersona());
            Statement sentenciaDeActualizacionDeClientes = Conexion.createStatement();
            int actualizaInfoEmpleado
                    = sentenciaDeActualizacionDeClientes.executeUpdate("UPDATE charmingstudio.cliente "
                            + "SET `Nombre` = '" + clienteA_modificar.getNombrePersona() + "'"
                            + ",`Direccion` = '" + clienteA_modificar.getDireccionPersona() + "'"
                            + ",`Telefono` = '" + clienteA_modificar.getTelefonoPersona() + "'"
                            + ",`Correo`= '" + clienteA_modificar.getCorreoPersona() + 
                    "' WHERE `idCliente`='"+ clienteA_modificar.getIdPersona() +"'");

            boolean sePudoModificarInfoCliente = false;
            if (actualizaInfoEmpleado!=0) {
                sePudoModificarInfoCliente = true;
            }
            
            //devuelve si se pudo o no, modificar el cliente:
            return sePudoModificarInfoCliente;
    }

    /**
     * Esta función se encarga de comparar todos los campos de 2 clientes
     * distintos.
     *
     * @return boolean, true si son iguales en almenos un campo, falso de otro
     * modo.
     */
    private boolean comparaClientes(Cliente clienteEncontradoEnBD, Cliente clienteA_modificar) {
        //primero obtenemos ambos nombres:
        String nombreClienteEncontradoEnBD = clienteEncontradoEnBD.getNombrePersona();
        String nombreClienteA_modificar = clienteA_modificar.getNombrePersona();
        //comparamos los nombres:
        if (nombreClienteEncontradoEnBD.equalsIgnoreCase(nombreClienteA_modificar)) {
            return true;
        } else {
            //el else fue considerado, pero no es necesario.
        }

        //obtenemos las direcciones:
        String direccionClienteEncontradoEnBD = clienteEncontradoEnBD.getDireccionPersona();
        String direccionClienteA_modificar = clienteA_modificar.getDireccionPersona();
        //comparamos las direcciones:
        if (direccionClienteEncontradoEnBD.equalsIgnoreCase(direccionClienteA_modificar)) {
            return true;
        } else {
            //el else fue considerado, pero no es necesario.
        }

        //obtenemos los teléfonos:
        String telefonoClienteEncontradoEnBD = clienteEncontradoEnBD.getTelefonoPersona();
        String telefonoClienteA_modificar = clienteA_modificar.getTelefonoPersona();
        if (telefonoClienteEncontradoEnBD.equalsIgnoreCase(telefonoClienteA_modificar)) {
            return true;
        } else {
            //el else fue considerado, pero no es necesario.
        }

        //obtenemos los correos::
        String correoClienteEncontradoEnBD = clienteEncontradoEnBD.getCorreoPersona();
        String correoClienteA_modificar = clienteA_modificar.getCorreoPersona();
        if (correoClienteEncontradoEnBD.equalsIgnoreCase(correoClienteA_modificar)) {
            return true;
        } else {
            //el else fue considerado, pero no es necesario.
        }
        
        /*Si llega hasta aquí, entonces los clientes son distintos:*/
        return false;
    }

}//fin de la clase.
