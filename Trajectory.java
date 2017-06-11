import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class Trajectory {

	private Coordinate vertex;
	private int direction;
	private int sizeT;
	private Trajectory leftNeighbor, rightNeighbor, topNeighbor, bottomNeighbor;
	private ArrayList<Robot> bots;
	
	public Trajectory(Coordinate v, int dir, int s)
	{
		bots = new ArrayList<Robot>();
		leftNeighbor = null;
		rightNeighbor = null;
		topNeighbor = null;
		bottomNeighbor = null;
		vertex = v;
		direction = dir;
		sizeT = s;
	}
	
	public void addBot(Robot b){
		bots.add(b);
	}
	
	public boolean hasLeftCrit(){
		for(Robot e : bots){
			if( Utilities.radianEq(e.getAngle(),Math.PI )||  Utilities.radianEq(e.getAngle(),-Math.PI )){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasRightCrit(){
		for(Robot e : bots){
			if(Utilities.radianEq(e.getAngle(), 2*Math.PI) ||Utilities.radianEq(e.getAngle(), -2*Math.PI)){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasTopCrit(){
		for(Robot e : bots){
			if( Utilities.radianEq(e.getAngle(), Math.PI/2)  || Utilities.radianEq(e.getAngle(),-3*(Math.PI/2))){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasBottomCrit(){
		for(Robot e : bots){
			if( Utilities.radianEq(e.getAngle(),3*(Math.PI/2))|| Utilities.radianEq(e.getAngle(), -Math.PI/2) ){
				return true;
			}
		}
		return false;
	}
	
	public void removeBot(Robot b){
		bots.remove(b);
	}
	
	public void addLeft(Trajectory neighbor){
		leftNeighbor = neighbor;
	}
	
	public void addRight(Trajectory neighbor){
		rightNeighbor = neighbor;
	}
	
	public void addTop(Trajectory neighbor){
		topNeighbor = neighbor;
	}
	
	public void addBottom(Trajectory neighbor){
		bottomNeighbor = neighbor;
	}
	
	public Trajectory getLeft(){
		return leftNeighbor;
	}
	
	public Trajectory getRight(){
		return rightNeighbor;
	}
	
	public Trajectory getTop(){
		return topNeighbor;
	}
	public Trajectory getBottom(){
		return bottomNeighbor;
	}


	
	public Coordinate getVertex()
	{
		return vertex;
	}
	
	public int getDirection()
	{
		return direction;
	}
	
	public int getSize()
	{
		return sizeT;
	}
	
	public void draw(Graphics2D g2)
	{
		
		if(direction == 1){
			g2.setColor(Color.blue);
		}else{
			g2.setColor(Color.red);
		}
		
		if(getTop() != null){
			g2.setColor(Color.GREEN);
		}
		//g2.setColor(Color.black);
		g2.draw(new Ellipse2D.Double(vertex.geti() - sizeT / 2, vertex.getj() - sizeT / 2, sizeT, sizeT));
	}
}
