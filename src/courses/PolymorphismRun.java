package courses;

public class PolymorphismRun extends PolymorphismDemo {

	@Override
	public void sound()
	
	{
		System.out.println("Human does NOT do Animal sound");
	}
	
	public static void main(String[] args) {

		PolymorphismDemo poly = new PolymorphismRun();
		poly.sound();
		
	}

}
