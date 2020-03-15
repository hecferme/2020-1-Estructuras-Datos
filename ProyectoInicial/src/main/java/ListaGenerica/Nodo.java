/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaGenerica;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Nodo implements Comparable<Nodo>
{
    Integer id;
    String nombre;
    Date fechaNacimiento;
    @Override public String toString ()
    {
        String elResultado = String.format("Id:[{0}] - Nombre:[{1}] - Fecha de nacimiento:[{2}]", 
                this.id.toString(), this.nombre, this.fechaNacimiento.toString());
        return elResultado;
    }
    
    @Override public int compareTo(Nodo nodo)
            {
                int resultado = 0;
                if (this.id < nodo.id)
                    resultado = -1;
                else if (this.id > nodo.id)
                    resultado = 1;
                return resultado;
            }
    public Nodo ()
    {
        
    }
    public Nodo (int id, String nombre, Date fechaNacimiento)
    {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
}
