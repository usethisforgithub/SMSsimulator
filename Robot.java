
public class Robot {

	private int direction;
	private Trajectory t;
	private int angle;
	
	public Robot(int dir, Trajectory traj, int ang)
	{
		direction = dir;
		t = traj;
		angle = ang;
	}
	
	private int getDirection()
	{
		return direction;
	}
	
	private Trajectory getTraj()
	{
		return t;
	}
	
	private int getAngle()
	{
		return angle;
	}
	
}
