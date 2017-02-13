/**
 * 
 */
package com.oddschecker.testcases;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

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
public class ValidateLogin {

		public static void main(String[] args) throws MalformedURLException, Throwable{
			
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Test");
		capabilities.setCapability(MobileCapabilityType.VERSION,"5.1.1");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
		@SuppressWarnings("rawtypes")
		WebDriver driver = new AndroidDriver(url,capabilities);
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\oddschecker\\config.properties");
		prop.load(ip);	
		
		driver.get(prop.getProperty("url"));
		
		LoginPage login = new LoginPage(driver);
		
		login.clickLogin();
		login.clickLeftmenu();
		login.typeuser(prop.getProperty("username"));
		login.typepass(prop.getProperty("password"));
		login.clickbutton();
		
		driver.quit();
		}	
	}

