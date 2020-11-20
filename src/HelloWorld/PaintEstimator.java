package HelloWorld;
import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class PaintEstimator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double wallHeight;
      double wallWidth;
      double wallArea;
      final double GAL_PAINT_COVER = 350;
      
      System.out.println("Enter wall height (feet):");
      wallHeight = scnr.nextDouble();
      
      System.out.println("Enter wall width (feet):"); // FIXME (1): Prompt user to input wall's width
      wallWidth = scnr.nextDouble();
      
      // Calculate and output wall area
      // FIXME (1): Calculate the wall's area
      wallArea = (wallHeight * wallWidth);
      System.out.println("Wall area: " + wallArea + " square feet");     // FIXME (1): Finish the output statement
      
      // FIXME (2): Calculate and output the amount of paint in gallons needed to paint the wall
      System.out.println("Paint needed: " + wallArea / GAL_PAINT_COVER + " gallons");
      // FIXME (3): Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
      System.out.println("Cans needed: " + (int)Math.ceil(wallArea / GAL_PAINT_COVER) + " can(s)");
   }
}