package SeleniumPractice;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class SeleniumPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
     DesiredCapabilities d = new DesiredCapabilities();
     d.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro Max");
     d.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
     d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
     d.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.2.2");
     
     
     d.setCapability(MobileCapabilityType.APP, "//Users//jdommasandra//Desktop//AutomationBuild//UIKitCatalog.app");
     IOSDriver<IOSElement> driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),d);


	}

}
