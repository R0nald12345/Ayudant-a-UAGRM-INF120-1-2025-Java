package Negocio;

import static java.time.Clock.system;



//Tipos de datos
    //double 
    

public class PracticaGeneral {
    
    //Procedimiento
    public static void ejercicio1(){
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
    
    //Funcion
    public static double ejercicio17(double gradoCelsius){
        double resultadoParentesis = gradoCelsius * 9/5;
        return resultadoParentesis + 32;
    }
    
    //x es el sueldo que gana el trabajador
    public static void ejercicio23(double x){
        
        double sueldoNeto = 0;
        double descuentoTotal = 0;
        
        if(x<= 1000 ){
            descuentoTotal = x * 0.10;
            sueldoNeto = x - descuentoTotal;
        }
        
        //x = 1500
        if(x > 1000 && x <=2000 ){
            
            //adicional = 500
            double adicional = x - 1000; 
            //ahora saco el 5% de 500
            descuentoTotal = adicional * 0.05;
            sueldoNeto = x - descuentoTotal;
        }
        
        if(x > 2000){
            double adicional = x - 2000;
            descuentoTotal = adicional * 0.03;
            sueldoNeto = x - descuentoTotal;
        }
        
        System.out.println("El trabajador gana: " + x);
        System.out.println("Sueldo Neto: "+ sueldoNeto);
        System.out.println("decuento Total: " + descuentoTotal);
    } 
    
    public static int ejercicio21(int a, int b){
        //12
        int residuo = a % b;
        
        //6, 0
        while(residuo!= 0 ){
            a = b;
            b= residuo;
            residuo = a % b;
        }
        return b;
    }
    
    public static void main(String[] args) {
        ejercicio1();
  
         
        System.out.println(ejercicio17(20) + "°F");
        System.out.println(ejercicio17(30) + "°F");
        
        ejercicio23(2000);
        
        System.out.println("MDC: " + ejercicio21(200, 150));
        
    }
           
    
    
}
