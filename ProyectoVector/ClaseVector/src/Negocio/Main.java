package Negocio;

public class Main {
	
	public static void main(String[] args) {
		
		ClaseVector objetoVector = new ClaseVector();
		objetoVector.insertarUltimo(10);
		objetoVector.insertarUltimo(3);
		objetoVector.insertarUltimo(4);
		objetoVector.insertarUltimo(9);
		objetoVector.insertarUltimo(12);
		objetoVector.insertarUltimo(4);
		
		System.out.println(objetoVector.mostrarVector() );
		
		System.out.println("la cantidad de Numeros Pares son: " +objetoVector.contarPares()  );
		
		
	}
}
