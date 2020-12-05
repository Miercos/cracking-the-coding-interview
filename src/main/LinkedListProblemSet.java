package main;
import main.LinkedList.Node;

public class LinkedListProblemSet {
	// what if we're storing Strings? Will the comparison still work?
	public static <T> void removeDups(Node head) {
		Node m = head;
		boolean hasDuplicate;
		
		while(m != null) {
			hasDuplicate = false;
			Node n = m;
			Node prev = null;
			
			while(n != null) {
				if(m.data == n.data) {
					if(hasDuplicate) {
						prev.next = n.next;
					}
					else {
						hasDuplicate = true;
					}
				}
				if(prev == null || prev.next != n.next)
					prev = n;
				n = n.next;
			}	
			m = m.next;
		}
	}
}
