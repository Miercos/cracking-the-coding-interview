package main;
import main.LinkedList.Node;

public class LinkedListProblemSet {
	// what if we're storing Strings? Will the comparison still work?
	public static <T> void removeDups(Node head) {
		Node m = head;
		
		while(m != null) {
			Node n = m.next;
			Node prev = m;
			
			while(n != null) {
				if(m.data == n.data)
					prev.next = n.next;
				
				// only change prev if a duplicate was NOT removed
				if(prev.next != n.next)
					prev = n;
				n = n.next;
			}	
			m = m.next;
		}
	}
}
