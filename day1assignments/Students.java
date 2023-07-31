package week3.day1assignments;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Id is:"+id);
	}
	public void getStudentInfo(int id,String name) 
	{
		System.out.println("Id is:"+id +" "+ "Name is:"+name);
	}
	public void getStudentInfo(String emailid,long phonenumber) 
	{
		System.out.println("Email Id:"+emailid+" "+ "Phone number is:"+phonenumber);
	}


	public static void main(String[] args) {
		Students cred=new Students();
		cred.getStudentInfo(50);
		cred.getStudentInfo(50, "Sujitha");
	    cred.getStudentInfo("sujithasrinivasan92@gmail.com",111111111L);

	}

}
/*Method overload Assignment
===========================

Class: Students
Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber*/