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
		
		// we might have to add a method to get a node to test this one
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
		assertEquals("1 -> 2 -> 3 -> 5 -> 8 -> 5 -> 10", ll.toString());
	}
	
	@Test
	public void sumListsTest() {
		LinkedList l1 = new LinkedList();
		l1.add(9);
		l1.add(7);
		l1.add(8);

		LinkedList l2 = new LinkedList();
		l2.add(6);
		l2.add(8);
		l2.add(5);
		
		LinkedList ll = new LinkedList();
		ll.head = LinkedListProblemSet.sumLists(l1.head, l2.head);
		ll.print();
		
		assertEquals("5 -> 6 -> 4 -> 1", ll.toString());
	}
	
	@Test
	public void isPalindromeTest() {
		LinkedList ll = new LinkedList();
		assertEquals(false, LinkedListProblemSet.isPalindrome(ll.head));	
		
		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(3);
		l1.add(2);
		l1.add(1);
		assertEquals(true, LinkedListProblemSet.isPalindrome(l1.head));
		
		LinkedList l2 = new LinkedList();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(3);
		l2.add(2);
		assertEquals(false, LinkedListProblemSet.isPalindrome(l2.head));	
	}
}
