/**
 * 
 */
package com.oddschecker.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.oddschecker.login.LoginPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * @author Vendan
 *
 */
public class ValidateLogout {

	public static void main(String[] args) throws MalformedURLException{
		
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Test");
		capabilities.setCapability(MobileCapabilityType.VERSION,"5.1.1");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
		@SuppressWarnings("rawtypes")
		WebDriver driver = new AndroidDriver(url,capabilities);
		driver.get("http://m.oddschecker.com");
		LoginPage login = new LoginPage(driver);
		
		login.clickLeftmenu();
		login.clickLogin();
		login.typeuser("vendan.satyendran@gmail.com");
		login.typepass("Password1");
		login.clickbutton();
		login.clickLeftmenu();
		login.clicksettings();
		login.logout();
		
		driver.quit();
		
	}
}
