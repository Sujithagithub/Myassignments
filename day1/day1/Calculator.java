package week3.day1;

public class Calculator 
{
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);

	}
	public void multiply(double a, double b)
	{
		System.out.println(a*b);

	}
	
	public void multiply(float b, float c)
	{
		System.out.println(b*c);

	}
      public static void main(String[] args)
	{
		Calculator calc= new Calculator();
		calc.add(10, 12);
		calc.add(10,12,14);
		calc.multiply(125.69,963.25 );
		calc.multiply(0.5, 6.9);
	}

}
/*Method Overloading
Create class Calculator with below methods:   
- 2 methods for add. 
    1 method with 2 int args,
    1 method with 3 int args    
- 2 methods for multiple.
    1 method with 2 double args,
    1 method with 2 float args, 
Create Object for calculator class and call all the methods*/
