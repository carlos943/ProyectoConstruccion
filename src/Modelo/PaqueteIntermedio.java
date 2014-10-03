package Modelo;

/**
 * @author Lalo
 * @version 1.0
 * @created 19-sep-2014 01:28:40 p.m.
 */
public class PaqueteIntermedio extends PaqueteBasico {

	private Servicio servCarpa;

    public PaqueteIntermedio(Servicio ServBanquetera, Servicio servIluminacion,float precio, Servicio servCarpa) {
        super(ServBanquetera, servIluminacion,precio);
        this.servCarpa = servCarpa;
    }


        @Override
	public float getPrecio(){
            return this.precio;
	}

        @Override
	public void setPrecio(float precio){

	}

}