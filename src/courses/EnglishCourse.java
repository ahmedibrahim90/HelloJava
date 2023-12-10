package courses;

public class EnglishCourse {

	//Variables
	int students = 10;
	int weeks = 5;
	int days = 5;
	//Method
	public static void main(String[] args) {
		
EnglishCourse Eng101 = new EnglishCourse();
int totalDays;
//Eng101.students = 10;
//Eng101.weeks = 5;
//Eng101.days = 5;
totalDays = Eng101.days * Eng101.weeks;
System.out.println("The total days of course is " + totalDays + " Days");

	}

}
