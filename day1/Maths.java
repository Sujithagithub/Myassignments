package week1.day1;

public class Maths {
	
	public int add1(int a, int b)
	{
		return a+b;
}
public int multiply(int a, int b)
{
	return a*b;

}
public float div(float a , float b)
{
	return a/b;

}
	public static void main(String[] args) {
		Maths ma= new Maths();
		System.out.println("Addition of two numbers");
		System.out.println("The result is :"+ ma.add1(9, 10));
		System.out.println(ma.add1(9, 10));
		int add=ma.add1(9, 10);
		System.out.println(add);
		System.out.println("Multiply two numbers");
		System.out.println("The result is :"+ ma.multiply(9, 10));
		System.out.println("Divide two numbers");
		System.out.println("The result is :"+ ma.div(9, 10));


			

	}

}
