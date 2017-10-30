import org.apache.commons.math3.stat.descriptive.*;
public class Probability {
	
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
		int T = 512;
		int j = 10000;
		double [][] data = new double [j][T+6];
		
		for (int k=0; k<j; k++)
		{
			System.out.println("Iter : "+k);
			current = new Chess_Current (0,0); //initial start point
			sum=0;
			
			for (int i=0; i<T; i++)
			{
				
				System.out.println("The current index is : ");
				current.printXY();
				
				System.out.println("The current value is : "+Chess.getChessValue(chessBoard, current));
				
				
				Chess_Current [] moves = Chess_Moves.ChessMoves(current); //get the list of potential moves
				Chess_Current [] validMoves = Chess.getValidMoves(moves); //get the valid moves only
				
				Chess_Current step = Random_Move.randMove(validMoves); // make a random move
				System.out.println("A random move is : ");
				step.printXY();
				int value = Chess.getChessValue(chessBoard, step);
				data[k][i] = value;
				System.out.println("The step random value is : "+value);//get the value for the move
				sum += value;
				
				current = step;
				System.out.println();
				
			}
			
			DescriptiveStatistics stats = new DescriptiveStatistics();
			
			for(int i=0; i<data[0].length-6; i++)
			{
				stats.addValue(data[k][i]);
			}
			
			data [k][T]= sum;
			
			double mod7 = sum % 7;
			double mod43 = sum % 43;
			double meanS = stats.getMean();
			
			System.out.println("Mean of values is : "+meanS);
			System.out.println("Standard deviation of values is : "+stats.getStandardDeviation());
			
			if (mod7 == 0)
			{
				data [k][T+1]= 1;
			}
			else
			{
				data [k][T+1]= 0;
			}
			
			if (mod43 == 0)
			{
				data [k][T+2]= 1;
			}
			else
			{
				data [k][T+2]= 0;
			}
			
			
			data[k][T+3] = meanS;
			data[k][T+4] = meanS%311;
			data[k][T+5] = stats.getStandardDeviation();
		}
		
		Write_Results.write_results(data);
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
