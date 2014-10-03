package Modelo;

import java.util.Arrays;

/**
 * @author Lalo
 * @version 1.0
 * @created 19-sep-2014 01:19:26 p.m.
 */
public class Proveedor extends Persona {

	private Servicio provServicios[];


	/**
	 * 
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 * @param correo
	 * @param provServicio
	 */
	public Proveedor(int id,String nombre, String direccion, String telefono, String correo, Servicio[] provServicio){
            super(id,nombre,direccion,telefono,correo);
            this.provServicios=provServicio;
	}

    public Servicio[] getProvServicios() {
        return provServicios;
    }

    public void setProvServicios(Servicio[] provServicios) {
        this.provServicios = provServicios;
    }

    @Override
    public String toString() {
        return "Proveedor: "+super.toString() + "Servicios que provee:" + Arrays.toString(provServicios) + '}';
    }
        
        
        

}