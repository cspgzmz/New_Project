import org.apache.commons.math3.stat.descriptive.*;

/*
 Author : Zairul Mazwan.
 This program is written for the Incubator challenge 2017.
*/

public class Chess_Stat {
	
	public static void main (String [] args)
	{
		
		int [][] chessBoard = Chess.chessBoard();
	
		
		Chess_Current current = new Chess_Current (1,1); //initial start point
		System.out.println("The initial index is : ");
		current.printXY();
		int currentValue = Chess.getChessValue(chessBoard, current);
		System.out.println("The initial point value is : "+currentValue);
		
		
		int sum = 0;
		System.out.println();
		int T = 16;
		int [] data = new int [T];
		
		for (int i=0; i<T; i++)
		{
			System.out.println("Iter : "+i);
			System.out.println("The current index is : ");
			current.printXY();
			
			System.out.println("The current value is : "+Chess.getChessValue(chessBoard, current));
			
			
			Chess_Current [] moves = Chess_Moves.ChessMoves(current); //get the list of potential moves
			Chess_Current [] validMoves = Chess.getValidMoves(moves); //get the valid moves only
			
			Chess_Current step = Random_Move.randMove(validMoves); // make a random move
			System.out.println("A random move is : ");
			step.printXY();
			int value = Chess.getChessValue(chessBoard, step);
			data[i] = value;
			System.out.println("The step random value is : "+value);//get the value for the move
			sum += value;
			
			current = step;
			System.out.println();
			
		}
		
		System.out.println("Sum of values is : "+sum);
		System.out.println("Mean is : "+sum/16.0);
		
		DescriptiveStatistics stats = new DescriptiveStatistics();
		
		for(int i=0; i<data.length; i++)
		{
			stats.addValue(data[i]);
		}
		
		
		double meanS = stats.getMean();
		double modMeanS = meanS % 13;
		System.out.println("Mean of values is : "+meanS);
		System.out.println("Mod mean S is : "+modMeanS);
		System.out.println("Standard deviation of values is : "+stats.getStandardDeviation());
		print(data);
		
	}
	
	public static void print (int [] x)
	{
		for (int i=0; i<x.length; i++)
		{
			System.out.print(x[i]);
			System.out.print(" ");
		}
	}

}
