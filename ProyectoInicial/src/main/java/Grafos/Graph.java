/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos;

/**
 *
 * @author Administrator
 */
public class Graph {
      private int adjMatrix[][];
      private int numVertices;
 
      public Graph(int numVertices) {
          this.numVertices = numVertices;
          adjMatrix = new int[numVertices][numVertices];
    }
 
      public void addEdge(int i, int j, int value) {
        adjMatrix[i][j] = adjMatrix[j][i] = value;
    }
 
      public void removeEdge(int i, int j) {
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;
    }
 
      public boolean isEdge(int i, int j) {
                  return adjMatrix[i][j] == 0;
    }
    public String toStringDos() {
        /*
        (0, 1) --> 7
        (0, 2) --> 3
        (1, 0) --> 7
        (1, 2) --> 5  ....
        */

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            for (int j = 0; j < numVertices; j++) {
                if (! isEdge(i, j))
                    s.append ("(" + i + ", " + j + ") --> " + adjMatrix[i][j] + "; ");
            }
            s.append("\n");
        }
        return s.toString();
    }
      
      
    public String toStringUno() {
        /* Outputs
           0: 0 1 1 0 
           1: 1 0 1 0 
           2: 1 1 0 1 
           3: 0 0 1 0 
          */
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            for (int j : adjMatrix[i]) {
                s.append (j + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
    
    public String toString() {
        return toStringDos();
    }

    public static void main(String args[])
    {
        Graph g = new Graph(4);
 
        g.addEdge(0, 1, 7);
        g.addEdge(0, 2, 3);
        g.addEdge(1, 2, 5);
        g.addEdge(2, 0, 3);
        g.addEdge(2, 3, 4);
 
        System.out.print(g.toString());
    }

}
