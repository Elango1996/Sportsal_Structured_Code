package jersey_Flow_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_With_Otp {
public	static WebDriver driver;
	
	@FindBy(id = "com.cricketronics.sportsal:id/button_get_started")
	public static WebElement Get_Start;
	
	@FindBy(id = "com.cricketronics.sportsal:id/edit_text_mobile_number")
	public static WebElement enter_Number;
	
	@FindBy(id = "com.cricketronics.sportsal:id/button_login_with_otp")
	public static WebElement enter_Otp; 

	@FindBy(id = "com.cricketronics.sportsal:id/edit_text_otp_one")
	public static WebElement enter_One;
	
	@FindBy(id = "com.cricketronics.sportsal:id/edit_text_otp_two")
	public static WebElement enter_two;
	
	@FindBy(id = "com.cricketronics.sportsal:id/edit_text_otp_three")
	public static WebElement enter_three;
	
	@FindBy(id = "com.cricketronics.sportsal:id/edit_text_otp_four")
	public static WebElement enter_four;
	
	@FindBy(id = "com.cricketronics.sportsal:id/button_next_otp")
	public static WebElement next_otp_button1;
}
