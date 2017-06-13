import java.awt.Color;

public class Arc {
	private Trajectory traj;
	private int quadrant;
	private boolean assigned;
	private Color color;
	private Ring ring;
	
	
	
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
	
	public int getQuadrant(){
		return quadrant;
	}
	
	public Trajectory getTraj(){
		return traj;
	}
	
	public Color getColor(){
		return color; 
	}
	
	public void setColor(Color c){
		color = c;
	}
	
	public void setRing(Ring r){
		ring = r;
	}
}
