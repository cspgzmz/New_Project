
public class Chess_Moves {
	
	public static void main (String [] args)
	{
		
		   Chess_Current cur = new Chess_Current (2,2);
		   System.out.println("Current XY is : ");
		   cur.printXY();
		   	
		
		Chess_Current [] moves = ChessMoves(cur);
		Chess_Current [] val = Chess.getValidMoves(moves); //valid moves only
		
		printValidMoves(val);
		
		
		
	}
	
	public static Chess_Current [] ChessMoves (Chess_Current current)
	{

		Chess_Current [] moves = new Chess_Current [8];
		Chess_Current defaultXY = new Chess_Current(-1,-1);
		//defaultXY.printXY();
		
		int x = current.getX(); //get the current x value
		int y = current.getY(); //get the current y value
		
		{//1 : +2+1
			int newX = x+2;
			int newY = y+1;
			
			Chess_Current newPoint = new Chess_Current (newX,newY);
			//newPoint.printXY();
			
			//System.out.println("New x is : "+newPoint.getX());
			//System.out.println("New y is : "+newPoint.getY());
			//System.out.println("The new XY 1 is : ");
			//newPoint.printXY();
			
			
			if ((newX>0 && newX <4) && (newY>0 && newY<4)) // condition for the L move in the chess board
			{
				moves[0] = newPoint;
				//System.out.println("Is This is performed");
			}
			else
			{
				//System.out.println("This is performed");
				moves[0] = defaultXY; //store a default value 
			}
				
		}
		
		{//2 : +2-1
			int newX = x+2;
			int newY = y-1;
			
			Chess_Current newPoint = new Chess_Current (newX,newY);
			
			newX = newPoint.getX();
			newY = newPoint.getY();
			
			//System.out.println("New x is : "+newX);
			//System.out.println("New y is : "+newY);
			//System.out.println("The new XY 2 is : ");
			//newPoint.printXY();
			
			if ((newX>=0 && newX <4) && (newY>=0 && newY<4)) // condition for the L move in the chess board
			{
				//System.out.println("This is performed");
				moves[1] = newPoint;
			}
			else
			{
				//System.out.println("This is performed");
				moves[1] = defaultXY; //store a default value 
				//defaultXY.printXY();
			}
				
		}
		
		{//3: -2+1
			int newX = x-2;
			int newY = y+1;
			
			Chess_Current newPoint = new Chess_Current (newX,newY);
			
			newX = newPoint.getX();
			newY = newPoint.getY();
			
			//System.out.println("New x is : "+newX);
			//System.out.println("New y is : "+newY);
			//System.out.println("The new XY 3 is : ");
			//newPoint.printXY();
			
			if ((newX>=0 && newX <4) && (newY>=0 && newY<4)) // condition for the L move in the chess board
			{
				//System.out.println("This is performed");
				moves[2] = newPoint;
			}
			else
			{
				//System.out.println("This is performed");
				moves[2] = defaultXY; //store a default value 
				//defaultXY.printXY();
			}
				
		}
		
		
		{//4: -2-1
			int newX = x-2;
			int newY = y-1;
			
			Chess_Current newPoint = new Chess_Current (newX,newY);
			
			newX = newPoint.getX();
			newY = newPoint.getY();
			
			//System.out.println("New x is : "+newX);
			//System.out.println("New y is : "+newY);
			//System.out.println("The new XY 4 is : ");
			//newPoint.printXY();
			
			if ((newX>=0 && newX <4) && (newY>=0 && newY<4)) // condition for the L move in the chess board
			{
				//System.out.println("This is performed");
				moves[3] = newPoint;
			}
			else
			{
				//System.out.println("This is performed");
				moves[3] = defaultXY; //store a default value 
				//defaultXY.printXY();
			}
				
		}
		
		{//5: +1+2
			int newX = x+1;
			int newY = y+2;
			
			Chess_Current newPoint = new Chess_Current (newX,newY);
			
			newX = newPoint.getX();
			newY = newPoint.getY();
			
			//System.out.println("New x is : "+newX);
			//System.out.println("New y is : "+newY);
			//System.out.println("The new XY 5 is : ");
			//newPoint.printXY();
			
			if ((newX>=0 && newX <4) && (newY>=0 && newY<4)) // condition for the L move in the chess board
			{
				//System.out.println("This is performed");
				moves[4] = newPoint;
			}
			else
			{
				//System.out.println("This is performed");
				moves[4] = defaultXY; //store a default value 
				//defaultXY.printXY();
			}
				
		}
		
		{//6: +1-2
			int newX = x+1;
			int newY = y-2;
			
			Chess_Current newPoint = new Chess_Current (newX,newY);
			
			newX = newPoint.getX();
			newY = newPoint.getY();
			
			//System.out.println("New x is : "+newX);
			//System.out.println("New y is : "+newY);
			//System.out.println("The new XY 6 is : ");
			//newPoint.printXY();
			
			if ((newX>=0 && newX <4) && (newY>=0 && newY<4)) // condition for the L move in the chess board
			{
				//System.out.println("This is performed");
				moves[5] = newPoint;
			}
			else
			{
				//System.out.println("This is performed");
				moves[5] = defaultXY; //store a default value 
				//defaultXY.printXY();
			}
				
		}
		
		
		{//7: -1+2
			int newX = x-1;
			int newY = y+2;
			
			Chess_Current newPoint = new Chess_Current (newX,newY);
			
			newX = newPoint.getX();
			newY = newPoint.getY();
			
			//System.out.println("New x is : "+newX);
			//System.out.println("New y is : "+newY);
			//System.out.println("The new XY 7 is : ");
			//newPoint.printXY();
			
			if ((newX>=0 && newX <4) && (newY>=0 && newY<4)) // condition for the L move in the chess board
			{
				//System.out.println("This is performed");
				moves[6] = newPoint;
			}
			else
			{
				//System.out.println("This is performed");
				moves[6] = defaultXY; //store a default value 
				//defaultXY.printXY();
			}
				
		}
		
		
		{//8: -1-2
			int newX = x-1;
			int newY = y-2;
			
			Chess_Current newPoint = new Chess_Current (newX,newY);
			
			newX = newPoint.getX();
			newY = newPoint.getY();
			
			//System.out.println("New x is : "+newX);
			//System.out.println("New y is : "+newY);
			//System.out.println("The new XY 8 is : ");
			//newPoint.printXY();
			
			if ((newX>=0 && newX <4) && (newY>=0 && newY<4)) // condition for the L move in the chess board
			{
				//System.out.println("This is performed");
				moves[7] = newPoint;
			}
			else
			{
				//System.out.println("This is performed");
				moves[7] = defaultXY; //store a default value 
				//defaultXY.printXY();
			}
				
		}
	
		return moves;
	
	}
	
	public static void printValidMoves(Chess_Current[] valMoves)
	{
		System.out.println("Length : "+valMoves.length);
		
		for (int i=0; i<valMoves.length; i++)
		{
			System.out.println("i : "+i);
			Chess_Current x = valMoves[i];
			x.printXY();
		}
	}

}
