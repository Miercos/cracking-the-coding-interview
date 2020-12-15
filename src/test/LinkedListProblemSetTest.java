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
		
	}

}
