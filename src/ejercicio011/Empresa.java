package ejercicio011;

import java.util.ArrayList;

public class Empresa {
	private String rol;
	private String nombre;
	private String direccion;
	private ArrayList<Cliente> clientes;
	private ArrayList<Empleado> empleados;
	/**
	 * @param rol
	 * @param nombre
	 * @param direccion
	 * @param clientes
	 */
	public Empresa(String rol, String nombre, String direccion, ArrayList<Cliente> clientes) {
		this.rol = rol;
		this.nombre = nombre;
		this.direccion = direccion;
		this.clientes=clientes;
		this.empleados = new ArrayList<Empleado>();
	}

	/**
	 * 
	 */
	public Empresa() {
		this.empleados = new ArrayList<Empleado>();
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public String imprimir(){
		String msj;
		msj= "La empresa con rol: "+this.rol+
				" y nombre: "+this.nombre+
				" tiene la direccion: "+this.direccion;
		msj+="\nCon los siguientes Clientes: ";
				for (Cliente cliente : clientes) {
					msj+="\n\t"+cliente.imprimir();
				}
		msj+="\nCon los siguients Empleados: ";
				for (int i = 0; i < this.empleados.size(); i++) {
					msj+="\n\t"+this.empleados.get(i).imprimir();
				}
		return msj;	
		
	}
	
	
}
