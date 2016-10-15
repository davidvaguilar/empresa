package ejercicio011;

import java.util.ArrayList;

public final class Cliente extends Persona {
	private String codigo;
	private Integer tarjetaCredito;
	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param codigo
	 * @param tarjetaCredito
	 */
	public Cliente(String rut, String nombre, String apellido, String codigo, Integer tarjetaCredito) {
		super(rut, nombre, apellido);
		this.codigo = codigo;
		this.tarjetaCredito = tarjetaCredito;
	}
	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 */
	public Cliente(String rut, String nombre, String apellido) {
		super(rut, nombre, apellido);
	}
	
	
	/**
	 * @param rut
	 */
	public Cliente(String rut) {
		super(rut);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getTarjetaCredito() {
		return tarjetaCredito;
	}
	public void setTarjetaCredito(Integer tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	@Override
	public String imprimir(){
		return super.imprimir()+
				" El cliente tiene codigo: "+this.codigo+
				" con la tarjeta de credito: "+this.tarjetaCredito;
	}
	
	public boolean agregar(Empresa e){
		ArrayList<Cliente> listaCliente=e.getClientes();
		listaCliente.add(this);
		return true;
	}
	
	public boolean modificar(Empresa e){
		ArrayList<Cliente> listaCliente = e.getClientes();
		for (int i = 0; i < listaCliente.size(); i++) {
			if(this.rut.equals(listaCliente.get(i).getRut())){
				listaCliente.get(i).setNombre(this.nombre);
				listaCliente.get(i).setApellido(this.apellido);
				listaCliente.get(i).setTarjetaCredito(this.tarjetaCredito);
				listaCliente.get(i).setCodigo(this.codigo);
				return true;
			}
		}
		return false;
	}
	
	public boolean eliminar (Empresa e){
		ArrayList<Cliente> listaCliente = e.getClientes();
		for (int i = 0; i < listaCliente.size(); i++) {
			if(this.rut.equals(listaCliente.get(i).getRut())){
				listaCliente.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean buscar (Empresa e){
		ArrayList<Cliente> listaCliente = e.getClientes();
		for (int i = 0; i < listaCliente.size(); i++) {
			if(this.rut.equals(listaCliente.get(i).getRut())){
				this.nombre=listaCliente.get(i).getNombre();
				this.apellido=listaCliente.get(i).getApellido();
				this.codigo=listaCliente.get(i).getCodigo();
				this.tarjetaCredito=listaCliente.get(i).getTarjetaCredito();
				return true;
			}
		}
		return false;
	}
}
