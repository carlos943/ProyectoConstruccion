package Modelo;

/**
 * @author Lalo
 * @version 1.0
 * @created 19-sep-2014 01:26:22 p.m.
 */
public class PaqueteBasico extends Paquete {

	private Servicio ServBanquetera;
	private Servicio servIluminacion;
	

    public PaqueteBasico(Servicio ServBanquetera, Servicio servIluminacion, float precio) {
        this.ServBanquetera = ServBanquetera;
        this.servIluminacion = servIluminacion;
        this.precio=precio;
    }

	


        @Override
	public float getPrecio(){
            return this.precio;
	}

        @Override
	public void setPrecio(float precio){

	}

}