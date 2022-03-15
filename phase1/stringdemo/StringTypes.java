package stringdemo;
public class StringTypes {

	public static void main(String[] args) {
		//methods of strings
		System.out.println("Different Types  of Strings");
		
		String sl=new String("Hello Simplilearn");
		System.out.println(sl.length());

		//substring
		String sub=new String("Welcome");
		                     //0123456
		System.out.println(sub.substring(2));

		//String Comparison
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));

		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());

		//toLowerCase
		String s5="MaDhuBoYa";
		System.out.println(s5.toLowerCase());
		
		//replace
		String s6="Hello";
		String replace=s6.replace("ello", "ikes");
		System.out.println(replace);

		//equals
		String x="Welcome to Java";
		String y="WeLcOmE tO JaVa";
		System.out.println(x.equals(y));
 
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		//Creating StringBuffer and append method
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);

		//insert method
		s.insert(0, "Hey ");
		System.out.println(s);

		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEL");
		System.out.println(sb);

		//delete method
		sb.delete(0, 2);
		System.out.println(sb);
		//index 0 and index 1 will be deleted
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("New Year");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(0, "Welcome "));

		System.out.println(sb1.reverse());
				
		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
        
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        // conversion from String object to StringBuilder 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("Simplilearn"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              		
	}
}
