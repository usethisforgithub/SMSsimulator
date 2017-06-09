import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Robot {

	
	private Trajectory t;
	private double angle;
	private int sizeR;
	
	public Robot( Trajectory traj, double ang)
	{
		
		t = traj;
		angle = ang;
		sizeR = t.getSize()/5;
	}
	
	public Trajectory getTraj()
	{
		return t;
	}
	
	public void setAngle(double a){
		angle = a;
	}
	
	public double getAngle()
	{
		return angle;
	}
	
	public void draw(Graphics2D g2)
	{
		g2.setColor(Color.black);
		//g2.fill((Shape) Color.black);
		g2.fill(new Ellipse2D.Double(t.getVertex().geti() + t.getSize()/2*Math.cos(angle) - sizeR/2, t.getVertex().getj() + t.getSize()/2*Math.sin(angle) - sizeR/2, sizeR, sizeR));//t.getSize()*Math.cos(angle)
	}
	
}
