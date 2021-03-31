import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LineNumberer
{

   public void process()
   {
      String inputFileName = "LineNumberer.java";
      String outputFileName = "LineNumberer.txt";
      try
      {
         Scanner in = new Scanner(new File(inputFileName));
         PrintWriter out = new PrintWriter(outputFileName);
         int lineNumber = 1;
         
         while (in.hasNextLine())
         {
            String line = in.nextLine();
            System.out.println("Processing : " + line);
            out.println("/* " + lineNumber + " */ " + line);
            lineNumber++;
         }

         out.close();
      }
      catch (IOException exception)
      {
         System.out.println("Error processing file: " + exception);
      }
     
   }

   public static void main(String[] args)
   {
      LineNumberer ln = new LineNumberer();
      ln.process();
   }
}
