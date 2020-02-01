/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author LAB01
 */
public class Dato {
    private int valor;
    private Dato abajo;
    
    public Dato ()
    {
        
    }
    public Dato (int elValor)
    {
        this.valor = elValor;
        this.abajo = null;
    }
}
