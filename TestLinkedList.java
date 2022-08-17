package main;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.LinkedList;


	public abstract class TestLinkedList<T> extends AbstractList<T> {

		public static <T> void main(String[] args) {
		
			 
	        // Using add() method to add elements in the list

			
			// Creating an empty AbstractList
	        AbstractList<Integer> list = new LinkedList<Integer>();
	 
	        // Using add() method to add elements in the list
	        list.add(5);
	        list.add(6);
	        list.add(7);
	        list.add(8);
	        list.add(9);
	        System.out.println(list.toString());
			list(null);
			System.out.println("Create a new list...");
			
			 
	        // Using add() method to add elements in the list

			AbstractList<Double> list1 = new LinkedList<Double>();
			 
	        // Using add() method to add elements in the list
	        list1.add((double) 5);
	        list1.add((double) 6);
	        list1.add((double) 7);
	        list1.add((double) 8);
	        list1.add((double) 9);
	        list1.add((double) 10);
	        
	        System.out.println(list1.toString());
			list(null);
			System.out.println("Create a new list...");
			
			AbstractList<String> list2 = new LinkedList<String>();
			 
	        // Using add() method to add elements in the list
	        list2.add("Batman");
	        list2.add("Joker");
	        list2.add("Riddler");
			
			System.out.println(list2.toString());
			list(null);

			System.out.println("Completed Lists...");

		}
		
		@Override
		public T get(int index) {
			return null;
		}//end get T

		private static void list(String string) {
			
		}// end list

		@Override
		public String toString() {
			return "TestLinkedList [iterator()=" + iterator() + ", listIterator()=" + listIterator() + ", hashCode()="
					+ hashCode() + ", size()=" + size() + ", isEmpty()=" + isEmpty() + ", toArray()="
					+ Arrays.toString(toArray()) + ", toString()=" + super.toString() + ", getClass()=" + getClass()
					+ "]";
		}//end toString


}//end class