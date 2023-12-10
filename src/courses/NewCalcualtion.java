package courses;

public class NewCalcualtion extends MyCalculation {

	public void multiplication(int firstNum, int secondNum)
	{
		total= firstNum * secondNum;
		System.out.println("The muliplication of Number" + total);
	}
	public static void main(String[] args) {

		NewCalcualtion NewCalc = new NewCalcualtion();
		NewCalc.addition(5, 10);
		NewCalc.abstraction(20,10);
		NewCalc.multiplication(10,10);
	}

}
