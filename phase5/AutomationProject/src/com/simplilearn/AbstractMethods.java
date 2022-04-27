package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(1500);
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getCurrentUrl());
		
		//driver.manage().window().minimize();
		//Thread.sleep(1000);
		//driver.manage().window().maximize();
		Dimension d=new Dimension(700,300);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		
		Point p=new Point(500,500);
		driver.manage().window().setPosition(p);
		
		
	}

}
