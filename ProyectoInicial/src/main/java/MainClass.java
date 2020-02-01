
import Pilas.Rutinas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB01
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DoJobPilas();
    }

    private static void DoJobRecursividad() {
        
        RecursividadEjemploUno ejemploRecursivo = 
                new RecursividadEjemploUno ();
        ejemploRecursivo.EjecutarEjemploUno();
    }
    
    private static void DoJobPilas() {
        
        Rutinas ejemploPilas = 
                new Rutinas ();
        ejemploPilas.EjecutarOperaciones();
    }
    
}
