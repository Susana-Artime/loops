package org.factoriaf5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Loops tabla = new Loops();
        int num=4;
        String [] tablaMultiplicar = tabla.generarTablaMultiplicar(num);

        for (String linea : tablaMultiplicar) {
            System.out.println(linea);
        }


    }
}
