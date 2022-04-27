package qsp;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class practiceTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().to("https://www.google.com");
		dri
		

	}

}
