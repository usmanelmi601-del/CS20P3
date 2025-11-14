package SkillBuilders;

public class Student
{
	private String firstname;
	private String lastname;
	private String address;
	private int ID;
	
	public Student()//Constructor method
	
	{
		firstname = "";
		lastname = "";
		address = "####";
        ID = 00000000;		
	}
	public Student(String f, String l, String ad, int ID)//Overload Constructor
	
	{
		firstname = f;
		lastname = l;
		address = ad;
		this.ID = ID;
	}
//Accessory methods
public String getfirstname()

{
	return firstname;
}

public String getlastname()
{
	return lastname;
}
public String getaddress()

{
	return address;
}
public int getID()
{
	return ID;
}

//Modified methods
	public void setfirstname(String f)
	{
		firstname = f;
	}
	
public void setlastname(String l)
	{
		lastname = l;
	}

	public void setaddress(String ad)
	{
		address = ad;
	}
	
	public void setID(int ID)
	{
		this.ID = ID;
	}
}



