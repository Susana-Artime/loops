package org.factoriaf5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoopsTest {

    Loops loops = new Loops();

    @Test
    public void testGenerarTablaMultiplicar() {

        int n = 5;
        
        
        String[] resultadoEsperado = {
            "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50"
        };

        String[] resultadoObtenido = loops.generarTablaMultiplicar(n);        
        
        assertArrayEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testGenerarTablaMultiplicarCero() {

        int n = 0;
        
        String[] resultadoEsperado = {
            "0 x 1 = 0",
            "0 x 2 = 0",
            "0 x 3 = 0",
            "0 x 4 = 0",
            "0 x 5 = 0",
            "0 x 6 = 0",
            "0 x 7 = 0",
            "0 x 8 = 0",
            "0 x 9 = 0",
            "0 x 10 = 0"
        };

        String[] resultadoObtenido = loops.generarTablaMultiplicar(n);        
        
        assertArrayEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testGenerarTablaMultiplicarNegativo() {

        int n = -3;
        
       
        String[] resultadoEsperado = {
            "-3 x 1 = -3",
            "-3 x 2 = -6",
            "-3 x 3 = -9",
            "-3 x 4 = -12",
            "-3 x 5 = -15",
            "-3 x 6 = -18",
            "-3 x 7 = -21",
            "-3 x 8 = -24",
            "-3 x 9 = -27",
            "-3 x 10 = -30"
        };

        String[] resultadoObtenido = loops.generarTablaMultiplicar(n);        
        
        assertArrayEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testGenerarTablaMultiplicarGrande() {

        int n = 100;
        
        
        String[] resultadoEsperado = {
            "100 x 1 = 100",
            "100 x 2 = 200",
            "100 x 3 = 300",
            "100 x 4 = 400",
            "100 x 5 = 500",
            "100 x 6 = 600",
            "100 x 7 = 700",
            "100 x 8 = 800",
            "100 x 9 = 900",
            "100 x 10 = 1000"
        };

        String[] resultadoObtenido = loops.generarTablaMultiplicar(n);        
        
        assertArrayEquals(resultadoEsperado, resultadoObtenido);
    }


    
    
}
