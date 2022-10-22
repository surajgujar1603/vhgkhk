package study_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study_basic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\salenium SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		//d.get(0KCQjwyOuYBhCGARIsAIdGQRNYQ5hc4wi3KKf2twq0Zu-vL-JNLsbW2xxi1YlNfZiMXMcXiPf8-_gaAp7VEALw_wcB_k_&gclid=Cj0KCQjwyOuYBhCGARIsAIdGQRNYQ5hc4wi3KKf2twq0Zu-vL-JNLsbW2xxi1YlNfZiMXMcXiPf8-_gaAp7VEALw_wcB");
		d.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fmobile-phones%2Fb%2F%3Fie%3DUTF8%26node%3D1389401031%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		d.findElement(By.name("email")).click();
	    d.findElement(By.id("pass")).click();
	    
	    
		
		
		
	}

}
