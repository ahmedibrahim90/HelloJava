package courses;

public class AbstractTwo extends AbstractOne {

	public void sound()
	{
		System.out.println("Print please");
	}
	
	public void move()
	{
		System.out.println("Move please");
	}
	
	public static void main(String[] args) {
		
		AbstractOne one = new AbstractTwo();

		one.sound();
		one.move();
	}

}
