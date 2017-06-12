import java.util.ArrayList;

public class Ring {
	private ArrayList<Arc> arcList;
	
	public Ring(){
		arcList = new ArrayList<Arc>();
	}
	
	public void addArc(Arc a){
		arcList.add(a);
	}
}
