package courses;

public class MyCalculation {

	int total;
	
	public void addition(int firstNum, int secondNum)
	{
		total = firstNum + secondNum;
		System.out.println("the addition of numbers are " + total);
	}
	
	public void abstraction (int firstNum, int secondNum)
	{
		total = firstNum - secondNum;
		System.out.println("the difference of numbers are " + total);
	}
}
