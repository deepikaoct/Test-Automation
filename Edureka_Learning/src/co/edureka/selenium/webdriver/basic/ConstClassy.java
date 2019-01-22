package co.edureka.selenium.webdriver.basic;

public class ConstClassy {

	int l=100;
	int b=22;
	int h=5;
	
	public void getVolume()
	{
		int volume = (l*b*h);
		System.out.println("This is the volume" + volume);
	}
	
	public ConstClassy() {
	System.out.println("this is a constructor");
	}
	
	public ConstClassy(int a ,int b, int c) {
		
	int d = (a*b*c);
	System.out.println("this is a parametrised multiplication " + d);
		
		
		
	}
}
