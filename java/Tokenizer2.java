import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Tokenizer2
{
   ArrayList<Person> peeps = new ArrayList<Person>();    
  
   public void readFile()
   {
      try
      {
         Scanner in = new Scanner(new File("People2.csv"));
         while (in.hasNextLine())
         {
            String line = in.nextLine();
            System.out.println(line);
            String[] attributes = line.split(",");         
            peeps.add(new Person(attributes[0],attributes[1]));

         }
         in.close();
      }
      catch (IOException exception)
      {
         System.out.println("Error processing file: " + exception);
      }     
   }

   public void show()
   {
     for(Person p: peeps)
       System.out.println(p);
   }

   public static void main(String[] args)
   {
      Tokenizer2 t = new Tokenizer2();
      t.readFile();
      t.show();
   }
}
