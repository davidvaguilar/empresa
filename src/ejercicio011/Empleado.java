package ejercicio011;

public class Empleado extends Persona{

	private String codigo;
	private String correoInstitucional;
	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param codigo
	 * @param correoInstitucional
	 */
	public Empleado(String rut, String nombre, String apellido, String codigo, String correoInstitucional) {
		super(rut, nombre, apellido);
		this.codigo = codigo;
		this.correoInstitucional = correoInstitucional;
	}
	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 */
	public Empleado(String rut, String nombre, String apellido) {
		super(rut, nombre, apellido);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCorreoInstitucional() {
		return correoInstitucional;
	}
	public void setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = correoInstitucional;
	}
	
	@Override
	public String imprimir(){
		return super.imprimir()+
				" como empleado tiene el codigo: "+this.codigo+
				" con el correo Institucional: "+this.correoInstitucional;
	}
	
	
}
