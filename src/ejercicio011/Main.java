package ejercicio011;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1=new Cliente("123","Pepe", "Juarez");
		c1.setCodigo("0001");
		c1.setTarjetaCredito(123456789);
		Cliente c2=new Cliente("000", "Maria", "Fernandez");
		
		Empresa e1=new Empresa("44444-4","empresita","Heroes de la concepcion");
		
		e1.getEmpleados().add(new Empleado("888", "Juanito", "ALVAREZ","abc","juanito@empresa.cl"));
		e1.getEmpleados().add(new Empleado("777-7", "Juanita", "alvarez"));
		
		ArrayList cli= new ArrayList<>();
		cli.add(c1);
		cli.add(c2);
		e1.setClientes(cli);
		System.out.println(e1.imprimir());
	}

}
