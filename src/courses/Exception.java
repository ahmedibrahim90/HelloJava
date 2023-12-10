package courses;

public class Exception {

	public void TestArray()
	{
		try 
		{
			int num[] = {1,2,3};
			System.out.println("Print arry number:" + num[4]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown" + e);
		}
		
		System.out.println("Out of block, Please try a correct number");
	}
	
	public static void main(String[] args) {

		Exception exp = new Exception();
		exp.TestArray();

		
		

	}

}
