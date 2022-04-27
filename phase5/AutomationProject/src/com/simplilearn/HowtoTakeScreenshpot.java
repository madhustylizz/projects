package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class HowtoTakeScreenshpot {


	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("http://yuvadhwaja.in/gallery.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		//for scrolling the window on vertical axis
		//js.executeScript("window.scrollBy(0,1000)");
		//File src=((RemoteWebDriver) js).getScreenshotAs(OutputType.FILE);
		//File dest=new File("C:\\Users\\madhu\\OneDrive\\Desktop\\New folder (2)\\ssh1.jpg");
		//Files.copy(src, dest);
		TakesScreenshot ts=(TakesScreenshot)driver; 
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\madhu\\OneDrive\\Desktop\\New folder (2)\\Fullpage.jpg");
		Files.copy(src, dest);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='initiatives.html']")).click();
	
		Thread.sleep(3000);
		WebElement logo=driver.findElement(By.xpath("//img[@src='images/flood_relief_UK.jpg']"));
		
		File hi=logo.getScreenshotAs(OutputType.FILE);
	    File hello=new File("C:\\Users\\madhu\\OneDrive\\Desktop\\New folder (2)\\HalfImage.jpg");
		Files.copy(hi, hello);
		
		
		
	}

}
