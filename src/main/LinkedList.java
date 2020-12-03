package main;
/**
 * LinkedList represents a singly-linked list
 * @author Marcos
 *
 */
public class LinkedList<T> {
	// normally, head wouldn't be public but we need access to it when writing our algorithms
	public Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void add(T t) {
		if(head == null) {
			head = new Node(t);
		}
		else {
			// reach last position in list (node.next = null)
			Node n = head;
			
			while(n.next != null) {
				n = n.next;
			}
			
			n.next = new Node(t);
		}
	}
	
	public void print() {
		Node n = head;
		
		while(n != null) {
			if(n.next != null)
				System.out.print(n.data + " -> ");
			else
				System.out.println(n.data + "\n");
			n = n.next;
		}
	}
	
	public String toString() {
		String retString = "";
		
		Node n = head;
		
		while(n != null) {
			if(n.next != null)
				retString += n.data + " -> ";
			else
				retString += n.data;
			n = n.next;
		}
		
		return retString;
	}
	
	class Node {
		Node next = null;
		T data;
		
		public Node(T t) {
			data = t;
		}
	}
}
