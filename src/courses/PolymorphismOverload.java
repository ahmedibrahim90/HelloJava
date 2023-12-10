package courses;

public class PolymorphismOverload {

	public void demo(int a)
	{
		System.out.println("a: " + a);
	}
	
	public void demo(int a, int b)
	{
		System.out.println("a: " + a + "b: " +b);
	}
	
	public double demo(double a)
	{
		System.out.println("double: " + a);
		return a*a;
		
	}
}
