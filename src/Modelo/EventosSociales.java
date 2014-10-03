package Modelo;

import java.util.Date;

/**
 * @author Lalo
 * @version 1.0
 * @created 19-sep-2014 01:34:14 p.m.
 */
public class EventosSociales {

	private Cliente evtCliente;
	private Date evtFecha;
	private Mesa_de_dulces evtMesaDeDulces;
	private Paquete evtPaquete;
	private float evtPrecioTotal;
	private float evtComision;
	
	public EventosSociales(){

	}


	public float getPrecioTotal(){
            float precioEvt=evtPaquete.getPrecio()+evtMesaDeDulces.getPrecio();
            float comisionEvt = (float) 0.15*precioEvt;
		return (float) comisionEvt + precioEvt;
	}
        
        /*puede que esta no sirva.*/
	public void setPrecioTotal(float precio){

	}

}