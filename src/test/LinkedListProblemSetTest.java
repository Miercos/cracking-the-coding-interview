package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.LinkedList;
import main.LinkedListProblemSet;

public class LinkedListProblemSetTest {
	LinkedList<Integer> ll;
	LinkedListProblemSet pset;
	
	@Before
	public void initialize() {
	}
	
	@Test
	public void removeDupsTest() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(4);
		
		LinkedListProblemSet.removeDups(ll.head, 1);
		
		ll.print();
		
		assertEquals("1 -> 2 -> 3 -> 4", ll.toString());
	}

}
