package regularexpressions;
import java.util.Scanner;
import java.util.regex.*;

public class RegularExpression {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String:");
	String str = "[a-z@A-Z]+";
	String check = sc.nextLine();
	Pattern p = Pattern.compile(str);
	Matcher c = p.matcher(check);

	
	while (c.find())
      	System.out.println( check.substring( c.start(), c.end() ) );
	
	}

}