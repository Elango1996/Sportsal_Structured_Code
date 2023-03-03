package oder_Screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Order_Screen {

	@FindBy(id ="com.cricketronics.sportsal:id/logo_image" )
	public static WebElement click_Created_Jersey;
	
	@FindBy(id ="com.cricketronics.sportsal:id/nextButton" )
	public static WebElement click_Order_Button;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")
	public static WebElement click_Quantity;
	
	@FindBy(id = "com.cricketronics.sportsal:id/touch_outside")
	public static WebElement outsit_Quantity;
	
	@FindBy(id = "com.cricketronics.sportsal:id/player_name_text_input")
	public static WebElement enter_player_name;
	
	@FindBy(id ="com.cricketronics.sportsal:id/player_number_edit_text_input" )
	public static WebElement enter_player_number;
	
	@FindBy(id = "com.cricketronics.sportsal:id/player_size_edit_text_input")
	public static WebElement click_size;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker/android.widget.Button")
	public static WebElement choose_size;
	
	@FindBy(id = "com.cricketronics.sportsal:id/updateQuantityButton")
	public static WebElement click_outside;
	
	@FindBy(id = "com.cricketronics.sportsal:id/nextButton")
	public static WebElement Place_Order;
	
	
	
	
	
	
}
