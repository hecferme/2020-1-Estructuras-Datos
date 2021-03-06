/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaGenerica;

/**
 *
 * @author Administrator
 */
public class DoublyLinkedList <T>{
    //Taken from https://www.geeksforgeeks.org/doubly-linked-list/
    // A complete working Java program to demonstrate all 

	Node  head; // head of list 
        Node  tail; // tail of the list

	/* Doubly Linked list Node*/
	//abstract 
        class Node < T extends Comparable<T>>
                { 
		Comparable<T> data; 
		Node prev; 
		Node next; 

		// Constructor to create a new node 
		// next and prev is by default initialized as null 
		Node(Comparable<T> d) { data = d; }

        }
        public <T extends Comparable<T> > T smaller(T x, T y)
        {
            if(x.compareTo(y) <= 0)
                return x;
            else
                return y;
        }    

        public void InsertOrdered (Comparable<T> new_data)
        {
                // empty list or first node
                if (head == null || head.data.compareTo(new_data) > 0)
                    push (new_data);
                else
                {
                    // search from second position
                    Node aux = head.next;
                    while (aux != tail && aux.data.compareTo(new_data) < 0)
                    {
                        aux = aux.next;
                    }
                    InsertAfter(aux, new_data);
                }            
        }
        
	// Adding a node at the front of the list 
	public void push(Comparable<T> new_data) 
	{ 
		/* 1. allocate node 
		* 2. put in the data */
		Node new_Node = new Node(new_data); 

		/* 3. Make next of new node as head and previous as NULL */
		new_Node.next = head; 
		new_Node.prev = null; 

		/* 4. change prev of head node to new node */
		if (head != null) {
			head.prev = new_Node; 
                }
                else
                    tail = new_Node;

		/* 5. move the head to point to the new node */
		head = new_Node; 
	} 
	/* Given a node as prev_node, insert a new node after the given node */
	public void InsertAfter(Node prev_Node, Comparable<T> new_data) throws NullPointerException
	{ 
		/*1. check if the given prev_node is NULL */
		if (prev_Node == null) { 
			throw new NullPointerException("The given previous node cannot be NULL");
		} 

		/* 2. allocate node 
		* 3. put in the data */
		Node new_node = new Node(new_data); 

                // 3.5 check if it is the node node
                if (prev_Node == tail)
                    tail = new_node;

                /* 4. Make next of new node as next of prev_node */
		new_node.next = prev_Node.next; 

		/* 5. Make the next of prev_node as new_node */
		prev_Node.next = new_node; 

		/* 6. Make prev_node as previous of new_node */
		new_node.prev = prev_Node; 

		/* 7. Change previous of new_node's next node */
		if (new_node.next != null) 
			new_node.next.prev = new_node; 
	} 

	// Add a node at the end of the list 
	public void append(Comparable<T> new_data) 
	{ 
		/* 1. allocate node 
		* 2. put in the data */
		Node new_node = new Node(new_data); 

		Node last = head; /* used in step 5*/

		/* 3. This new node is going to be the node node, so 
		* make next of it as NULL*/
		new_node.next = null; 

		/* 4. If the Linked List is empty, then make the new 
		* node as head */
		if (head == null) { 
			new_node.prev = null; 
			head = tail = new_node; 
			return; 
		} 

		/* 5. Else traverse till the node node */
		while (last.next != null) 
			last = last.next; 

		/* 6. Change the next of node node */
		last.next = new_node; 

		/* 7. Make node node as previous of new node */
		new_node.prev = last; 
                
                // 8. Update tail
                tail = new_node;
	} 

	// This function prints contents of linked list starting from the given node 
	public String printlistForward(Character delimiter) 
	{ 
            String result = "";
            Node node = head; 
            while (node != null) { 
                result += node.data.toString() + delimiter;
                node = node.next; 
            } 
            return result;
	} 

	// This function prints contents of linked list starting from the given node 
	public String printlistBackward(Character delimiter) 
	{ 
            String result = "";
            Node node = tail; 
            while (node != null) { 
                result += node.data.toString() + delimiter;
		node = node.prev; 
            } 
            return result;
	}
} 

