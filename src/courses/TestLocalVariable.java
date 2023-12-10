package courses;

public class TestLocalVariable {

	public void testMethod()
	{
		int age = 20;
		System.out.println("How old are you? " + age + " Years Old");
	}
	
	public void testMethodAgain()
	{
		int age = 25;
		System.out.println("How old are you? " + age + " Years Old");
	}
	
	public static void main(String[] args) {
		

		TestLocalVariable testClass = new TestLocalVariable();
		testClass.testMethod();
		testClass.testMethodAgain();
	}

}
