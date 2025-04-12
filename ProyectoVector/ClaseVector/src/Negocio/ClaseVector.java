package Negocio;

public class ClaseVector {
	//Atributos
	private int dimension;
	private int[] vector;
	
	//constructor
	public ClaseVector() {
		this.dimension = -1;
		this.vector = new int[50];
	}
	
	public void insertarUltimo(int dato) {
		dimension++; //0
		this.vector[dimension] = dato;
	}
	
	public String mostrarVector() {
		String resultado = "|";
		for (int i= 0; i<=dimension; i++) {
			resultado = resultado + this.vector[i] + "|";
		}
		return resultado;
	}
	
	public int contarPares() {
		int contador = 0;
		for (int i= 0; i<=dimension; i++) {
			if(this.vector[i] % 2 == 0  ) {
				contador++;
			}
		}
		return contador;
	}
	
	
}
