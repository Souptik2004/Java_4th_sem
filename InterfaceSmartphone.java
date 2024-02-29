class Phone
{
	void call()
	{
		System.out.println("call method of phone");
	}
	void sms()
	{
		System.out.println("sms method of phone");
	}
}
interface ICamera
{
	void click();
	void record();
}
interface IMusicPlayer
{
	void play();
	void pause();
	void stop();
	
}
interface IClock
{
	void time();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer,IClock
{	

	public void videocall()
	{
		System.out.println("Smartphone videocalling");
	}
	public void click()
	{
		System.out.println("Smartphone clicking image");
	}
	public void record()
	{
		System.out.println("Smartphone recording");
	}
	public void play()
	{
		System.out.println("smartphonr music playing");	
	}
	public void pause()
	{	
		System.out.println("Smartphone music pausing");		
	}
	public void stop()
	{
		System.out.println("Smartphonr music stopping");
	}
	public void time()
	{
		System.out.println("Smartphont timr showing");
	}
}
public class InterfaceSmartphone
{
	public static void main(String args[])
	{
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.sms();
		sp.stop();
		sp.click();
		sp.record();
		sp.time();
		
		//interface overriding.
		
		IMusicPlayer mp = new SmartPhone();
		mp.pause();
	}
}