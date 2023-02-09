package com.qa.pages;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.util.TestBase;

public class NodeTypePage extends TestBase
{
	JavascriptExecutor js;
	
	@FindBy(xpath="//a[@href='/app/node-type']")
	WebElement node_type_tab;
	@FindBy(xpath="//button[contains(@class,'css-1zb9ui')]")
	WebElement add_node_type;
	@FindBy(id="nodeType__name")
	WebElement node_type_name;
	@FindBy(id="nodeType__shortText")
	WebElement node_short_text;
	@FindBy(id="nodeType__description")
	WebElement node_type_desc;
	@FindBy(xpath="//button[@type ='submit']")
	WebElement subimt_button;
	@FindBy(xpath="//input[@placeholder='Search...']")
	WebElement search_node_type_name;
	@FindBy(xpath="//*[@role='cell' and @data-field='name']")
	WebElement act_node_name;
	
	
	@FindBy(xpath="//i[contains(@class,'fa-pen')]")	
	WebElement edit_node_button;
	
	@FindBy(xpath="//i[contains(@class,'fa-trash')]")
	WebElement delete_button;
	@FindBy(xpath="//footer/button[2]")
	WebElement confirm_delete_button;
	@FindBy(xpath="//*[@data-field='name']")
	List<WebElement> deleted_node;
	
	
	public NodeTypePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_node_type_tab() throws InterruptedException
	{
		Thread.sleep(1000);
		node_type_tab.click();
	}
	public void click_add_node_type() throws InterruptedException
	{
		Thread.sleep(1000);
		add_node_type.click();
	}
	public void enter_node_name(String node_name)
	{
		node_type_name.sendKeys(node_name);
	}
	public void enter_node_short_text(String short_text)
	{
		node_short_text.sendKeys(short_text);
	}
	public void enter_node_desc(String node_desc)
	{
		node_type_desc.sendKeys(node_desc);
	}
	public void click_save_node_type() throws InterruptedException
	{
		subimt_button.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	public void search_node_name(String node_name) throws InterruptedException
	{
		Thread.sleep(2000);
		search_node_type_name.sendKeys(node_name);
	}
	public boolean isNodeCreated(String expected_node_name) throws InterruptedException
	{
		Thread.sleep(2000);
		String acttual_node_name = act_node_name.getText();
		if(acttual_node_name.equals(expected_node_name))
		{
			return true;
		}else
		{
			return false;
		}
	}
	public void click_edit_node() throws InterruptedException
	{
		Thread.sleep(2000);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",edit_node_button);
	}
	public void enter_new_node_name(String new_node_name) throws InterruptedException
	{
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		Thread.sleep(1000);
		node_type_name.sendKeys(ctrl_a);
		Thread.sleep(1000);
		node_type_name.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		node_type_name.sendKeys(new_node_name);
		Thread.sleep(1000);
	}
	public void enter_new_node_short_text(String new_short_text) throws InterruptedException
	{
		Thread.sleep(1000);
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		node_short_text.sendKeys(ctrl_a);
		Thread.sleep(1000);
		node_short_text.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		node_short_text.sendKeys(new_short_text);
		Thread.sleep(1000);
	}
	public void enter_new_node_desc(String new_node_desc) throws InterruptedException
	{
		Thread.sleep(1000);
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		Thread.sleep(1000);
		node_type_desc.sendKeys(ctrl_a);
		Thread.sleep(1000);
		node_type_desc.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		node_type_desc.sendKeys(new_node_desc);
		Thread.sleep(1000);
	}
	public void delete_node_type() throws InterruptedException
	{
		Thread.sleep(2000);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",delete_button);
		Thread.sleep(2000);
		driver.navigate().refresh();
		//confirm_delete_button.click();
	}
	public boolean isNodeTypeDeleted(String node_name) throws InterruptedException
	{
		Thread.sleep(2000);
		boolean flag = false;
		List<WebElement> v_names = deleted_node;
		for(int i=0;i<v_names.size();i++)
		{
			if(v_names.get(i).getText().equals(node_name))
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
	
	
	
	
	
	
	
}
