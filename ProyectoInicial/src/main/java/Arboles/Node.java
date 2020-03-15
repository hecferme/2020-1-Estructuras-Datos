/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

/**
 *
 * @author Administrator
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author w w w. j a v a g i s t s . c o m
 *
 */
public class Node < T extends Comparable<T>>
{

    private T data;

    private Node left;
    private Node right;

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node(T data) {
            this.data = data;
    }

    public T getData() {
            return data;
    }

    public void setData(T data) {
            this.data = data;
    }
    
    public <T extends Comparable<T> > T smaller(T x, T y)
    {
        if(x.compareTo(y) <= 0)
            return x;
        else
            return y;
    }
}
