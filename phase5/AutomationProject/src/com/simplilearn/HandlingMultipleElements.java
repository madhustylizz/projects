package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/madhu/OneDrive/Desktop/html/index.html");
		driver.manage().window().maximize();
		WebElement linkAddress=driver.findElement(By.xpath("//a[text()='Home']"));
		//linkAddress.click();
		System.out.println(linkAddress.getText());
		
		//1.count the number of Elements
		List<WebElement> AllLinks = driver.findElements(By.xpath("//*"));
		System.out.println(AllLinks.size());
		//2.print the text of all elements
		for(int i=0;i<AllLinks.size();i++) {
			System.out.println(AllLinks.get(i).getText());
		}
		
		
	}

}
