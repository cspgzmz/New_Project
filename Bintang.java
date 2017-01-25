import java.util.*;
public class Bintang
{
    public static void leftTriangle()
    {
        Scanner input = new Scanner (System.in);
        System.out.print("How many rows: ");
        int rows = input.nextInt();
        for (int x = 1; x <= rows; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void rightTriangle()
    {
        Scanner input = new Scanner (System.in);
        System.out.print("How many rows: ");
        int rows = input.nextInt();
        for (int x = 1; x <= rows; x++)
        {
            for (int i = 1; i >= x; i--)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    public static void centerTriangle()
    {
    	Scanner input = new Scanner (System.in);
        System.out.print("How many rows: ");
        int rows = input.nextInt();
        for (int x = 1; x <= rows; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        } 	
    }
    
    
    
    public static void main (String args [])
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Types of Triangles");
        System.out.println("\t1. Left");
        System.out.println("\t2. Right");
        System.out.println("\t3. Center");
        System.out.print("Enter a number: ");
        int menu = input.nextInt();
        if (menu == 1)
            leftTriangle();
        if (menu == 2)
            rightTriangle();
        if (menu == 3)
            centerTriangle();
    }
}