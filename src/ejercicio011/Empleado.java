package ejercicio011;

import java.util.ArrayList;

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
	
	
	/**
	 * @param rut
	 */
	public Empleado(String rut) {
		super(rut);
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
	
	public boolean agregar(Empresa e){
		e.getEmpleados().add(this);
		return true;
	}
	
	public boolean modificar(Empresa e){
		for (int i = 0; i < e.getEmpleados().size(); i++) {
			if(this.rut.equals(e.getEmpleados().get(i).getRut())){
				e.getEmpleados().get(i).setNombre(this.nombre);
				e.getEmpleados().get(i).setApellido(this.apellido);
				e.getEmpleados().get(i).setCorreoInstitucional(this.correoInstitucional);
				e.getEmpleados().get(i).setCodigo(this.codigo);
				return true;
			}
		}
		return false;
	}
	
	public boolean eliminar (Empresa e){
		for (int i = 0; i < e.getEmpleados().size(); i++) {
			if(this.rut.equals(e.getEmpleados().get(i).getRut())){
				e.getEmpleados().remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean buscar (Empresa e){
		for (int i = 0; i < e.getEmpleados().size(); i++) {
			if(this.rut.equals(e.getEmpleados().get(i).getRut())){
				this.nombre=e.getEmpleados().get(i).getNombre();
				this.apellido=e.getEmpleados().get(i).getApellido();
				this.codigo=e.getEmpleados().get(i).getCodigo();
				this.correoInstitucional=e.getEmpleados().get(i).getCorreoInstitucional();
				return true;
			}
		}
		return false;
	}
	
}
