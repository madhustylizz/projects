package diamondproblem;

interface First 
{  
    default void show() 
    { 
        System.out.println("This is First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("This is Second"); 
    } 
}  
public class TestClass implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        TestClass ob = new TestClass(); 
        ob.show(); 
    } 
}
