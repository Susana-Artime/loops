package org.factoriaf5;

public class Loops {

    public String[] generarTablaMultiplicar(int n) {
        
        String[] tabla = new String[10];
       
        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            
            tabla[i - 1] = n + " x " + i + " = " + resultado;
        }

        
        return tabla;
    }

}

    

