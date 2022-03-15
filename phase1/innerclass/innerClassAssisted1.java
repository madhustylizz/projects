package innerclass;

public class innerClassAssisted1 {
	private String msg="Welcome to Java";
	class Inner{
		void hello() {
			System.out.println(msg+", Let us start Learning Inner Class");
			
		}
	}
	public static void main(String[] args) {
		innerClassAssisted1 ica=new innerClassAssisted1();
		innerClassAssisted1.Inner in=ica.new Inner();
		in.hello();
	}

}
