package jersey_Home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Choose_Jersey {

	@FindBy(id = "com.cricketronics.sportsal:id/create_new_button")
	public static WebElement generate_New1;
	
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")
	public static WebElement create_Jersey;
	
	@FindBy(id = "com.cricketronics.sportsal:id/generateButton")
	public static WebElement generate_New_Pattern;
	
}
