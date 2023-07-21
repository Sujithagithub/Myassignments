package week1.day2;

public class Fibonacci {

		/*
		 * Goal: To find Fibonacci Series for a given range
		 * 
		 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
		 * 
		 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
		 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
		 * enter
		 * 
		 * What are my learnings from this code? 1) 2) 3)
		 * 
		 */

		public static void main(String[] args) {

			// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
			{  
				 int n1=0,n2=1,sum,i,range=8;  
				 System.out.print(n1+" "+n2);//printing 0 and 1  
				  
				 for(i=2;i<range;i++)//loop starts from 2 because 0 and 1 are already printed  
				 {  
				  sum=n1+n2;  
				  System.out.print(" "+sum);  
				  n1=n2;  
				  n2=sum;  
			// Print first number
			
			// Iterate from 1 to the range
			
			// add first and second number assign to sum

			// Assign second number to the first number

			// Assign sum to the second number
			
			// print sum

		}

	}
	}

}
