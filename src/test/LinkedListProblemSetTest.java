package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.LinkedList;
import main.LinkedListProblemSet;

public class LinkedListProblemSetTest {
	LinkedList ll;
	LinkedListProblemSet pset;
	
	@Before
	public void initialize() {
	}
	
	@Test
	public void removeDupsTest() {
		LinkedList ll = new LinkedList();
		
		LinkedListProblemSet.removeDups(ll.head);
		assertEquals("", ll.toString());
		
		ll.add(1);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(4);
		ll.add(3);
		ll.add(4);
		
		LinkedListProblemSet.removeDups(ll.head);
		assertEquals("1 -> 2 -> 3 -> 4", ll.toString());
	}
	
	@Test
	public void kthToLastTest() {
		LinkedList ll = new LinkedList();
		
		ll.add(1);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(4);
		
		// 0th to last would crash the program because it would be out of bounds (and doesn't make sense)
		assertEquals(4, LinkedListProblemSet.kthToLast(ll.head, 1));
		assertEquals(3, LinkedListProblemSet.kthToLast(ll.head, 2));
		assertEquals(1, LinkedListProblemSet.kthToLast(ll.head, 5));
	}

	// notice the pattern when it comes to setting these up?
	public void deleteMiddleNodeTest() {
		LinkedList ll = new LinkedList();
		
		ll.add(1);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(4);
		
		//Node n = null;
		// best way to get a certain node?
		for(int i = 0; i < 1; i++) {
			
		}
	}
	
	@Test
	public void partitionTest() {
		LinkedList ll = new LinkedList();
		ll.add(3);
		ll.add(5);
		ll.add(8);
		ll.add(5);
		ll.add(10);
		ll.add(2);
		ll.add(1);
		ll.head = LinkedListProblemSet.partition(ll.head, 5);		
		assertEquals("3 -> 2 -> 1 -> 5 -> 8 -> 5 -> 10", ll.toString());
		
		ll = new LinkedList();
		ll.add(3);
		ll.add(5);
		ll.add(8);
		ll.add(5);
		ll.add(10);
		ll.add(2);
		ll.add(1);
		ll.head = LinkedListProblemSet.partitionAlternate(ll.head, 5);		
		assertEquals("1 -> 2 -> 3 -> 5 -> 8 -> 5 -> 10", ll.toString());
	}
}
