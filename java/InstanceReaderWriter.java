import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InstanceReaderWriter {

    public InstanceReaderWriter()
    {
      createData();
      readData();
    }

    public void createData()
    {
      Person p1 = new Person("John","1234 ABC St Pensacola fl 32514");
      Person p2 = new Person("Sue","1234 XYZ St Pensacola fl 32514");

        try {
            FileOutputStream f = new FileOutputStream(new File("Objects.dat"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(p1);
            o.writeObject(p2);
            o.close();
            f.close();
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

    public void readData()
    {
       try 
       {
            FileInputStream fi = new FileInputStream(new File("Objects.dat"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            Person pr1 = (Person) oi.readObject();
            Person pr2 = (Person) oi.readObject();
            System.out.println(pr1);
            System.out.println(pr2);
            oi.close();
            fi.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) 
    {
      InstanceReaderWriter irw = new InstanceReaderWriter();
      irw.createData();
      irw.readData();
    }

}