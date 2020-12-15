package main;

public class Main {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.print();
		ll.add(1);
		ll.add(1);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(4);
		ll.add(1);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(4);
		ll.add(1);
		
		ll.print();
		
		LinkedListProblemSet.removeDups(ll.head);

		ll.print();
		
		
		
		//System.out.println(LinkedListProblemSet.kthToLast(ll.head, ll.size(), 2));
	}

}
