package firstPackage;

public class EnglishCourse {

	int students = 10;
	int weeks = 4;
	int days = 3;
	
	public static void main(String[] args) {
		

		EnglishCourse eng = new EnglishCourse();
		int totalDays;
		
		totalDays = eng.days * eng.weeks;
		System.out.println("Total day of the english course is "+ totalDays + " Days");
	}

}
