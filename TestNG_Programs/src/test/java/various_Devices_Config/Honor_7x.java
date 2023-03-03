package various_Devices_Config;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Honor_7x {

	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
	
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
//		cap.setCapability("platformName","Android");
		cap.setCapability("udid","77259a9a9905");
		cap.setCapability("udid","QDT4C18117022572");
		cap.setCapability("appPackage","com.android.chrome");
		cap.setCapability("appActivity","com.google.android.apps.chrome.Main");
//		cap.setCapability("udid","95de745c");
//		cap.setCapability("appPackage","com.android.vending");
//		cap.setCapability("appActivity","com.android.vending.AssetBrowserActivity");

		
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub/");
		driver=new AndroidDriver(url,cap);
		System.out.println("done");
	}
	
	
	
	
	
	
	
	
}
