import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Trajectory {

	private Coordinate vertex;
	private int direction;
	private final int size = 100;
	
	public Trajectory(Coordinate v, int dir)
	{
		vertex = v;
		direction = dir;
	}
	
	private Coordinate getVertex()
	{
		return vertex;
	}
	
	private int getDirection()
	{
		return direction;
	}
	
	public void draw(Graphics2D g2)
	{
		g2.setColor(Color.red);
		g2.draw(new Ellipse2D.Double(vertex.geti() - size / 2, vertex.getj() - size / 2, size, size));
	}
}
