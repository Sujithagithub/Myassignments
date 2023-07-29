package week3.day1;

public class Samsung  extends AndroidTv{

	public void playVideo()
	{
	System.out.println("Video played");	
	}

	@Override
	public void version()
	{
		System.out.println("Android latest version");
		
	}
	@Override
	public void color() 
	{
		System.out.println("Black color");
	}
	
	public static void main(String[] args)
	{
     Samsung sam= new Samsung();
     sam.playVideo();
     sam.version();
     sam.color();
     sam.openApp();

}

	
		
}

