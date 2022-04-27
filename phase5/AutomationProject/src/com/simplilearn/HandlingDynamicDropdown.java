package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement search=driver.findElement(By.name("q"));
		Thread.sleep(2000);
		search.sendKeys("qspiders hyderabad");
		List<WebElement> optionlist=driver.findElements(By.xpath("//li[@class=\"sbct\"]"));
		for(int i=0;i<=optionlist.size()-1;i++) {
			String text=optionlist.get(i).getText();
			
			if(text.equalsIgnoreCase("qspiders hyderabad reviews")) {
				optionlist.get(i).click();
				
				System.out.println("Reviews are found");
				break;
				
			}else {
				System.out.println("Reviews are not Found");
			}
			
		}
	}

}
