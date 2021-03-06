package main;
/**
 * LinkedList represents a singly-linked list
 * @author Marcos
 *
 */
public class LinkedList{
	// normally, head wouldn't be public but we need access to it when writing our algorithms
	public Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void add(int i) {
		if(head == null) {
			head = new Node(i);
		}
		else {
			// reach last position in list (node.next = null)
			Node n = head;
			
			while(n.next != null) {
				n = n.next;
			}
			
			n.next = new Node(i);
		}
	}
	
	public void addFirst(int i) {
		Node temp = head;
		head = new Node(i);
		head.next = temp;
	}
	
	public void setHead(Node n) {
		head = n;
	}
	
	// we are going for this inefficient size method so we don't have to update a size variable
	// which becomes trivial when we start removing elements from outside this class (e.g. removeDups)
	public int size() {
		int size = 0;
		Node n = head;
		
		while(n != null) {
			size++;
			n = n.next;
		}
		
		return size;
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
		int data;
		
		public Node(int i) {
			data = i;
		}
	}
}
