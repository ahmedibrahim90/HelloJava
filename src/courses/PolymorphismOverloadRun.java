package courses;

public class PolymorphismOverloadRun {

	
	
	
	
	public static void main(String[] args) {

		PolymorphismOverload obj = new PolymorphismOverload();
		
		double result = obj.demo(5.5);
		
		obj.demo(10);
		obj.demo(10, 20);
		obj.demo(result);
		
		System.out.println("Final Result is: " + result);
	}

}
