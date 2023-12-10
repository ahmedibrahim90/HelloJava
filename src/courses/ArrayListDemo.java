package courses;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);
		
		for(int i = 0; i < numbers.size(); i++)
		{
			System.out.println(numbers.get(i));
		}
		
		numbers.remove(0);
		System.out.println(numbers);
		
		numbers.remove(numbers.size()-1);
		System.out.println(numbers);
	}

}
