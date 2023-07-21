package week1.day2;
public class Dupnumbers {
	public static void main(String[] args)
	{
		int[]num= {2,5,7,7,5,9,2,3};
		for (int i = 0; i <8 ; i++)
		{
			for (int j = i+1; j <8; j++) {
				if (num[i]==num[j])
				{
					System.out.println("Duplicate numbers are: "+num[i]);
				}
			}			
		}
	}
}




// understanding 
// num[0]=2, num[1]=5, num[2]=7 , num[3]=7
//num array = 2,5,7,7,5,9,2,3, length=8-1 = 7
/* iteration 1----> i=0:  i=0 ,0<7 -true so go inside, 
      j=1 1 <= 7 - true go inside, num[0]=2,  num[1]=5 2==5 false go outside
           j=2  2 <= 7  true go inside num[0]=2, num[2]=7 2===7 - false go outside 
              j=3 3 <= 7 truie go inside num[0]=2 num[3] =7, 2 ==7 --false go outside
                   j=4  4 <= 7 true , num[0]=2 num[4]=5 2=7 false go outside
                       j=5  5<=7 true , num[0]=2 num[5]=9   2==9  flase go outside
                            j=6  6<=7 true,  num[0]=2 num[6]=2   2==2 true  print the duplicate statement
                                 j=7 7<=7 true num[0]=2 num[7]=3   2==3 false
                                    j=8  8<=7 false exit the loop
                                    
   iteration 2----> i=1: i=1 ,1<7 -true so go inside    
       i=1  1< 7 true ,
           j=2, 2 <=7 true num[1]=5 , num[2] =7   5==7 false go outside
                j=3, 3<=7  true num[1]=5, num[3]=7 5==7 false go outside
                   j=4, 4 <=7 true num[1]=5 num[4]=5  5==5 true print the duplicate statement
                   
                                     
 */
                                    