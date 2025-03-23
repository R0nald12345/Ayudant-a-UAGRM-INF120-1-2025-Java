package Negocio;

public class Numero {
	
	//atributos
	private int valorNumerico;
	
	//Constructor
	public Numero() {
		this.valorNumerico = 0;
	}
	
	//Metdos//Procedimiento y Funciones
	//Get ==> Funciones
	//set ==> procedimiento
	
	
	//funcion
	public int obtenerDato() {
		return this.valorNumerico;
	}
	
	//Procedimiento
	public void cambiarDato(int datoNuevo ) {
		this.valorNumerico = datoNuevo;
	}
	
}
