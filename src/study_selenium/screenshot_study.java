package study_selenium;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

;

public class screenshot_study {
	static WebDriver Driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\salenium SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		 Driver = new ChromeDriver();
		Driver.get("https://kite.zerodha.com/");
	    Driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Driver.manage().window().maximize();
	    Capturecreenshot();
	   
	    
	   }
	public static void Capturecreenshot() throws IOException, InterruptedException {
		Date D= new Date();
		DateFormat df = new SimpleDateFormat("dd_MM_yyyy");
		String FormatedDate=df.format(D);

		File src =((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest = new File("C:\\Users\\suraj\\Desktop\\suraj screenshot\\zerodha"+FormatedDate+".png");+
		
		FileHandler.copy(src, dest);
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
