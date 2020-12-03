package main;
import main.LinkedList.Node;

public class LinkedListProblemSet {
	// my life would be easier if we weren't dealing with generic types
	public static <T> void removeDups(Node head, T element) {
		/* we're actually having more trouble than we anticipated
		Node n = head;
		Node prev = null;
		boolean hasDup = false;
		
		while(n != null) {
			if(n.data == element) {
				if(hasDup) {
					//remove
					prev.next = n.next;
				}
				else {
					hasDup = true;
				}
			}
			prev = n;
			n = n.next;
		}
		*/
	}
}
