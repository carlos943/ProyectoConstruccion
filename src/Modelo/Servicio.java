package Modelo;

/**
 * @author Lalo
 * @version 1.0
 * @created 19-sep-2014 01:21:37 p.m.
 */
public class Servicio {

	private String servNombre;
	private Proveedor provedoresQueBrindanServicio[];	
        private float costo;
        
    public Servicio(String nombre, float costo){
    this.servNombre = nombre;
    this.costo = costo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    public String getServNombre() {
        return servNombre;
    }


    public Proveedor[] getProvedoresQueBrindanServicio() {
        return provedoresQueBrindanServicio;
    }

    public void setServNombre(String servNombre) {
        this.servNombre = servNombre;
    }


    public void setProvedoresQueBrindanServicio(Proveedor[] provedoresQueBrindanServicio) {
        this.provedoresQueBrindanServicio = provedoresQueBrindanServicio;
    }

    @Override
    public String toString() {
        return "Servicio{" + "servNombre=" + servNombre + ", provedoresQueBrindanServicio=" + provedoresQueBrindanServicio + '}';
    }


}