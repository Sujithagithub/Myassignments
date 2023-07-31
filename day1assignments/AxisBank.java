package week3.day1assignments;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("In Axis Bank Pan card is mandatory for cash deposit above 50000");
	}
	public static void main(String[] args) 
	{
	AxisBank ab=new AxisBank();
	ab.savings_scheme();
	ab.fixeddeposit_scheme();
	ab.deposit();
	}
	

}

/* Class     :AxisBank
Methods :deposit()

Description:
You have to override the method deposit in AxisBank.*/