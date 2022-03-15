package methods;

public class overloadMethod {
	public double area(double b,double h) {
		
		return (0.5*b*h);
		
	}
		public void area(int r) {
			System.out.println("Area of Circle: "+(3.14*r*r));
		}
	public static void main(String args[]) {
		overloadMethod ob=new overloadMethod();
		ob.area(10, 20);
		ob.area(5);
	}
}
