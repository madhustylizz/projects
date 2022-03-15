package methods;

public class methodExecution {
	public int multiplynumbers(int a,int b) {
		int c=a*b;
		return c;
	}
	public String Stringadd(String a, String b) {
		return a+b;
	}
public static void main(String[] args) {
	methodExecution me=new methodExecution();
	int ans=me.multiplynumbers(100, 5);
	System.out.println(("Multiplication is :"+ans));
	String ans1=me.Stringadd("Madhu", "Boya");
	System.out.println(ans1);
}
}
