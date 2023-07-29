package week3.day1;

public class iphone extends Iosip 
{

	public void makeCall()
	{
		System.out.println("Child class-Call made");
		
	}
	public void sendSMS()
	{
		System.out.println("Child class-SMS sent");
	}
	public void startApp()
	{
		System.out.println("Apps Done");
		
     }
	public static void main(String[] args)
	{
		iphone iph=new iphone();
		iph.startApp();
	}
	

}


/*Method Overriding:
Create a two classes iPhone and iOS
Create the same method (startApp) in iPhone and
Execute the method using child class object*/