package main;
import main.LinkedList.Node;

public class LinkedListProblemSet {
	// my life would be easier if we weren't dealing with generic types
	public static <T> void removeDups(Node head, T element) {
		Node n = head;
		Node prev = null;
		boolean hasDup = false;
		
		while(n != null) {
			// what if we're comparing Strings?
			if(n.data == element) {
				if(hasDup) {
					//remove
					prev.next = n.next;
				}
				else {
					hasDup = true;
				}
			}
			// update previous if a duplicate was not removed or previous is not set
			if(prev == null || prev.next != n.next)
				prev = n;
			n = n.next;
		}
	}
}
