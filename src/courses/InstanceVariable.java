package courses;

public class InstanceVariable {

	int age = 50;
	
	public void testInstVar()
	{
		int age = 33;
		System.out.println("Ahmed is "+ age + " Years");
	}
	
	public void testInstVarAgain()
	{
		System.out.println("Ahmed is "+ age + " Years");
	}
	public static void main(String[] args) {
		
		InstanceVariable ageA = new InstanceVariable();
		ageA.testInstVar();
		ageA.testInstVarAgain();

	}

}
