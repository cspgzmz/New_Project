
public class Chess {
	
	public static void main (String [] args)
	{
		
		int [][] chessBoard = chessBoard();
	
		
		Chess_Current current = new Chess_Current (1,1);
		System.out.println("The current index is : ");
		current.printXY();
		int currentValue = getChessValue(chessBoard, current);
		System.out.println("The current point value is : "+currentValue);
		
		
		/*
		Chess_Current [] moves = Chess_Moves.ChessMoves(current);
		Chess_Current [] validMoves = getValidMoves(moves);
		System.out.println("Valid number of moves : "+validMoves.length);
		printValidIndex(validMoves);
		System.out.println("Valid chess values are : ");
		printValidValues(validMoves);
	
		Chess_Current step = Random_Move.randMove(validMoves);
		System.out.println("A random move is : ");
		step.printXY();
		int chessValue = getChessValue(chessBoard, step);
		System.out.println("The step point value is : "+chessValue);
		*/
		int sum = 0;
		System.out.println();
		for (int i=0; i<3; i++)
		{
			System.out.println("Iter : "+i);
			System.out.println("The current index is : ");
			current.printXY();
			
			System.out.println("The current value is : "+getChessValue(chessBoard, current));
			
			
			Chess_Current [] moves = Chess_Moves.ChessMoves(current); //get the list of potential moves
			Chess_Current [] validMoves = getValidMoves(moves); //get the valid moves only
			
			Chess_Current step = Random_Move.randMove(validMoves); // make a random move
			System.out.println("A random move is : ");
			step.printXY();
			int value = getChessValue(chessBoard, step);
			System.out.println("The step random value is : "+value);//get the value for the move
			sum += value;
			
			current = step;
			System.out.println();
			
		}
		
		System.out.println("Sum of values is : "+sum);
	
		
	}
	
	public static int [][] chessBoard ()
	{
		int [][] chessBoard = new int [4][4];
		
		int count = 0;
		
		for (int i=0; i<chessBoard.length; i++)
		{
			for(int j=0; j<chessBoard[i].length; j++)
			{
				
				//System.out.println(count);
				chessBoard[i][j] = count;
				count++;
			}
		}
		return chessBoard;
	}
	
	public static int getChessValue (int [][] chessBoard, Chess_Current xy)
	{
		int x = xy.getX();
		int y = xy.getY();
		
		int val = chessBoard[x][y];
		//System.out.println("Value is : "+val);
		return val;
	}
	
	
	public static Chess_Current [] getValidMoves (Chess_Current [] moves)
	{
		int count = 0;
		for (int i=0; i<moves.length; i++) //just compute how many moves are valid
		{
			Chess_Current move = moves [i];
			 int x = move.getX();
			
			 //System.out.println("x is : "+x);
			 if (x!=-1)
			 {
				 count++;
			 }
			 
		}
		
		//System.out.println("Valid moves is : "+count);
		Chess_Current [] valMoves = new Chess_Current [count];
		
		int countVal = 0;
		for (int i=0; i<moves.length; i++)
		{
			Chess_Current move = moves [i];
			int x = move.getX();
					
			if (x!=-1)
			{
				//System.out.println("countVal : "+countVal);
				valMoves [countVal] = move;
				countVal++;	
			}
			
		}
		
		return valMoves;
	}
	
	
	
	public static void printArray (int [][] array)
	{
		for (int i=0; i<array.length; i++)
		{
			for (int j=0; j<array[i].length; j++)
			{
				System.out.print(array[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void printValidIndex (Chess_Current [] x)
	{
		for (int i=0; i<x.length; i++)
		{
			Chess_Current index = x[i];
			index.printXY();
		}
	}
	
	public static void printValidValues (Chess_Current [] x)
	{
		int [][] chessBoard = chessBoard();
		for (int i=0; i<x.length; i++)
		{
			System.out.println(getChessValue(chessBoard, x[i]));
		}
	}

}
