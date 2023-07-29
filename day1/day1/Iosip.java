package week3.day1;

public class Iosip 
{

public void startApp()
{
	System.out.println(" Parent class-App started");
	
}
public void increaseVolume()
{
	System.out.println(" Parent class-Volume increased");
}
public void shutDown()
{
	System.out.println(" Parent class-Phone off");
}
}
/*Create iOS (Super Class)    
startApp    
increaseVolume   
shutdown
2) Create iPhone extends iOS   
makeCall   
sendSMS
3) Create iPad extends iOS    
watchMovie
4) Create a class (MyPhone) with main method    
Create Object for iPhone    
Confirm you can access 5 methods !!  
Confirm you cannot access iPad methods.*/
