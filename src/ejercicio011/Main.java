package ejercicio011;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Cliente c1=new Cliente("123","Pepe", "Juarez");
		Cliente c2=new Cliente("000", "Maria", "Fernandez");
		
		Empresa e1=new Empresa("44444-4","empresita","Heroes de la concepcion", new ArrayList<Cliente>());
		
		Empleado emp1=new Empleado("888", "Juanito", "ALVAREZ");
		if(emp1.agregar(e1)){
			System.out.println("Empleado Agregado Exitosamente");
		}else{
			System.out.println("Empleado no se pudo Agregar");
		}
		Empleado emp2=new Empleado("4545", "Alicia", "Ramirez");	
		if(emp2.agregar(e1)){
			System.out.println("Empleado Agregado Exitosamente");
		}else{
			System.out.println("Empleado no se pudo Agregar");
		}
		
		Empleado emp3=new Empleado("4545", "Lisa", "Condori","0003","lisa@empresa.cl");
		if(emp3.modificar(e1)){
			System.out.println("Empleado Modificado Exitosamente");
		}else{
			System.out.println("Empleado no se pudo Modificar");
		}

		Empleado emp4=new Empleado("888");
		if(emp4.eliminar(e1)){
			System.out.println("Empleado Eliminado Exitosamente");
		}else{
			System.out.println("Empleado no se pudo Eliminar");
		}
		Empleado emp5=new Empleado("4545");
		if(emp5.buscar(e1)){
			System.out.println(emp5.imprimir());
		}else{
			System.out.println("Empleado no se encontro en nuestros registros");
		}
		
		
		if(c1.agregar(e1)){
			System.out.println("Cliente Agregado Exitosamente");
		}else{
			System.out.println("Cliente no se pudo Agregar");
		}
		if(c2.agregar(e1)){
			System.out.println("Cliente Agregado Exitosamente");
		}else{
			System.out.println("Cliente no se pudo Agregar");
		}
		Cliente c3 =new Cliente("123", "Pepe","Juarez", "0001",55555555);
		if(c3.modificar(e1)){
			System.out.println("Cliente se ha modificado Exitosamente");
		}else{
			System.out.println("Cliente no se encontro en nuestros registros");
		}
		Cliente c4=new Cliente("0011");
		if(c4.eliminar(e1)){
			System.out.println("Cliente se ha eliminado Exitosamente");
		}else{
			System.out.println("Cliente no se encontro en nuestros registros");
		}
		Cliente c5=new Cliente ("123");
		if(c5.buscar(e1)){
			System.out.println(c5.imprimir());
		}else{
			System.out.println("Cliente no se encontro en nuestros registros");
		}
		
		System.out.println("\n"+e1.imprimir());	
		
	}

}
