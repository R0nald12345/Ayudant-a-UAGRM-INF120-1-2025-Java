package Negocio;

import java.awt.Color;
import java.awt.Graphics;

public class ClasePunto {
	
	//Atributos
	private int x;
	private int y;
	//Color
	private Color color;
	private int tamano;
	
	
	//Constructor
	public ClasePunto(int x, int y) {
		this.x= x;
		this.y= y;
		
		this.color = Color.RED;
		this.tamano = 10;
	}
	
	//metodos
	
	//Procedimiento 
	public void setX(int nuevoX) {
		this.x = nuevoX;
	}
	
	//Funcion
	public int getX() {
		return this.x;
	}
	
	//Procedimiento 
	public void setY(int nuevoY) {
		this.y = nuevoY;
	}
		
		//Funcion
	public int getY() {
		return this.y;
	}
	
	   public void setTamano(int nuevoTamano) {
	        this.tamano = nuevoTamano;
	    }
	    
	    public int getTamano() {
	        return this.tamano;
	    }
	
	//Procedimiento 
		public void setColor(Color nuevoColor) {
			this.color = nuevoColor;
		}
			
			//Funcion
		public Color getColor() {
			return this.color;
		}
	

	    // Método para dibujar el punto en un contexto gráfico
	    public void dibujar(Graphics g) {
	        // Guardar el color original
	        Color colorOriginal = g.getColor();
	        
	        // Establecer el color del punto
	        g.setColor(this.color);
	        
	        // Dibujar un círculo lleno en las coordenadas x,y
	        // El método fillOval requiere la esquina superior izquierda del rectángulo 
	        // que contiene el óvalo, por eso restamos tamano/2
	        g.fillOval(this.x - tamano/2, this.y - tamano/2, tamano, tamano);
	        
	        // Opcional: dibujar las coordenadas del punto
	        g.drawString("(" + this.x + "," + this.y + ")", this.x + tamano, this.y);
	        
	        // Restaurar el color original
	        g.setColor(colorOriginal);
	    }

	    // Método para mover el punto a nuevas coordenadas
	    public void mover(int nuevoX, int nuevoY) {
	        // Actualizar las coordenadas
	        this.x = nuevoX;
	        this.y = nuevoY;
	    }
	    
	    // Método para mover el punto relativamente (desplazamiento)
	    public void desplazar(int deltaX, int deltaY) {
	        // Sumar el desplazamiento a las coordenadas actuales
	        this.x += deltaX;
	        this.y += deltaY;
	    }
}
