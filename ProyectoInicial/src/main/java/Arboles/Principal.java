/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

import java.util.Date;
import ListaGenerica.Nodo;

/**
 *
 * @author Administrator
 */
public class Principal {
    
    public static void procesarInteger()
    {
        /* Start with the empty list */
        TreeImplementation<Integer> tree = new TreeImplementation<>(); 

        // Insert 6. So tree becomes NULL <-- 6 --> NULL 
        tree.add(6); 
        // Insert 7. So tree becomes NULL <-- 6 --> (7)
        tree.add(7); 
        // Insert 1. So tree becomes (1) <-- (6) --> (7) 
        tree.add(1); 
        // Insert 4. So tree becomes [(1) --> (4)] <-- (6) --> (7)
        tree.add(4); 
        // Insert 8. So tree becomes [(1) --> (4)] <-- (6) --> [(7) --> (8)]
        tree.add(8); 

        System.out.println("Created Tree is: "); 
        System.out.println("Traversal in pre-order direction: " + 
            tree.preOrderTraversal(' '));     
        System.out.println("Traversal in order direction: " + 
            tree.inOrderTraversal(' '));     
        System.out.println("Traversal in post-order direction: " + 
            tree.postOrderTraversal(' ')); 
    }
    
    public static void procesarNodo()
    {
        /* Start with the empty list */
        var tree = new TreeImplementation<Nodo>(); 

        tree.add(new Nodo(68, "Puriscal", new Date()));
        tree.add(new Nodo(60, "Héctor", new Date()));
        tree.add(new Nodo(68, "Moravia", new Date()));
        tree.add(new Nodo(44, "Fernandez", new Date()));
        tree.add(new Nodo(53, "Mendez", new Date()));
        tree.add(new Nodo(22, "Zapote", new Date()));

        System.out.println("Created Tree is: "); 
        System.out.println("Traversal in pre-order direction: " + 
            tree.preOrderTraversal(' '));     
        System.out.println("Traversal in order direction: " + 
            tree.inOrderTraversal(' '));     
        System.out.println("Traversal in post-order direction: " + 
            tree.postOrderTraversal(' '));       
    }
    
	/* Drier program to test above functions*/
	public static void main(String[] args) 
	{ 
            procesarInteger();
            procesarNodo();
	} 
} 

// This code is contributed by Sumit Ghosh 

