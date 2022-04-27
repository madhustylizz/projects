package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\KCSA3\\AutomationProject\\drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
	}

}
