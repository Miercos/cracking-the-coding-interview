package main;
import main.LinkedList.Node;

public class LinkedListProblemSet {
	// a few things to note about this algorithm: 
	// (1) only works for objects where the comparison operator is supported
	public static void removeDups(Node head) {
		Node n = head;
		while(n != null) {
			Node runner = n;
			// runner.next is actually a second runner
			while(runner.next != null) {
				if(n.data == runner.next.data)
					runner.next = runner.next.next;
				else
					runner = runner.next;
			}
			n = n.next;
		}
	}
	
	// are we given access to the length of the list?
	public static int kthToLast(Node head, int size, int k){
		Node n = head;
		for(int i = 1; i < size - k; i++) {
			n = n.next;
		}
		return n.data;
	}
}
