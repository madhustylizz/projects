package methods;

public class callMethod {
	int val=150;
	int operation(int val) {
		val=val*10/100;
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callMethod cm=new callMethod();
		System.out.println("Before operation value is "+cm.val);
		int ans=cm.operation(450);
		System.out.println("After operation value os data is "+ans);
		

	}

}
