package Modelo;

/**
 * @author Lalo
 * @version 1.0
 * @created 19-sep-2014 01:30:27 p.m.
 */
public class PaqueteCompleto extends PaqueteIntermedio {

    private Servicio servLugar;
    private Servicio servMusica;

    public PaqueteCompleto(Servicio ServBanquetera, Servicio servIluminacion, float precio, Servicio servCarpa,
            Servicio servLugar, Servicio servMusica) {
        super(ServBanquetera, servIluminacion, precio, servCarpa);
        this.servLugar = servLugar;
        this.servMusica = servMusica;
    }

    @Override
    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio() {

    }

}
