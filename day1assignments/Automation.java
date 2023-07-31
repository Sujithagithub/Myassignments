package week3.day1assignments;

public class Automation extends MultipleLangauge
{
	public void Java() {
		System.out.println("Java-Implemented from Interface Language");		
		
	}

	public void Selenium() {
		System.out.println("Selenium-Implemented from Interface TestTool");		
		
	}

	@Override
	public void Python() {
		System.out.println("Python-Implemented from Abstarct class MultipleLanguage");		
		
	}

	@Override
	public void Ruby() {
		System.out.println("Ruby-Implemented from Abstarct class MultipleLanguage");		
		
	}

public static void main(String[] args)
{
	Automation obj=new Automation();
	obj.Selenium();
	obj.Java();
	obj.Python();
	obj.Ruby();
}
}



/*Abstraction Assignment
======================
Interface :Language
     Methods   :Java()
     Interface :TestTool
     Methods   :Selenium()
     AbstractClass :MultipleLangauge
     Methods   :python() and un implemented method as ruby()
  Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class*/
