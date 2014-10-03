package Modelo;

/**
 * @author Lalo
 * @version 1.0
 * @created 19-sep-2014 01:15:46 p.m.
 */
public class Empleado extends Persona {

	private float empDesempenio;
	private float empSueldo;
	/**
	 * 
	 * @param telefono
	 * @param nombre
	 * @param direccion
	 * @param correo
     * @param desempenio
	 */
	public Empleado(int id,String nombre, String direccion,String telefono, String correo, float desempenio, float sueldo){
            super(id,nombre,direccion,telefono,correo);
            this.empDesempenio=desempenio;
            this.empSueldo=sueldo;
            
	}

    public float getEmpDesempenio() {
        return empDesempenio;
    }

    public float getEmpSueldo() {
        return empSueldo;
    }

    public void setEmpDesempenio(float empDesempenio) {
        this.empDesempenio = empDesempenio;
    }

    public void setEmpSueldo(float empSueldo) {
        this.empSueldo = empSueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString()+" empDesempenio=" + empDesempenio + ", empSueldo=" + empSueldo + '}';
    }
        
        
        

}