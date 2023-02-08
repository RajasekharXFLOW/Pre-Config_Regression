package com.qa.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

import cucumber.api.java.en.Then;

public class FunctionsPage extends TestBase
{
		// Global Variables
		static String actual_vertical_count;
	
		JavascriptExecutor js;
		// Functions page locators
		@FindBy(xpath="//a[@href='/app/functions']")
		WebElement functions_tab;
		@FindBy(xpath="//button[contains(@class,'css-1zb9ui')]")
		WebElement add_function;
		@FindBy(id="function__name")
		WebElement function_name;
		@FindBy(id="function__shortText")
		WebElement short_text;
		@FindBy(id="function__description")
		WebElement desc;
		@FindBy(xpath="//button[@type ='submit']")
		WebElement subimt_button;
		@FindBy(xpath="//*[@role='cell' and @data-field='name']")
		WebElement fun_name;
		@FindBy(xpath="//input[@placeholder='Search...']")
		WebElement search_function_name;
		@FindBy(xpath="//i[contains(@class,'fa-pen')]")	
		WebElement edit_button;
		
		
	
		// Delete Vertical Locators
	
		@FindBy(xpath="//i[contains(@class,'fa-trash')]")
		WebElement delete_button;
		@FindBy(xpath="//footer/button[2]")
		WebElement confirm_delete_button;
		@FindBy(xpath="//*[@data-field='name']")
		List<WebElement> deleted_function;
		
		// Add Function to Vertical
		
		@FindBy(xpath="//i[contains(@class,'fa-list-alt')]")
		WebElement action_button;
		@FindBy(xpath="//button[@aria-label='Close']")
		WebElement close_popup;
		@FindBy(xpath="//*[@role='cell' and @data-field='industry_map_count']")
		WebElement vertical_count;
		@FindBy(xpath="//span[contains(@class,'chakra-checkbox__label')]")
		List<WebElement> v_list;
		
		
	public FunctionsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_on_functions() throws InterruptedException
	{
		Thread.sleep(1000);
		functions_tab.click();
	}
	public void click_add_function() throws InterruptedException
	{
		Thread.sleep(1000);
		add_function.click();
	}
	public void enter_function_name(String fun_name) throws InterruptedException
	{
		Thread.sleep(1000);
		function_name.sendKeys(fun_name);
	}
	public void enter_short_text(String s_text) throws InterruptedException
	{
		Thread.sleep(1000);
		short_text.sendKeys(s_text);
	}
	public void enter_desc(String f_desc) throws InterruptedException
	{
		Thread.sleep(1000);
		desc.sendKeys(f_desc);
	}
	public void click_save_function()
	{
		subimt_button.click();
	}
	public void search_function_name(String function_name) throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(3000);
		search_function_name.sendKeys(function_name);
		Thread.sleep(2000);
	}
	public boolean isFunctionCreted(String function_name) throws InterruptedException
	{
		Thread.sleep(2000);
		String act_name = fun_name.getText();
		if(act_name.equals(function_name))
		{
			return true;
		}else
		{
			return false;
		}
	}
	public void edit_function() throws InterruptedException
	{
		Thread.sleep(2000);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",edit_button);
	}
	public void edit_function_name(String new_name) throws InterruptedException
	{
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		Thread.sleep(1000);
		function_name.sendKeys(ctrl_a);
		Thread.sleep(1000);
		function_name.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		function_name.sendKeys(new_name);
		Thread.sleep(1000);
	}
	public void edit_function_short_text(String new_s_text) throws InterruptedException
	{
		Thread.sleep(1000);
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		short_text.sendKeys(ctrl_a);
		Thread.sleep(1000);
		short_text.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		short_text.sendKeys(new_s_text);
		Thread.sleep(1000);
	}
	public void edit_function_desc(String new_description) throws InterruptedException
	{
		Thread.sleep(1000);
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		Thread.sleep(1000);
		desc.sendKeys(ctrl_a);
		Thread.sleep(1000);
		desc.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		desc.sendKeys(new_description);
		Thread.sleep(1000);
	}
	public void delete_function() throws InterruptedException
	{
		Thread.sleep(2000);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",delete_button);
		Thread.sleep(2000);
		//confirm_delete_button.click();
		Thread.sleep(2000);
	}
	public boolean is_Function_Deleted(String function_name) throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(1000);
		search_function_name.sendKeys(function_name);
		boolean flag = false;
		List<WebElement> v_names = deleted_function;
		for(int i=0;i<v_names.size();i++)
		{
			if(v_names.get(i).getText().equals(function_name))
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
	public void read_actual_ver_count() throws InterruptedException
	{
		Thread.sleep(1000);
		actual_vertical_count = vertical_count.getText();
		System.out.println(actual_vertical_count);
	}
	public void click_action_buttion() throws InterruptedException
	{
		Thread.sleep(2000);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",action_button);
	}
	public void select_vertical_name(String vertical_name) throws InterruptedException
	{
		Thread.sleep(2000);
		
		for(int i=0;i<v_list.size();i++)
		{
			System.out.println(v_list.get(i).getText());
			if(v_list.get(i).getText().contains(vertical_name))
			{
				v_list.get(i).click();
				break;
			}
		}
	}
	public void click_close_popup() throws InterruptedException
	{
		Thread.sleep(1000);
		close_popup.click();
		Thread.sleep(1000);
	}
	public boolean isVerticalCountUpdated() throws InterruptedException
	{
		Thread.sleep(2000);
		String current_vertical_count = vertical_count.getText();
		System.out.println(current_vertical_count);
		Thread.sleep(1000);
		if(actual_vertical_count.equals(current_vertical_count))
		{
			return true;
		}else
		{
			return false;
		}
	}
}
