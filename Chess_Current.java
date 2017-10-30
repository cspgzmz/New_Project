
public class Chess_Current {
	
	private int index_x;
	private int index_y;
	
	public Chess_Current (int x, int y)
	{
		this.index_x=x;
		this.index_y=y;
	}
	
	public void setX(int x)
	{
		index_x = x;
	}
	
	public void setY(int y)
	{
		index_y = y;
	}
	
	public int getX ()
	{
		return(index_x);
	}
	
	public int getY ()
	{
		return(index_y);
	}
	
	public void printXY ()
	{
		System.out.println("Print XY : ");
		System.out.print(getX());
		System.out.print(" ");
		System.out.print(getY());
		System.out.println();
	}

}
