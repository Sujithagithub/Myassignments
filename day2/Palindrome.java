package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		/*Assignment:2

		Check the given number is palindrome or not 

		Int num =34343

		Initialize a  temporary variable.

		Reverse the number (using for loop and add to the temporary variable)

		Compare the temporary number with reversed number

		If both numbers are same, print "palindrome number"

		Else print "not palindrome number"
	}*/
		
int num=34343;
int rev=0;
for (int i = num; i >0; i=i/10)
{
	rev=(rev*10)+(i%10); //3,4=7
}
if(num==rev)
{
	System.out.println("The givennumber :" +num + " is palindrome");
		
}else
{
	System.out.println("The givennumber :" +num + " is not a  palindrome");
}
}
}