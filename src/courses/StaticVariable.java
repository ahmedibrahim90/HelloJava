package courses;

public class StaticVariable {

	static int age = 20;
	
	public static void testStatic()
	{
		System.out.println("Please print Static variable");
	}
	
	public static void main(String[] args) {

		System.out.println("Please print number: "+ StaticVariable.age);
		StaticVariable.testStatic();
	}

}
