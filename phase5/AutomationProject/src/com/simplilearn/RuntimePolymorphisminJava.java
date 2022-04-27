package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RuntimePolymorphisminJava {
	public static void main(String[] args) {
		WebDriver driver=null;
		Scanner sc=new Scanner(System.in);
		String BrowserName = sc.next();
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver","D:\\New folder\\KCSA3\\AutomationProject\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Enter in another browser");
		}
		
	}

}
