/**
 * 
 */
package com.oddschecker.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Vendan
 *
 */
public class LoginPage {

	WebDriver driver;
	By leftmenu = By.xpath("//*[@id='header']/a[1]/div");
	By login = By.xpath("//*[@id='lh-sub-menu']/ul/li[3]/a");
	By user = By.id("login-email");
	By pass = By.id("login-password");
	By button = By.xpath("//*[@id='action']");
	By settings = By.xpath("//*[@id='lh-sub-menu']/ul/li[6]/a");
	By logout = By.xpath("//*[@id='rh-sub-menu']/div[23]/div[2]/ul/li[1]/a");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;	
	}
	
	public void clickLeftmenu()
	{
		driver.findElement(leftmenu).click();
	}
	public void clickLogin()
	{
		driver.findElement(login).click();	
	}
	public void typeuser(String userid)
	{
		driver.findElement(user).sendKeys(userid);	
	}
	public void typepass(String passwd)
	{
		driver.findElement(pass).sendKeys(passwd);
	}
	public void clickbutton()
	{
		driver.findElement(button).click();	
	}
	public void clicksettings()
	{
		driver.findElement(settings).click();	
	}
	public void logout()
	{
		driver.findElement(logout).click();
	}
}
