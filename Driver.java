
public class Driver {
public static void main(String[] args)
{
	ScreenWindow window = new ScreenWindow(4,1,1,0);
	new Thread(window).start();
}
}
