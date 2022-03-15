package arithcalculator;
	import java.util.Scanner;

	public class ArithmaticCalculator{
		public static void main(String[] args) {
			
			System.out.println("What are you going to do?");
			System.out.println("Additon, Subtraction, Multiplication, Division");
			while(true) {
			Scanner sc =new Scanner(System.in);
			String str=sc.nextLine();
			String hey=str.toLowerCase();
			if(hey.equals("addition")) {
				while(true) {
					
				double sum=0;
				System.out.print("Enter a Number :");
				double a=sc.nextDouble();
				System.out.print("Enter another Number :");
				double b=sc.nextDouble();
				sum=a+b;
				System.out.println("sum of two numbers is :"+sum+"\n");
					}
					
				}
			else if(hey.equals("subtraction")) {
				while(true) {
				double sub;
				System.out.print("Enter a Number :");
				double a=sc.nextDouble();
				System.out.print("Enter another Number :");
				double b=sc.nextDouble();
				sub=a-b;
				System.out.println("sub of two numbers is :"+sub+"\n");	
				}
			}
			else if(hey.equals("multiplication")) {
				while(true) {
				double mul;
				System.out.print("Enter a Number :");
				double a=sc.nextDouble();
				System.out.print("Enter another Number :");
				double b=sc.nextDouble();
				mul=a*b;
				System.out.println("mul of two numbers is :"+mul+"\n");	
				}
			}
			else if(hey.equals("division")) {
				while(true) {
				double div;
				System.out.print("Enter a Number :");
				double a=sc.nextDouble();
				System.out.print("Enter another Number :");
				double b=sc.nextDouble();
				div=a/b;
				System.out.println("div of two numbers is :"+div+"\n");
				}
			}
			else {
				System.out.println("Please enter anyone shown above");
			}
			}
			
		}
	}



