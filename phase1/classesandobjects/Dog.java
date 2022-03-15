package classesandobjects;

import java.util.Scanner;

public class Dog 
{  
    String name; 
    String breed; 
    int age; 
    String color; 
    public Dog(String name, String breed, int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy breed is "+this.getBreed()+" My age is "+ this.getAge()+ " and my color is "+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
    	Scanner sc=new Scanner(System.in);
    	String name=sc.nextLine();
    	String breed=sc.nextLine();
    	String color=sc.nextLine();
    	String age=sc.nextLine();
    	
        Dog scott = new Dog(name,breed, 5, color); 
        System.out.println(scott.toString()); 
    } 
}

