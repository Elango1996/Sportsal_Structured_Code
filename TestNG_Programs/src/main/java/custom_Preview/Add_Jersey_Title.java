package custom_Preview;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Jersey_Title {

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Image[2]")
	public static WebElement preview_Screen_Nextbutton;
	
//	check
	@FindBy(id = "com.cricketronics.sportsal:id/nextButton")
	public static WebElement preview_t;
	
	@FindBy(id ="com.cricketronics.sportsal:id/jersey_name_edit_text" )
	public static WebElement add_Jeresy_Title;
	
	@FindBy(id ="com.cricketronics.sportsal:id/save_name_button" )
	public static WebElement save_Next_Button;
	
	
	
	
	
}
