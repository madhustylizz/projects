package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.support.ui.Select;

public class FlipkartAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("laptops");
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		Thread.sleep(3000);
		WebElement ddAddr=driver.findElement(By.xpath("//div[@class='_3uDYxP']/descendant::select"));
		Select sel=new Select(ddAddr);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Core i3']")).click();
		Thread.sleep(2000);
		WebElement ddAddress =driver.findElement(By.xpath("//div[text()='Operating System']"));
		ddAddress.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		List<WebElement> allprices=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		System.out.println(allprices.size());
		
		for (int i=0;i<allprices.size();i++) {
			System.out.println(allprices.get(i).getText());
		}
		
	}

}
