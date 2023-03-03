package jersey_3d_View;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Jersey_View {

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button")
	public static WebElement preview_button_3d;
	
	@FindBy(id = "com.cricketronics.sportsal:id/name_edit_text")
	public static WebElement j_name;
	
	@FindBy(id = "com.cricketronics.sportsal:id/number_edit_text")
	public static WebElement j_number;
	
	@FindBy(id = "com.cricketronics.sportsal:id/button_proceed")
	public static WebElement proceed_Button;
	
	
	
	
	
	
}
