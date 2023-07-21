package week1.day2;

import java.util.Arrays;

public class FindFirstMissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array
		Arrays.sort(arr);

      // 1,2,3,4,6,7,8

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i <= arr.length; i++) 
		{
			if((i+1)!=arr[i])
			{
				System.out.println("missing number is "+(i+1));
				break;
			}		
		}

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
				
				
		

	}

}