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

	Node head; // head of list 
        Node tail; // tail of the list

	/* Doubly Linked list Node*/
	//abstract 
                class Node <R> 
                        //implements Comparable <R>
                { 
		R data; 
		Node prev; 
		Node next; 

		// Constructor to create a new node 
		// next and prev is by default initialized as null 
		Node(R d) { data = d; }
        }
                
	// Adding a node at the front of the list 
	public void push(T new_data) 
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

        public void InsertOrdered (T new_data)
        {
                // empty list!!!
                if (head == null)
                    push (new_data);
                else
                {
                    /* 2. allocate node 
                    * 3. put in the data */
                    //Node new_node = new Node(new_data); 
                    
                    // search position
                    Node aux = head;
                    //while (aux != tail && new_node.data.compareTo())
                

                }
            
        }
        
	/* Given a node as prev_node, insert a new node after the given node */
	public void InsertAfter(Node prev_Node, T new_data) throws NullPointerException
	{ 
		/*1. check if the given prev_node is NULL */
		if (prev_Node == null) { 
			throw new NullPointerException("The given previous node cannot be NULL");
		} 

		/* 2. allocate node 
		* 3. put in the data */
		Node new_node = new Node(new_data); 

                // 3.5 check if it is the last node
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
	public void append(T new_data) 
	{ 
		/* 1. allocate node 
		* 2. put in the data */
		Node new_node = new Node(new_data); 

		Node last = head; /* used in step 5*/

		/* 3. This new node is going to be the last node, so 
		* make next of it as NULL*/
		new_node.next = null; 

		/* 4. If the Linked List is empty, then make the new 
		* node as head */
		if (head == null) { 
			new_node.prev = null; 
			head = tail = new_node; 
			return; 
		} 

		/* 5. Else traverse till the last node */
		while (last.next != null) 
			last = last.next; 

		/* 6. Change the next of last node */
		last.next = new_node; 

		/* 7. Make last node as previous of new node */
		new_node.prev = last; 
                
                // 8. Update tail
                tail = new_node;
	} 

	// This function prints contents of linked list starting from the given node 
	public String printlistForward(Node node, Character delimiter) 
	{ 
            String result = "";
            while (node != null) { 
                result += node.data.toString() + delimiter;
                node = node.next; 
            } 
            return result;
	} 

	// This function prints contents of linked list starting from the given node 
	public String printlistBackward(Node node, Character delimiter) 
	{ 
            String result = "";
            Node last = node; 
            while (last != null) { 
                result += last.data.toString() + delimiter;;
		last = last.prev; 
            } 
            return result;
	}
} 

