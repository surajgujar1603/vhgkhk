package study_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\salenium SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver A=new ChromeDriver();
		A.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804932%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804932&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI9L64h56d-gIVhZVLBR2J6gK4EAAYASAAEgLjkPD_BwE");
		
		
	}

}
