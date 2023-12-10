package courses;

public class Sum {

	int firstNumber = 10;
	int secondNumber = 20;
	int sum = firstNumber + secondNumber;
	
	public void sumTest()
	{
		System.out.println("Print sum of first and second Numbers is: " + sum);
	}
	
	public static void main(String[] args) {

		Sum su = new Sum();
		su.sumTest();
		
	}

}
