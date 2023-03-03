package jerseyFlow;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v106.page.Page;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import custom_Preview.Add_Jersey_Title;
import io.appium.java_client.android.AndroidDriver;
import jersery_Logo.Jersey_Logo;
import jersey_3d_View.Jersey_View;
import jersey_Back.Jersey_Back;
import jersey_Flow_Pages.Login_With_Otp;
import jersey_Home.Choose_Jersey;
import jersey_Home.CreateNew;
import jersey_Type.Collar_Type;
import jersey_Type.click_Back;
import logo_Position.Logo_Position;
import oder_Screen.Order_Screen;
import order_summary.Continue;
import select_delivery_address.Addnew_Address;
import select_delivery_address.Permission_Allow;

public class Normal_Flow {
	public static AndroidDriver driver;
//	public static void main(String[] args) throws MalformedURLException, InterruptedException {
@Test
	public static void run()throws MalformedURLException, InterruptedException{
	DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","9");
		cap.setCapability("udid","95de745c");
		cap.setCapability("deviceName", "OnePlus 5");
//		cap.setCapability("deviceName", "OnePlus Nord CE 2 Lite 5G");
		cap.setCapability("appPackage","com.cricketronics.sportsal");
		cap.setCapability("appActivity","com.cricketronics.sportsal.ui.onboarding.CommonOnboardActivity");
		
		
		URL url =new URL("http://0.0.0.0:4723/wd/hub/");
		driver =new AndroidDriver(url,cap);
		

//		WebElement Login = driver.findElement(By.id("com.cricketronics.sportsal:id/button_get_started"));
//		Login.click();
//		PageFactory.initElements(driver, Login_With_Otp.class);
//		Login_With_Otp.Get_Start.click();
//		
//		Login_With_Otp.enter_Number.sendKeys("9003180496");
//		Thread.sleep(5000);
//		
//		Login_With_Otp.enter_Otp.click();
//		Thread.sleep(5000);
//		
//		Login_With_Otp.enter_One.sendKeys("1");
//		Login_With_Otp.enter_two.sendKeys("2");
//		Login_With_Otp.enter_three.sendKeys("3");
//		Login_With_Otp.enter_four.sendKeys("4");
//		Thread.sleep(3000);
//		Login_With_Otp.next_otp_button1.click();
//		Thread.sleep(7000);
		
		
//		Thread.sleep(3000);
//		WebElement number = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_mobile_number"));
//		number.sendKeys("9003180496");
		
		

//		WebElement otp = driver.findElement(By.id("com.cricketronics.sportsal:id/button_login_with_otp"));
//		otp.click();
//		pin.click();
		System.out.println("super");
//		Thread.sleep(5000);
		
//		WebElement one = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_otp_one"));
//		one.sendKeys("1");
//		WebElement two = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_otp_two"));
//		two.sendKeys("2");
//		WebElement three = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_otp_three"));
//		three.sendKeys("3");
//		WebElement four = driver.findElement(By.id("com.cricketronics.sportsal:id/edit_text_otp_four"));
//		four.sendKeys("4");
//		
		
		
//		WebElement next = driver.findElement(By.id("com.cricketronics.sportsal:id/button_next_otp"));
//		next.click();
		
//		PageFactory.initElements(driver, CreateNew.class);
//		CreateNew.Click_Jersey.click();
//		Thread.sleep(15000);
//		
		
//		WebElement jersey = driver.findElement(By.id("com.cricketronics.sportsal:id/customizeImageView"));
//		jersey.click();
		
//		PageFactory.initElements(driver, Choose_Jersey.class);
//		Choose_Jersey.generate_New1.click();
//		Thread.sleep(3000);
//		Choose_Jersey.create_Jersey.click();
//		Thread.sleep(5000);
//		Choose_Jersey.generate_New_Pattern.click();
//		Thread.sleep(5000);
		
//		WebElement newG = driver.findElement(By.id("com.cricketronics.sportsal:id/create_new_button"));
//		newG.click();
		
		
		
//		WebElement create = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView"));
//		create.click();
//		Thread.sleep(3000);
		
		
		
//		driver.findElement(By.id("com.cricketronics.sportsal:id/generateButton")).click();
//		Thread.sleep(5000);
//		PageFactory.initElements(driver, Collar_Type.class);
//		
//		Collar_Type.t_shirt_Select.click();
//		Collar_Type.t_shirt_Next_.click();
//		Collar_Type.confuse_Next.click();
//		Thread.sleep(12000);
//		System.out.println("going to tap collor");
//		Collar_Type.select_Collor.click();
//		Thread.sleep(3000);
//		System.out.println("going to tap sleeve");
//		Collar_Type.tap_Sleeve.click();
//		Thread.sleep(3000);
//		System.out.println("going to select sleeve");
//		Collar_Type.select_Sleeve.click();
//		Thread.sleep(5000);
//		Collar_Type.next_C_S.click();
//		Thread.sleep(5000);
//		
//		
		
//		WebElement tshirt = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.ImageView"));
//		tshirt.click();
		
//		WebElement selectT = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.ImageView"));
//		selectT.click();
		
		
//		collor
//		WebElement nextt = driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
//		nextt.click();
//		Thread.sleep(12000);
		
		
		
//		WebElement collor_S = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout"));
//		collor_S.click();
//		Thread.sleep(3000);
		System.out.println("done");
				
//		WebElement sleeve_T = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Sleeve Type\"]"));
//		sleeve_T.click();
//		Thread.sleep(3000);
		
//		WebElement sleeve = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
//		sleeve.click();
//		Thread.sleep(5000);
		
//		WebElement next_C = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button"));
//		next_C.click();
		
//		Thread.sleep(5000);
		
//		PageFactory.initElements(driver, Jersey_Back.class);
//		
//		Jersey_Back.jersey_Back.click();
//		Thread.sleep(5000);
//		Jersey_Back.jersey_Back_next.click();
//		Thread.sleep(3000);
		
		
		
//		WebElement j_Back = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
//		j_Back.click();
//		Thread.sleep(5000);
		
//		WebElement next_j = driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
//		next_j.click();
//		Thread.sleep(3000);
//		
//		PageFactory.initElements(driver, Jersey_Logo.class);
//		
//		Jersey_Logo.jersey_Logo.click();
//		Thread.sleep(3000);
//		Jersey_Logo.next_logo.click();
//		Thread.sleep(3000);
		
		
		
//		WebElement j_Logo = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout/android.widget.ImageView"));
//		j_Logo.click();
//		Thread.sleep(3000);
		
//		WebElement next_L = driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
//		next_L.click();
//		Thread.sleep(3000);
		
//		PageFactory.initElements(driver,Logo_Position.class);
//		
//		Logo_Position.logo_Select.click();
//		Thread.sleep(3000);
//		Logo_Position.logo_Finish_Btton.click();
//		Thread.sleep(5000);
		
//		WebElement logo_L = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
//		logo_L.click();
//		Thread.sleep(3000);
		System.out.println("success");
		
//		WebElement logo_P = driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
//		logo_P.click();
//		Thread.sleep(5000);
		
//		PageFactory.initElements(driver,Jersey_View.class);
//		Jersey_View.preview_button_3d.click();Thread.sleep(5000);
//		Jersey_View.j_name.sendKeys("elango");
//		Jersey_View.j_number.sendKeys("777");
//		Jersey_View.proceed_Button.click();Thread.sleep(25000);
		
		
		
		
//		System.out.println("pages done");
		
		
//		WebElement preview = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button"));
//		preview.click();
//		Thread.sleep(5000);
//		
//		WebElement j_Name = driver.findElement(By.id("com.cricketronics.sportsal:id/name_edit_text"));
//		j_Name.sendKeys("elango");
//		
//		WebElement j_number = driver.findElement(By.id("com.cricketronics.sportsal:id/number_edit_text"));
//		j_number.sendKeys("777");
//		
//		WebElement proceed = driver.findElement(By.id("com.cricketronics.sportsal:id/button_proceed"));
//		proceed.click();
//		Thread.sleep(25000);
		
//		PageFactory.initElements(driver, Add_Jersey_Title.class);
//		Add_Jersey_Title.preview_Screen_Nextbutton.click();
//		Add_Jersey_Title.preview_t.click();
//		Add_Jersey_Title.add_Jeresy_Title.sendKeys("Augray");
//		Add_Jersey_Title.save_Next_Button.click();
//		Thread.sleep(5000);

		
		
		
		
		
//		WebElement panel_T = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Image[2]"));
//		panel_T.click();
		
//		WebElement preview_t = driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
//		preview_t.click();
		
//		WebElement jersey_Title = driver.findElement(By.id("com.cricketronics.sportsal:id/jersey_name_edit_text"));
//		jersey_Title.sendKeys("Appium one");
		
//		WebElement preview_SN = driver.findElement(By.id("com.cricketronics.sportsal:id/save_name_button"));
//		preview_SN.click();
//		Thread.sleep(5000);
		
//		PageFactory.initElements(driver, Order_Screen.class);
//		Order_Screen.click_Created_Jersey.click();Thread.sleep(22000);
//		Order_Screen.click_Order_Button.click();
//		Order_Screen.click_Quantity.click();
//		Order_Screen.outsit_Quantity.click();
//		Order_Screen.enter_player_name.sendKeys("Elango");
//		Order_Screen.enter_player_number.sendKeys("007");
//		Order_Screen.click_size.click();
//		Order_Screen.choose_size.click();
//		Order_Screen.click_outside.click();
//		Order_Screen.Place_Order.click();Thread.sleep(3000);
		
		
		
		
//		WebElement created_Jersery = driver.findElement(By.id("com.cricketronics.sportsal:id/logo_image"));
//		created_Jersery.click();
//		Thread.sleep(22000);
		
//		WebElement preview_Screen= driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
//		preview_Screen.click();
		
//		WebElement quantity = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView"));
//		quantity.click();
		
//		WebElement quantity_Outside = driver.findElement(By.id("com.cricketronics.sportsal:id/touch_outside"));
//		quantity_Outside.click();
		
//		WebElement player_Name = driver.findElement(By.id("com.cricketronics.sportsal:id/player_name_text_input"));
//		player_Name.sendKeys("elango");
//		
//		WebElement player_Number = driver.findElement(By.id("com.cricketronics.sportsal:id/player_number_edit_text_input"));
//		player_Number.sendKeys("007");
		
//		WebElement shirt_Size = driver.findElement(By.id("com.cricketronics.sportsal:id/player_size_edit_text_input"));
//		shirt_Size.click();
		
		
//		WebElement shirt_Sizen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.NumberPicker/android.widget.Button"));
//		shirt_Sizen.click();
		
//		WebElement preview_Done = driver.findElement(By.id("com.cricketronics.sportsal:id/updateQuantityButton"));
//		preview_Done.click();
		
//		WebElement place_Order = driver.findElement(By.id("com.cricketronics.sportsal:id/nextButton"));
//		place_Order.click();
//		Thread.sleep(3000);
		
//		PageFactory.initElements(driver, Addnew_Address.class);
//		Addnew_Address.click_add_address.click();
//		Addnew_Address.set_your_location.click();Thread.sleep(3000);
//		Permission_Allow.click_yes_permission.click();Thread.sleep(3000);
//		Permission_Allow.click_allow.click();Thread.sleep(3000);
//		Addnew_Address.confirm_location.click();
//		Addnew_Address.click_others.click();
//		Addnew_Address.enter_landmark.sendKeys("land mark");
//		Addnew_Address.click_save_checkBox.click();
//		Addnew_Address.address_nextButton.click();Thread.sleep(3000);
//		Addnew_Address.selectAddress.click();Thread.sleep(3000);
		
//		WebElement add_Address = driver.findElement(By.id("com.cricketronics.sportsal:id/button_add_new_address"));
//		add_Address.click();
//		
//		WebElement set_Location = driver.findElement(By.id("com.cricketronics.sportsal:id/button_set_location"));
//		set_Location.click();
//		Thread.sleep(3000);
//		
//		WebElement yes_Button = driver.findElement(By.id("android:id/button1"));
//		yes_Button.click();
//		Thread.sleep(3000);
//		
//		WebElement allow = driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
//		allow.click();
//		Thread.sleep(3000);
//		
//		WebElement confirm_Location = driver.findElement(By.id("com.cricketronics.sportsal:id/location_confirm_button"));
//		confirm_Location.click();
//		
//		WebElement others = driver.findElement(By.id("com.cricketronics.sportsal:id/location_name_others"));
//		others.click();
//		
//		WebElement location_Name = driver.findElement(By.id("com.cricketronics.sportsal:id/location_name"));
//		location_Name.sendKeys("land mark");
//		
//		WebElement check_Box_Save = driver.findElement(By.id("com.cricketronics.sportsal:id/check_box_tick"));
//		check_Box_Save.click();
//		
//		WebElement address_Name = driver.findElement(By.id("com.cricketronics.sportsal:id/button_next"));
//		address_Name.click();
//		Thread.sleep(3000);
//		
//		WebElement select_Address = driver.findElement(By.id("com.cricketronics.sportsal:id/check_box_tick"));
//		select_Address.click();
//		Thread.sleep(3000);
		
//		stop
//		PageFactory.initElements(driver, Continue.class);
//		Continue.continue_Address.click();Thread.sleep(3000);
//		Continue.order_screen_continue.click();Thread.sleep(3000);
		
//		WebElement continue_Address = driver.findElement(By.id("com.cricketronics.sportsal:id/button_continue"));
//		continue_Address.click();
//		Thread.sleep(3000);
		
//		need to write scroll here
//		WebElement order_Continue = driver.findElement(By.id("com.cricketronics.sportsal:id/continueButton"));
//		order_Continue.click();
//		Thread.sleep(3000);
		
//		WebElement place_Order_Summary = driver.findElement(By.id("com.cricketronics.sportsal:id/checkoutButton"));
//		place_Order.click();
//		Thread.sleep(3000);
		
		
//		PageFactory.initElements(driver, click_Back.class);
//		click_Back.back_Payment.click();
//		click_Back.back_Order.click();
//		click_Back.back_Address.click();
//		click_Back.quitMethod(driver);
		
//		WebElement back_Payment = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
//		back_Payment.click();
//		
//		WebElement back_Order = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
//		back_Order.click();
//		Thread.sleep(3000);
//		
//		WebElement back_Address = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
//		back_Address.click();
//		
//		driver.quit();
		
		
		
		
		
//		System.out.println("success");
		
		
		
		System.out.println("Executed successfully");
	
	}
}
