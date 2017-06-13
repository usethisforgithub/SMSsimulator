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
	private Arc arc1;
	private Arc arc2;
	private Arc arc3;
	private Arc arc4;
	
	
	public Trajectory(Coordinate v, int dir, int s)
	{
		arc1 = new Arc(this,1);
		arc2 = new Arc(this,2);
		arc3 = new Arc(this,3);
		arc4 = new Arc(this,4);
		bots = new ArrayList<Robot>();
		leftNeighbor = null;
		rightNeighbor = null;
		topNeighbor = null;
		bottomNeighbor = null;
		vertex = v;
		direction = dir;
		sizeT = s;
	}
	
	public void setArc1(Arc a){
		arc1 = a;
	}
	
	public void setArc2(Arc a){
		arc2 = a;
	}
	
	public void setArc3(Arc a){
		arc3 = a;
	}
	
	public void setArc4(Arc a){
		arc4 = a;
	}
	
	public Arc getArc1(){
		return arc1;
	}
	public Arc getArc2(){
		return arc2;
	}
	
	public Arc getArc3(){
		return arc3;
	}
	
	public Arc getArc4(){
		return arc4;
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
			if(Utilities.radianEq(e.getAngle(), 2*Math.PI) ||Utilities.radianEq(e.getAngle(), -2*Math.PI)||Utilities.radianEq(e.getAngle(), 0)){
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
		g2.setColor(arc1.getColor());
		g2.drawArc(vertex.geti()- sizeT / 2, vertex.getj()- sizeT / 2, sizeT, sizeT, 0, 90);
		
		g2.setColor(arc2.getColor());
		g2.drawArc(vertex.geti()- sizeT / 2, vertex.getj()- sizeT / 2, sizeT, sizeT, 90, 90);
		
		g2.setColor(arc3.getColor());
		g2.drawArc(vertex.geti()- sizeT / 2, vertex.getj()- sizeT / 2, sizeT, sizeT, 180, 90);
		
		g2.setColor(arc4.getColor());
		g2.drawArc(vertex.geti()- sizeT / 2, vertex.getj()- sizeT / 2, sizeT, sizeT, 270, 90);
		//if(direction == 1){
		//	g2.setColor(Color.blue);
		//}else{
		//	g2.setColor(Color.red);
		//}
		
		//original
		g2.setColor(Color.black);
		g2.draw(new Ellipse2D.Double(vertex.geti() - sizeT / 2, vertex.getj() - sizeT / 2, sizeT, sizeT));
	}
}
