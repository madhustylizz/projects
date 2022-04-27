package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsinHtml {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/madhu/OneDrive/Desktop/New%20folder%20(2)/home.html");
		Thread.sleep(5000);
		//driver.findElement(By.linkText("checkbox")).click();
		//driver.manage().window().maximize();)
		driver.findElement(By.id("i2")).click();
		
		//driver.findElement(By.id("i2")).click();
		
	
		
	}

}
