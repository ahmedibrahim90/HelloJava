package courses;

public class EncapsulationPage {

	private String name;
	private String address;
	private int age;
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void SetName(String NewName)
	{
		name = NewName;
	}
	
	public void SetAddress(String NewAddress)
	{
		address = NewAddress;
	}
	
	public void SetAge(int NewAge)
	{
		age = NewAge;
	}
	
}
