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
    public int valor;
    public Dato abajo;
    
    public Dato ()
    {
        this.valor = 0;
        this.abajo = null;
    }
    public Dato (int elValor)
    {
        this.valor = elValor;
        this.abajo = null;
    }
}
