package jerseyFlow;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
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

public class Functionalities {
	public static AndroidDriver driver;

//	static long startTime;
//	long endTime;
	@Test(priority=0)
	public static  void initialStart()throws MalformedURLException, InterruptedException{

		DesiredCapabilities cap=new DesiredCapabilities();
		
//		startTime = System.currentTimeMillis();
		
//		cap.setCapability("platformName", "Android");
		cap.setCapability("platformName","Android");
//		cap.setCapability("platformVersion","11 RKQ1.201022.002");
		cap.setCapability("platformVersion","9");

		cap.setCapability("udid","95de745c");
//		cap.setCapability("udid","2aeb54f");
		cap.setCapability("deviceName","OnePlus 5");
//		cap.setCapability("deviceName", "Redmi Note 10");
//				cap.setCapability("deviceName", "OnePlus Nord CE 2 Lite 5G");
		cap.setCapability("appPackage","com.cricketronics.sportsal");
		cap.setCapability("appActivity","com.cricketronics.sportsal.ui.onboarding.CommonOnboardActivity");


		URL url =new URL("http://0.0.0.0:4723/wd/hub/");
		driver =new AndroidDriver(url,cap);
		System.out.println(">>>>>initiated>>>>>");
	}
	@Test(priority=0)
	public void login() throws InterruptedException {
		PageFactory.initElements(driver, Login_With_Otp.class);

		Login_With_Otp.Get_Start.click();
		Login_With_Otp.enter_Number.sendKeys("9003180496");
		Thread.sleep(5000);
		//		Login_With_Otp.enter_Otp.click();
		Login_With_Otp.enter_Otp.click();
		Thread.sleep(5000);
		Login_With_Otp.enter_One.sendKeys("1");
		Login_With_Otp.enter_two.sendKeys("2");
		Login_With_Otp.enter_three.sendKeys("3");
		Login_With_Otp.enter_four.sendKeys("4");
		Thread.sleep(3000);
		Login_With_Otp.next_otp_button1.click();
		Thread.sleep(7000);
		System.out.println("super");
		System.out.println("otp entered");
	}
	@Test(priority=1)
	public void jerseyflow() throws InterruptedException {

		PageFactory.initElements(driver, CreateNew.class);
		CreateNew.Click_Jersey.click();
		Thread.sleep(15000);

		PageFactory.initElements(driver, Choose_Jersey.class);
		Choose_Jersey.generate_New1.click();
		Thread.sleep(5000);
		Choose_Jersey.create_Jersey.click();
		Thread.sleep(5000);
		Choose_Jersey.generate_New_Pattern.click();
		Thread.sleep(5000);
		System.out.println(">>>>>jerseyflow>>>>");
	}

	@Test(priority=2)
	public void jeseyCollorTypes() throws InterruptedException {

		PageFactory.initElements(driver, Collar_Type.class);
		Collar_Type.t_shirt_Select.click();
		Collar_Type.t_shirt_Next_.click();
		Collar_Type.confuse_Next.click();
		Thread.sleep(12000);
		System.out.println("going to tap collor");
		Collar_Type.select_Collor.click();
		Thread.sleep(3000);
		System.out.println("going to tap sleeve");
		Collar_Type.tap_Sleeve.click();
		Thread.sleep(3000);
		System.out.println("going to select sleeve");
		Collar_Type.select_Sleeve.click();
		Thread.sleep(5000);
		Collar_Type.next_C_S.click();
		Thread.sleep(5000);
		System.out.println("jeseyCollorTypes");
	}
	@Test (priority=3)
	public void jerseyBackSide() throws InterruptedException {

		PageFactory.initElements(driver, Jersey_Back.class);
		Jersey_Back.jersey_Back.click();
		Thread.sleep(5000);
		Jersey_Back.jersey_Back_next.click();
		Thread.sleep(5000);
		System.out.println("jerseyBackSide");
	}
	@Test(priority=4)
	public void jerseyLog() throws InterruptedException {

		PageFactory.initElements(driver, Jersey_Logo.class);
		Jersey_Logo.jersey_Logo.click();
		Thread.sleep(3000);
		Jersey_Logo.next_logo.click();
		Thread.sleep(3000);
		System.out.println("jerseyLog");
	}
	@Test(priority=5)
	public void jerseyLogoPositions() throws InterruptedException {

		PageFactory.initElements(driver,Logo_Position.class);
		Logo_Position.logo_Select.click();
		Thread.sleep(3000);
		Logo_Position.logo_Finish_Btton.click();
		Thread.sleep(5000);
		System.out.println("jerseyLogoPositions");
	}
	@Test(priority=6)
	public void jerseyView() throws InterruptedException {

		PageFactory.initElements(driver,Jersey_View.class);
		Jersey_View.preview_button_3d.click();Thread.sleep(5000);
		Jersey_View.j_name.sendKeys("elango");
		Jersey_View.j_number.sendKeys("777");
		Jersey_View.proceed_Button.click();Thread.sleep(25000);
		System.out.println("jerseyView");
	}
	@Test(priority=7)
	public void addJereseyTitle() throws InterruptedException {

		PageFactory.initElements(driver, Add_Jersey_Title.class);
		Add_Jersey_Title.preview_Screen_Nextbutton.click();
		Add_Jersey_Title.preview_t.click();
		Add_Jersey_Title.add_Jeresy_Title.sendKeys("Augray");
		Add_Jersey_Title.save_Next_Button.click();
		Thread.sleep(5000);
		System.out.println("addJereseyTitle");
	}
	@Test(priority=8)
	public void orderScreen() throws InterruptedException {

		PageFactory.initElements(driver, Order_Screen.class);
		Order_Screen.click_Created_Jersey.click();Thread.sleep(22000);
		Order_Screen.click_Order_Button.click();
		Order_Screen.click_Quantity.click();
		Order_Screen.outsit_Quantity.click();
		Order_Screen.enter_player_name.sendKeys("Elango");
		Order_Screen.enter_player_number.sendKeys("007");
		Order_Screen.click_size.click();
		Order_Screen.choose_size.click();
		Order_Screen.click_outside.click();
		Order_Screen.Place_Order.click();Thread.sleep(3000);
		System.out.println("orderScreen");
	}
	@Test(priority=9)
	public void addNewAddress() throws InterruptedException {

		PageFactory.initElements(driver, Addnew_Address.class);
		Addnew_Address.click_add_address.click();
		Addnew_Address.set_your_location.click();Thread.sleep(3000);
		Addnew_Address.click_yes_permission.click();Thread.sleep(3000);
		Addnew_Address.click_allow.click();Thread.sleep(3000);
		Addnew_Address.confirm_location.click();
		Addnew_Address.click_others.click();
		Addnew_Address.enter_landmark.sendKeys("land mark");
		Addnew_Address.click_save_checkBox.click();
		Addnew_Address.address_nextButton.click();Thread.sleep(3000);
		Addnew_Address.selectAddress.click();Thread.sleep(3000);
		System.out.println("addNewAddress");
	}
	@Test(priority=10)
	public void continueButton() throws InterruptedException {

		PageFactory.initElements(driver, Continue.class);
		Continue.continue_Address.click();Thread.sleep(5000);
		Continue.order_screen_continue.click();Thread.sleep(3000);
		System.out.println("Flow ended");
		System.out.println("continueButton");
	}
	@Test(priority=11)
	public void backButtons() throws InterruptedException {

		PageFactory.initElements(driver, click_Back.class);
		click_Back.back_Payment.click();
		click_Back.back_Order.click();Thread.sleep(3000);
		click_Back.back_Address.click();
		click_Back.quitMethod(driver);
		System.out.println("backButtons");
	}
}