import java.awt.Color;
import java.util.ArrayList;


public class Ring {
	private static Color[] colorArray = {Color.blue, Color.red, Color.green, Color.yellow, Color.pink, Color.ORANGE, Color.cyan, Color.magenta};
	private static int colorIterator = 0;
	//private static boolean[] colorArrayUsed = {false, false, false, false,false,false,false,false};
	private ArrayList<Arc> arcList;
	private Color color;
	
	private static void getNextColor(){
		colorIterator++;
		if(colorIterator > colorArray.length -1){
			colorIterator = 0;
		}
	}
	
	public Ring(){
		arcList = new ArrayList<Arc>();
		color = colorArray[colorIterator];
		getNextColor();
	}
	
	public void addArc(Arc a){
		arcList.add(a);
	}
	
	public Color getColor(){
		return color;
	}
}
