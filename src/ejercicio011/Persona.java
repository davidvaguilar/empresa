package ejercicio011;

public abstract class Persona {

	protected String rut;
	protected String nombre;
	protected String apellido;
	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 */
	public Persona(String rut, String nombre, String apellido) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	/**
	 * 
	 */
	public Persona() {
	}
	
	
	/**
	 * @param rut
	 */
	public Persona(String rut) {
		this.rut = rut;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String imprimir(){
		return "El rut de la persona es: "+this.rut+
				" y su nombre: "+this.nombre+" "+this.apellido;
	}
	
}
