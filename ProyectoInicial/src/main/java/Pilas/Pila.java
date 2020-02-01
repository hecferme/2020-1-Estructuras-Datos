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
public class Pila {
    private Dato top;
    
    public Pila ()
    {
        this.top = null;
    }
    
    public Pila (int elNumero)
    {
        // crear un elemento del tipo Dato utilizando el constructor con valor
        Dato elElemento = new Dato(elNumero);
        // lo asigno al tope de la  pila
        this.top = elElemento;        
    }
    
    public Dato GetTop ()
    {
        return (this.top);
    }
    public void SetTop (Dato elDato)
    {
       Dato temporal = this.GetTop();
       elDato.abajo = temporal;
       this.top = elDato;
    }

    public Dato SacarElemento() {
       Dato elElementoParaDevolver = null;
       if (this.top != null)
       {
          elElementoParaDevolver = this.GetTop();
          this.top = this.top.abajo;
          elElementoParaDevolver.abajo = null;
       }
       return (elElementoParaDevolver);
     }
}
