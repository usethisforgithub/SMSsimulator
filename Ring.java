
import java.util.ArrayList;


public class Ring {
	
	//private static boolean[] colorArrayUsed = {false, false, false, false,false,false,false,false};
	private ArrayList<Arc> arcList;
	
	
	public Ring(){
		arcList = new ArrayList<Arc>();
		
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
}
