package order_summary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Continue {

	
	@FindBy(id="com.cricketronics.sportsal:id/button_continue")
	public static WebElement continue_Address;
	
	
	@FindBy(id = "com.cricketronics.sportsal:id/continueButton")
	public static WebElement order_screen_continue;
}
