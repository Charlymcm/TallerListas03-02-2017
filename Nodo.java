package estructuras;

public class Nodo {
	private String valor;			// Variable en la cual se va a guardar el valor.
	private int cantidad;
	private String disponibilidad;
	private Nodo siguiente;			// Variable para enlazar los nodos.
	/**
	 * Constructor que inicializamos el valor de las variables.
	 */
	public void Nodo(){
		this.valor = "";
		this.siguiente = null;
	}

	// Métodos get y set para los atributos.
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}