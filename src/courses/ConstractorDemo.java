package courses;

public class ConstractorDemo {

	private String name;
	private int code;
	
	public ConstractorDemo()
	{
		System.out.println("This is a constractor Demo");
	}
	
	public ConstractorDemo(int age)
	{
		System.out.println("This is a constractor Demo age " + age);
	}
	
	public ConstractorDemo(String name, int code)
	{
		System.out.println("This is a constractor Demo name " + name + " " +code);
		this.name = name;
		this.code = code;
	}
	
	public ConstractorDemo(String name)
	{
		System.out.println("This is a constractor Demo name and code " + name);
	}
}
