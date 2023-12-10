package courses;

import java.util.LinkedList;

public class Linkedlst {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Item1");
		linkedList.add("Item3");
		linkedList.add("Item2");
		linkedList.add("Item5");
		linkedList.add("Item4");
		System.out.println("Print list of linked list content: " +linkedList);
		
		linkedList.addFirst("First Item");
		linkedList.addLast("Last Item");
		System.out.println("Print list of linked list content after adding first and last items: " +linkedList);
		
		Object firstvalue = linkedList.get(3);
		System.out.println("Print third item only: " +firstvalue);
		linkedList.set(0, "Updated Item");
		Object secondvalue = linkedList.get(0);
		System.out.println("Print first item only : " + secondvalue);
		
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println("Print list of linked list content after removing first and last items: " +linkedList);
		
		linkedList.add(0, "First");
		linkedList.add(6, "last");
		System.out.println("Print list of linked list content after adding first and last items: " +linkedList);
		
		linkedList.remove(0);
		linkedList.remove(5);
		System.out.println("Print list of linked list content after removing specific itenms: " +linkedList);
	}
	

}
