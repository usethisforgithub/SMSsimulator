
import java.util.ArrayList;


public class Ring {
	
	//private static boolean[] colorArrayUsed = {false, false, false, false,false,false,false,false};
	private ArrayList<Arc> arcList;
	private int numBots;
	
	public Ring(){
		arcList = new ArrayList<Arc>();
		numBots = 0;
	}
	
	public void addArc(Arc a){
		arcList.add(a);
	}
	
	
	public String toString(){
		return "num of arcs " + arcList.size();
	}
	
	public ArrayList<Arc> getArcList(){
		return arcList;
	}
	
	public void addBot(){
		numBots++;
	}
	
	public int numBots(){
		return numBots;
	}
}
