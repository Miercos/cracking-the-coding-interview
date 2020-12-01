/**
 * LinkedList represents a singly-linked list
 * @author Marcos
 *
 */
public class LinkedList<T> {
	private Node head;
	
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
		while(n.next != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.print(n.data + "\n");
	}
	
	class Node {
		Node next = null;
		T data;
		
		public Node(T t) {
			data = t;
		}
	}
}
