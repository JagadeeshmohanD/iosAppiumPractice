package SeleniumPractice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class Base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
	//public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		File F = new File("src");
		File fs = new File(F,"ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
//		 cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API R");
		 cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, 10);
		 cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 cap.setCapability(MobileCapabilityType.APPLICATION_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API R");
	   cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
//		cap.setCapability(MobileCapabilityType.APP, "/Users/jdommasandra/Downloads/ApiDemos-debug.apk");
		//cap.setCapability(MobileCapabilityType.APPLICATION_NAME,"io.appium.androimd.apis");
		//
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;

	}

}
