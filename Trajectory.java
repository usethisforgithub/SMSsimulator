
public class Trajectory {

	private Coordinate vertex;
	private int direction;
	
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
}
