package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.LinkedList;

public class LinkedListTest {
	@Test
	public void newListShouldBeEmpty() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		assertEquals("", ll.toString());
	}
	
	@Test
	public void addShouldAddNodeToEnd() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		assertEquals("1 -> 2 -> 3", ll.toString());
	}

}
