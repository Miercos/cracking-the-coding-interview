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
	
	// we are implementing this without size for more of a challenge
	// for more of a challenge, try recursion 
	public static int kthToLast(Node head, int k){
		// we don't have to worry about losing head bc head will be unchanged anyways?
		Node n = head;
		Node runner = head;
		int i = 0;
		
		while(runner != null) {
			if(i >= k)
				n = n.next;
			runner = runner.next;
			i++;
		}
		
		return n.data;
	}
	
	// not going to lie, I thought this problem was impossible until I saw the hint
	public static void deleteMiddleNode(Node n) {
		while(n != null) {
			n.data = n.next.data;
			n = n.next;
		}
	}
	
	// I really like this implementation
	// it's elegant, efficient, but requires some additional functionality from our LinkedList class
	// interestingly, it doesn't work if you try to change head or n directly, you have to return it to change it
	// I'm guessing it's because Java passes by value 
	public static Node partition(Node n, int p) {
		LinkedList ll = new LinkedList();
		
		while(n != null) {
			if(n.data < p)
				ll.addFirst(n.data);
			else
				ll.add(n.data);
			n = n.next;
		}
		
		return ll.head;
	}
}
