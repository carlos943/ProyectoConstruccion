package Controlador;
import Modelo.EventosSociales;
import java.util.Date;

/**
 * @author Lalo
 * @version 1.0
 * @created 19-sep-2014 02:36:23 p.m.
 */
public class ControladorEventos {

	public ControladorEventos(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param eventoA_Guardar
	 */
	public void agregarEvento(EventosSociales eventoA_Guardar){

	}

	/**
	 * 
	 * @param fecha
	 * @param nombreEvento
	 */
	public boolean eliminarEvento(Date fecha, EventosSociales nombreEvento){
		return false;
	}

	/**
	 * 
	 * @param fecha
	 */
	public EventosSociales buscarEventos(Date fecha){
		return null;
	}

	/**
	 * 
	 * @param fecha
	 * @param nombreCliente
	 */
	public boolean modificarEvento(Date fecha, String nombreCliente){
		return false;
	}

}