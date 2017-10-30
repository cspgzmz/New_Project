import java.io.BufferedWriter;
import java.io.FileWriter;

public class Write_Results {
	
	public static void write_results (double [][] data)
	{
		String path = "C:\\Java Output\\Incubator\\Result.txt";
		
		
		try
		{
		
			FileWriter fw = new FileWriter (path);
			BufferedWriter bw = new BufferedWriter (fw);
			
			for (int i=0; i<data[0].length-6; i++)
			{
				bw.write("Val_"+Integer.toString(i));
				bw.write(" ");
			}
			
			bw.write("Sum");
			bw.write(" ");
			bw.write("Mod7");
			bw.write(" ");
			bw.write("Mod43");
			bw.write(" ");
			bw.write("Means");
			bw.write(" ");
			bw.write("Means%311");
			bw.write(" ");
			bw.write("Std");
			bw.newLine();
			
			for (int i=0; i<data.length; i++)
			{
				for (int j=0; j<data[i].length; j++)
				{
					bw.write(Double.toString(data[i][j]));
					bw.write(" ");
				}
				
				bw.newLine();
			}
			bw.close();
			fw.close();
		}
		catch (Exception e)
		{
			System.err.println("Problem writing bundles to the file");
		}
		
	}

}
