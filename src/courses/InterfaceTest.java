package courses;

public class InterfaceTest implements InterfacePage {

	public void eat()
	{
		System.out.println("This is Eat text");
	}
	
	public void travel()
	{
		System.out.println("This is Travel text");
	}
	
	public static void main(String[] args) {
		
		InterfaceTest inter = new InterfaceTest();
		inter.eat();
		inter.travel();

	}

	

}
