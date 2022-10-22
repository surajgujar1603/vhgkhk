package syncronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait_study {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\salenium SOFTWARE\\chromedriver_win32\\driver.chrome.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(2000);
//	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  
	}

}
