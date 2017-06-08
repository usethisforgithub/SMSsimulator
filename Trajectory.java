import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Trajectory {

	private Coordinate vertex;
	private int direction;
	private int sizeT;
	
	public Trajectory(Coordinate v, int dir, int s)
	{
		vertex = v;
		direction = dir;
		sizeT = s;
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
		g2.setColor(Color.black);
		g2.draw(new Ellipse2D.Double(vertex.geti() - sizeT / 2, vertex.getj() - sizeT / 2, sizeT, sizeT));
	}
}
