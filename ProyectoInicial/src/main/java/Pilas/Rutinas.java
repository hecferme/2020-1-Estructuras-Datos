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
public class Rutinas 
{
    private Pila laPila;
    
    
    public Rutinas ()
    {
       this.laPila = new Pila(); 
    }
    
    public Dato Top ()
    {
        Dato elDato = null;
        if (this.laPila != null)
        {
            elDato = new Dato(this.laPila.GetTop().valor);
        }
        return elDato;
    }

    public Dato Pop ()
    {
        Dato elDato = laPila.SacarElemento();
        return elDato;
    }
    
    public void Push (int elDato)
    {
        // crear un elemento del tipo Dato utilizando el constructor con valor
        Dato elElemento = new Dato(elDato);
        laPila.SetTop(elElemento);
    }
    
    public boolean IsEmpty ()
    {
        boolean elResultado = (this.laPila.GetTop() == null);
        return elResultado;
    }

    public void EjecutarOperaciones() 
    {
        this.Push(20);
        this.Push(-18);
        this.Push(5);
        this.Push(14);
        this.Push(-645);
        this.Push(-200);
        this.laPila.ImprimirPila();
    }
    

}
