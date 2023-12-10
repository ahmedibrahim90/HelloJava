package courses;

public class TestSwitch {

	public static void main(String[] args) {
		
		int day = 5;
		
		switch (day)
		{
		case 1:
			System.out.println("Sunday is the first day of the week");
			break;
		case 2:
			System.out.println("monday is the 2nd day of the week");
			break;
		case 3:
			System.out.println("tuesday is the 3th day of the week");
			break;
		case 4:
			System.out.println("wed is the 4th day of the week");
			break;
		case 5:
			System.out.println("Thursday is the 5th day of the week");
			break;
		case 6:
			System.out.println("friday is the 6th day of the week");
			break;
		case 7:
			System.out.println("saturday is the last day of the week");
			break;
			default:
				System.out.println("NOT Valid :none");
		}
		
			

	}

}
