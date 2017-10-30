import java.util.Random;

public class Random_Move {
	
	public static void main (String [] args)
	{
		Random rand = new Random (System.currentTimeMillis());
		
		
		for (int i=0; i<100; i++)
		{
			int r = rand.nextInt(3);
			System.out.println(r);
		}
		
	}
	
	
	public static Chess_Current randMove (Chess_Current [] validMoves)
	{
		Chess_Current randMove =  null;
		int length = validMoves.length;
		
		Random rand = new Random(System.currentTimeMillis());
		
		int r = rand.nextInt(length);
		
		randMove = validMoves[r];
		
		return randMove;
	}

}
