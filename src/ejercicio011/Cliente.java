package ejercicio011;

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
}
