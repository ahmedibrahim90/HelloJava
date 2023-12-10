package courses;

public class EncapsulationTest {

	public static void main(String[] args) {
		
		EncapsulationPage encapPage = new EncapsulationPage();
		encapPage.SetName("Ahmed Hassan");
		encapPage.SetAddress("Hamilton");
		encapPage.SetAge(33);
		
		System.out.println("Name: " + encapPage.getName()+ "/" + " Address: "+ encapPage.getAddress()+ "/"+  " Age: " + encapPage.getAge());
	}

}
