package classesandobjects;

 class Encapsulate
{ 
    private String Name; 
    private int Roll; 
    private int Age;
    public int getAge()  
    { 
      return Age; 
    } 
    public String getName()  
    { 
      return Name; 
    } 
    public int getRoll()  
    { 
       return Roll; 
    } 
    public void setAge( int newAge) 
    { 
      Age = newAge; 
    } 
    public void setName(String newName) 
    { 
      Name = newName; 
    } 
    public void setRoll( int newRoll)  
    { 
      Roll = newRoll; 
    } 
}
public class Encapsulation 
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
        obj.setName("Madhu"); 
        obj.setAge(21); 
        obj.setRoll(466); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll no: " + obj.getRoll());      
    } 
}
