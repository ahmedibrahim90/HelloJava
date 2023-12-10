package courses;

public class ArrayList {

	public static void main(String[] args) {


		java.util.ArrayList<String> arr = new java.util.ArrayList<String>();
		arr.add("Ahmed");
		arr.add("Ibrahim");
		arr.add("Hassan");
		arr.add("Elsabbal");
		System.out.println("Print the arryList: " + arr);
		
		arr.add(0, "First");
		arr.add(5, "Last");
		System.out.println("Print the arryList after adding: " + arr);
		
		arr.remove(0);
		arr.remove("Last");
		System.out.println("Print the arryList after removing: " + arr);
		

	}

}
