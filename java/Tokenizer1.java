import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tokenizer1
{
   public static void main(String[] args)
   {
      try
      {
         Scanner in = new Scanner(new File("People.csv"));
         PrintWriter out = new PrintWriter("parsed.txt");
         
         while (in.hasNextLine())
         {
            String line = in.nextLine();
            String[] attributes = line.split(",");
            for(int i = 0; i < attributes.length; i++)
              out.println(attributes[i]);
         }
         in.close();
         out.close();
      }
      catch (IOException exception)
      {
         System.out.println("Error processing file: " + exception);
      }
   }
}
