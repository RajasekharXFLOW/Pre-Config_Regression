package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase
{
	// locators in Login Page
		@FindBy(xpath="//input[@type='text']")
		WebElement username;
		@FindBy(xpath="//input[@type='password']")
		WebElement password;
		@FindBy(tagName="button")
		WebElement submit_button;
		@FindBy(id="menu-button-:rh:")
		WebElement logout_menu;
		@FindBy(id="menu-list-:rh:-menuitem-:ri:")
		WebElement logout;
		
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
	//Actions
		public boolean checkLoginPage() throws InterruptedException
		{
			Thread.sleep(2000);
			String c_url = driver.getTitle();
			if(c_url.equals("Preconfig"))
		    {
		    	return true;
		    }else
		    {
		    	return false;
		    }
		}
		public void login(String uid,String pwd) throws InterruptedException
		{
			Thread.sleep(2000);
			username.sendKeys(uid);
			password.sendKeys(pwd);
			Thread.sleep(2000);
			submit_button.click();
		}
		public boolean checkLogin() throws InterruptedException
		{
			Thread.sleep(2000);
			boolean flag = false;
			List<WebElement> tag_p = driver.findElements(By.tagName("p"));
			for(int i=0;i<tag_p.size();i++)
			{
				// System.out.println(tag_p.get(i).getText());
				if(tag_p.get(i).getText().toLowerCase().contains("verticals"))
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				return true;
			}else
			{
				return false;
			}
		}
		public void logout() throws InterruptedException
		{
			Thread.sleep(1000);
			logout_menu.click();
			Thread.sleep(1000);
			logout.click();
		}
}
