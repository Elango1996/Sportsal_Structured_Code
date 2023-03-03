package jersey_Type;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class click_Back {

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public static WebElement back_Payment;
	
	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public static WebElement back_Order;
	
	@FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public static WebElement back_Address;
	
	public static WebElement quitMethod(WebDriver driver) {
		System.out.println("Going to Quit");
		driver.quit();
		return null;
		
		
	}
	
}
