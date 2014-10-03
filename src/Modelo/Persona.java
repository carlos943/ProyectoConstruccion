package Modelo;

/**
 * @author Lalo
 * @version 1.0
 * @created 
 * 19-sep-2014 01:13:33 p.m.
 */
public class Persona {
        private int idPersona;
	private String nombrePersona;
	private String direccionPersona;
	private String telefonoPersona;
	private String correoPersona;
	/**
	 * 
	 * @param telefono
	 * @param nombre
	 * @param direccion
	 * @param correo
	 */
	public Persona(int id, String nombre, String direccion, String telefono, String correo){
            this.idPersona=id;
            this.nombrePersona=nombre;
            this.direccionPersona=direccion;
            this.telefonoPersona=telefono;
            this.correoPersona=correo;
	}

    public int getIdPersona() {
        return idPersona;
    }
    
    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setIdPersona(int perId) {
        this.idPersona = perId;
    }
    
    public void setNombrePersona(String perNombre) {
        this.nombrePersona = perNombre;
    }

    public void setDireccionPersona(String perDireccion) {
        this.direccionPersona = perDireccion;
    }

    public void setTelefonoPersona(String perTelefono) {
        this.telefonoPersona = perTelefono;
    }

    public void setCorreoPersona(String perCorreo) {
        this.correoPersona = perCorreo;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombrePersona + "Direccion:" + direccionPersona  + telefonoPersona + correoPersona ;
    }
        

}