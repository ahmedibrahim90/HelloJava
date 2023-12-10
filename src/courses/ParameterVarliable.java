package courses;

public class ParameterVarliable {

	public void testParameterVar(int age)
	{
		System.out.println("Ahmed is " + age + " Years old");
	}
	public static void main(String[] args) {

		ParameterVarliable testAge = new ParameterVarliable();
		testAge.testParameterVar(33);
		

	}

}
