package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.LinkedList;
import main.LinkedListProblemSet;

public class LinkedListTest {
	@Test
	public void newListShouldBeEmpty() {
		LinkedList ll = new LinkedList();
		assertEquals("", ll.toString());
	}
	
	@Test
	public void addShouldAddNodeToEnd() {
		LinkedList ll = new LinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		assertEquals("1 -> 2 -> 3", ll.toString());
	}

	@Test
	public void sizeTest() {
		LinkedList ll = new LinkedList();
		// empty list should have a size of 0
		assertEquals(0, ll.size());
		
		// adding elements should increase the size
		ll.add(1);
		ll.add(2);
		ll.add(1);
		assertEquals(3, ll.size());
		
		// removing elements should decrease the size
		LinkedListProblemSet.removeDups(ll.head);
		assertEquals(2, ll.size());
	}
	
}
