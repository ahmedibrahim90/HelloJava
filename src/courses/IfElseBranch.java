package courses;

public class IfElseBranch {

	public static void main(String[] args) {

		int extraCustomer = 50;

		if (extraCustomer < 50) 
		{
			System.out.println("Customer gets Discount");
		}
		else if (extraCustomer > 50) 
		{
			System.out.println("Customer Won't get Discount");
		}
		else 
		{
			System.out.println("Invalid : Error message");
		}

	}


}
