
public class Arc {
	private Trajectory traj;
	private int quadrant;
	private boolean assigned;
	
	
	
	public Arc(Trajectory t, int q){
		traj = t;
		quadrant = q;
		assigned = false;
	}
	
	public void setAssigned(boolean a){
		assigned = a;
	}
	
	public boolean isAssigned(){
		return assigned;
	}
}
