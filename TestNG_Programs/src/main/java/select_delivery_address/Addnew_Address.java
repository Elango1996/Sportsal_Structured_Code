package select_delivery_address;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addnew_Address {

	@FindBy(id = "com.cricketronics.sportsal:id/button_add_new_address")
	public static WebElement click_add_address;
	
	@FindBy(id = "com.cricketronics.sportsal:id/button_set_location")
	public static WebElement set_your_location;
	
	@FindBy(id = "android:id/button1")
	public static WebElement click_yes_permission;
	
	@FindBy(id ="com.android.packageinstaller:id/permission_allow_button" )
	public static WebElement click_allow;
	
	@FindBy(id="com.cricketronics.sportsal:id/location_confirm_button")
	public static WebElement confirm_location;
	
	@FindBy(id = "com.cricketronics.sportsal:id/location_name_others")
	public static WebElement click_others;
	
	@FindBy(id = "com.cricketronics.sportsal:id/location_name")
	public static WebElement enter_landmark;
	
	@FindBy(id = "com.cricketronics.sportsal:id/check_box_tick")
	public static WebElement click_save_checkBox;
	
	@FindBy(id ="com.cricketronics.sportsal:id/button_next" )
	public static WebElement address_nextButton;
	
	@FindBy(id = "com.cricketronics.sportsal:id/check_box_tick")
	public static WebElement selectAddress;
	
	
	
	
	
	
}
