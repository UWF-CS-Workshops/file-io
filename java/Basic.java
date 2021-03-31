import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Basic
{

public void readAndWrite()
{
      try
      {
         Scanner in = new Scanner(new File("infile.txt"));
         PrintWriter out = new PrintWriter("outfile.txt");
         
         int a = in.nextInt();
         int b = in.nextInt();
         int c = in.nextInt();
         out.println("The sum of the first\n three ints in\n infile.txt is " + (a+b+c));
         in.close();
         out.close();
      }
      catch (IOException exception)
      {
         System.out.println("Error processing file: " + exception);
      }

}

   public static void main(String[] args)
   {
     Basic b = new Basic();
     b.readAndWrite();
   }
}
