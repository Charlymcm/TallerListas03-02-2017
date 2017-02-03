package estructuras;

public class Aplicacion {
	public static void main(String[] args) throws Exception {

		Lista lista = new Lista();

		System.out.println("Lista de Compras\n");

		lista.agregarAlInicio("Tomate de Árbol",5,"Listo");			// Agregar al inicio de la lista	
		lista.agregarAlFinal("Aguacate",3,"No Listo");				// Agregar al final de la lista
		lista.agregarAlFinal("Piña",2,"No Listo");
		lista.agregarAlFinal("Limón",10,"Listo");
		lista.agregarAlFinal("Tomate Riñon",6,"Listo");
		lista.agregarAlFinal("Queso",10,"No Listo");						
		lista.agregarAlFinal("Yogurt",1,"Listo");	
		lista.agregarAlFinal("Duraznos Enlatados",5,"Listo");	
		lista.agregarAlFinal("Apio",12,"No Listo");	
		lista.agregarAlFinal("Zumo de Naranja",7,"No Listo");	

		lista.listar();												// Imprimir la lista
		
		System.out.println("\n");
		System.out.println(lista.buscar("Listo"));					//Busqueda
	}   
}