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
    private int ordenamientoId = 0;
    private int ordenamientoNombre = 1;
    Integer id;
    String nombre;
    Date fechaNacimiento;
    private Integer criterioOrdenamiento = ordenamientoNombre;
    
    private String toStringSinFechaDeNacimiento ()
    {
        String elResultado = String.format("Id:[%s] - Nombre:[%s]", 
                this.id.toString(), this.nombre);
        return elResultado;
    }
    
        private String toStringConFechaDeNacimiento ()
    {
        String elResultado = String.format("Id:[%s] - Nombre:[%s] - Fecha de nacimiento:[%s]", 
                this.id.toString(), this.nombre, this.fechaNacimiento.toString());
        return elResultado;
    }
        
    @Override public String toString ()
    {
        String elResultado = toStringSinFechaDeNacimiento();
        return elResultado;
    }
    
    private int compareToNombre(Nodo nodo)
                {
                int resultado = nombre.compareTo(nodo.nombre);
                return resultado;
            }

    private int compareToId(Nodo nodo)
                {
                int resultado = id.compareTo(nodo.id);
                return resultado;
            }

    
    @Override public int compareTo(Nodo nodo)
            {
                int resultado = 0;
                if (criterioOrdenamiento == ordenamientoId)
                    resultado = compareToId(nodo);
                if (criterioOrdenamiento == ordenamientoNombre)
                    resultado = compareToNombre(nodo);
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
