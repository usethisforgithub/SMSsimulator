
public class Coordinate {
	
	private int i;
	private int j;
	
	public Coordinate(double i, double j){
		this.i = (int)i;
		this.j = (int)j;
	}
	
	public Coordinate(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	public int geti()
	{
		return i;
	}
	
	public int getj()
	{
		return j;
	}
}
