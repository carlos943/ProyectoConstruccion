package Controlador;

import Modelo.Mesa_de_dulces;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Lalo
 * @version 1.0
 * @created 19-sep-2014 02:36:30 p.m.
 */
public class ControladorMesaDeDulces {

    Connection Conexion;
    ConexionBaseDatos BaseDeDatos;

    public ControladorMesaDeDulces() {
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
     * @param mesaDulces
     */
    public boolean agregarMD(Mesa_de_dulces mesaDulces) throws SQLException {
        boolean seAgregoMesaDeDulces = false;

        Statement sentAgregaMesaDeDulces = Conexion.createStatement();
        sentAgregaMesaDeDulces.executeUpdate("INSERT INTO charmingstudio.mesadulces (`Nombre`, `Costo`)" + "VALUES("
                + "'" + mesaDulces.getmdNombreDeMesa() + "',"
                + "'" + mesaDulces.getPrecio() + "')");

        seAgregoMesaDeDulces = true;
        return seAgregoMesaDeDulces;

    }

    /**
     *
     * @param idMesaDeDulces
     */
    public boolean eliminarMD(int idMesaDeDulces) throws SQLException {
        boolean seEliminoMesaDeDulces = false;

        Statement sentEliminaMesaDeDulces = Conexion.createStatement();

        sentEliminaMesaDeDulces.executeUpdate("DELETE FROM charmingstudio.mesadulces WHERE idMesaDulces= '" + idMesaDeDulces + "'");
        seEliminoMesaDeDulces = true;

        return seEliminoMesaDeDulces;

    }

    /**
     *
     * @param nombreMdDulces
     */
    public Mesa_de_dulces buscarMD(String nombreMdDulces) {
        return null;
    }

    /**
     *
     * @param nombreMD
     */
    public boolean modificarMD(String nombreMD) {
        return false;
    }

    public static void main(String[] args) {
        Mesa_de_dulces md = new Mesa_de_dulces("Chile", 100);
        ControladorMesaDeDulces ctrl = new ControladorMesaDeDulces();
        //ctrl.agregarMD(md);
    }
}
