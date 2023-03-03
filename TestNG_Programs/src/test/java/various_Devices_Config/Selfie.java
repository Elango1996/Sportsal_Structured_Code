package various_Devices_Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selfie {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Augray\\\\eclipse-workspace\\\\new\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("www.amazon.com");
		System.out.println("done");
		
		
		
		
		
	}
	
	
	
}


