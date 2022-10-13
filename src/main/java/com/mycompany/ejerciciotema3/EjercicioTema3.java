package com.mycompany.ejerciciotema3;

public class EjercicioTema3 {

    public static void main(String[] args) {
        
        //Primera parte
        int resultadoSuma;
        
        resultadoSuma = sumaDeTres(30, 23, 9);
       
       
        //Segunda parte del ejercicio
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        
        System.out.println("miCoche tiene " + miCoche.numeroDePuertas + " puertas");
    }
    
    public static int sumaDeTres(int a, int b, int c){
        return a + b + c;
    }
}

class Coche{
    int numeroDePuertas = 0;
    
    public void agregarPuerta(){
        this.numeroDePuertas++;
    }
}
