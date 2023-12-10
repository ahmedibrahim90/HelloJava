package courses;

public class StringDemo {

	public static void main(String[] args) {

		String greeting = "HellowWorld!";
		int len = greeting.length();
		String FName = "Ahmed ";
		String LName = "Elsabbal";
		String FullName = FName.concat(LName);
		
		System.out.println(greeting);
		System.out.println(len);
		System.out.println(FName + LName);
		System.out.println(FullName);
		
		
		
	}

}
