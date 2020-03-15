/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

/**
 *
 * @author Administrator
 * @param <T>
 */
public class TreeImplementation < T extends Comparable<T>> 
{
   
    Node <T> root;

    public void add(Comparable<T>  value) {
        root = add(root, value);
    }

    private Node add(Node<T> current, Comparable<T> value) {

        if (current == null) 
        {
            return new Node(value);
        }

        if (value.compareTo(current.getData()) < 0) 
        {
            current.setLeft(add(current.getLeft(), value));
        } 
        else 
        {
            if (value.compareTo(current.getData()) > 0) 
            {
            current.setRight(add(current.getRight(), value));
            }
        }
        return current;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getSize() {
        return getSize(root);
    }

    private int getSize(Node current) 
    {
        return (current == null) ? 0 : 
                getSize(current.getLeft()) + 1 + 
                getSize(current.getRight());
    }

    public boolean containsNode(T value) 
    {
        return containsNode(root, value);
    }

    private boolean containsNode(Node<T> current, Comparable<T> value) 
    {
        if (current == null) {
            return false;
        }

        if (value.compareTo(current.getData()) == 0) {
            return true;
        }

        return (value.compareTo(current.getData()) < 0)
                ? containsNode(current.getLeft(), value)
                : containsNode(current.getRight(), value);
    }

    public void delete(T value) {
        root = delete(root, value);
    }

    private Node delete(Node<T> current, Comparable <T> value) {
        if (current == null) {
            return null;
        }

        if (value.compareTo(current.getData()) == 0) {
            // No children
            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }

            // Only 1 child
            if (current.getRight() == null) {
                return current.getLeft();
            }
            if (current.getLeft() == null) {
                return current.getRight();
            }

            // Two children
            T smallestValue = findSmallestValue(current.getRight());
            current.setData(smallestValue);
            current.setRight(delete(current.getRight(), smallestValue));
            return current;
        }
        if (value.compareTo(current.getData()) < 0) {
            current.setLeft(delete(current.getLeft(), value));
            return current;
        }

        current.setRight(delete(current.getRight(), value));
        return current;
    }

    private T findSmallestValue(Node root) {
        if (root.getLeft() == null)
            return ((T) root.getData());
        else  
            return (findSmallestValue(root.getLeft()));
    }
    
    public String inOrderTraversal(Character delimiter) {
        return inOrderTraversal(root, delimiter);
    }

    private String inOrderTraversal(Node node, Character delimiter) {
        String elResultado = "";
        if (node != null) {
            elResultado += inOrderTraversal(node.getLeft(), delimiter);
            elResultado += (node.getData().toString());
            elResultado += delimiter;
            elResultado += inOrderTraversal(node.getRight(), delimiter);
        }
        return elResultado;
    }

    public String preOrderTraversal(Character delimiter) {
        return preOrderTraversal(root, delimiter);
    }

    private String preOrderTraversal(Node node, Character delimiter) {
        String elResultado = "";
        if (node != null) {
            elResultado += (node.getData().toString());
            elResultado += delimiter;
            elResultado += preOrderTraversal(node.getLeft(), delimiter);
            elResultado += preOrderTraversal(node.getRight(), delimiter);
        }
        return elResultado;
    }

    public String postOrderTraversal(Character delimiter) {
        return postOrderTraversal(root, delimiter);
    }

    private String postOrderTraversal(Node node, Character delimiter) {
        String elResultado = "";
        if (node != null) {
            elResultado += postOrderTraversal(node.getLeft(), delimiter);
            elResultado += postOrderTraversal(node.getRight(), delimiter);
            elResultado += (node.getData().toString());
            elResultado += delimiter;
        }
        return elResultado;
    }
}
