package week1.day2;

public class primenumber {

	public static void main(String[] args) {
		 
		int num=20;
		for (int i = 1; i<= num; i++)
		{
			 int z=0;
			for (int j = 2; j < i; j++) {
				if (i%j ==0)
				{
					z=1;
					break;
				}
			}	 
			if(z==0)
				System.out.println("prime number "+i);
		}
	}

}
