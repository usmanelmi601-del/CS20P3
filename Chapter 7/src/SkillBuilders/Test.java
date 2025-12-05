package SkillBuilders;

public abstract class Test {
		
	public static void main(String[] args) 
		  {
		  Student stA = new Student();
		  
			 
			  System.out.println(stA.getfirstname());
			  System.out.println(stA.getlastname());
			  System.out.println(stA.getaddress());
			  System.out.println(stA.getID());
			  
			  String firstname;
			  String lastname;
			  String address;
			  int ID;
			 
			  
			 
			  
			  
			  System.out.println(".......................");
			  
			  Student stB = new Student("Derek","Jake","63 Slate Street",27178920);
			  
			  System.out.println(stB.getfirstname());
			  System.out.println(stB.getlastname());
			  System.out.println(stB.getaddress());
			  System.out.println(stB.getID());
			  //System.out.println(stA.getfirstname());
			  //stA.setfirstname("AAA");
			 
			 // System.out.println(stA.getlastname());
			 // stA.setlastname("...");
			 
			  //System.out.println(stA.getaddress());
			 // stA.setaddress("####");
			  
			  //System.out.println(stA.getID());
			 // stA.setID(546576);
		  
		  }
}
	