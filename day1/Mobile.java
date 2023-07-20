package week1.day1;

public class Mobile 
{
	public void makecall() {
	System.out.println("make call");
	String brandName="OPPO";
	float mobileWt=5.5f;
	System.out.println("brandName:"+brandName+"\n"+"mobileWt:"+mobileWt);
}
	public void sendmsg() {
		System.out.println("send msg");
		boolean fullyCharged= true;
		int mobileCost=16000;
		System.out.println("fullyCharged:"+fullyCharged+"\n"+"mobileCost:"+mobileCost);
		
}
	

	public static void main(String[] args) {
Mobile mo=new Mobile();
System.out.println("This is my Moblie");
mo.makecall();
mo.sendmsg();
	}

}
