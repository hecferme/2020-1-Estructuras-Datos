/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB01
 */
public class RecursividadEjemploUno {
    
    private String CapturarString(){
        String laHilera = "Hello world";
        return (laHilera);     
    }
    
    private int LargoDeLaHilera (String laHilera)
    {
        return laHilera.length();
    }
    
    private void ImprimirDeDerechaAIzquierda(
            String laHilera, int elLargoDeLaHilera)
    {
        ImprimirRecursivo(laHilera, 0, 
                elLargoDeLaHilera - 1);
            }
    
    private void ImprimirRecursivo (
            String laHilera, int laPosicionActual, 
            int elLargoDeLaHilera)
    {
        if (laPosicionActual == elLargoDeLaHilera)
        {
            ImprimirCaracter (laHilera, 
                    laPosicionActual);
        }
        else
        {
            ImprimirRecursivo(laHilera, 
                    laPosicionActual + 1, 
                    elLargoDeLaHilera);
            ImprimirCaracter(laHilera, 
                    laPosicionActual);
        }
        
    }
    
    public void EjecutarEjemploUno ()
    {
        String laHilera = CapturarString ();
        int elLargoDeLaHilera = LargoDeLaHilera
                    (laHilera);
        ImprimirDeDerechaAIzquierda (laHilera, 
                elLargoDeLaHilera);
        
    }

    private void ImprimirCaracter(String laHilera, int laPosicionActual) {
        System.out.print(
                laHilera.charAt(laPosicionActual));
    }

}
