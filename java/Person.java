import java.io.Serializable;

class Person implements Serializable
{
  private static final long serialVersionUID = 1L;
  private String name;
  private String address;
    
  public Person(String name, String address)
  {
    this.name = name;
    this.address = address;
  }

  public String getName() { return name; }
  public String getAddress() { return address; } 
  
  public void setName(String name) { this.name = name; }
  public void setAddress(String address) { this.address = address; } 
  
  public String toString()
  {
    return "name: " + name + " address: " + address;  
  } 
}