package com.qa.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.TestBase;

public class AttributesPage extends TestBase
{
	JavascriptExecutor js;
	
	// Locators
	@FindBy(xpath="//a[@href='/app/attributes']")
	WebElement attributes_tab;
	@FindBy(xpath="//button[contains(@class,'css-1zb9ui')]")
	WebElement add_attribute;
	@FindBy(id="attribute__name")
	WebElement attribute_name;
	@FindBy(id="attribute__dataType")
	WebElement attribute_type;
	@FindBy(id="attribute__shortText")
	WebElement attribute_short_text;
	@FindBy(id="attribute__description")
	WebElement attribute_desc;
	@FindBy(id="attribute__defaultValue")
	WebElement attribute_default_value;
	@FindBy(xpath="//button[@type ='submit']")
	WebElement subimt_button;
	@FindBy(xpath="//div[2]/div[3]/div[2]/div[1]/div/div/div[1]/div/input")
	WebElement search_attribute_name;
	@FindBy(xpath="//*[@role='cell' and @data-field='name']")
	WebElement act_aatribute_name;
	@FindBy(xpath="//i[contains(@class,'fa-pen')]")	
	WebElement edit_attribute_button;
	
	@FindBy(xpath="//i[contains(@class,'fa-trash')]")
	WebElement delete_button;
	@FindBy(xpath="//footer/button[2]")
	WebElement confirm_delete_button;
	@FindBy(xpath="//*[@data-field='name']")
	List<WebElement> deleted_attribute_name;
	
	// Attributes Group Page
	
	@FindBy(xpath="//button[@role='tab'][2]")
	WebElement att_group_tab;
	@FindBy(xpath="//div[3]/div[2]/div[2]/div/div/div[1]/button")
	WebElement add_attribute_group;
	@FindBy(id="attribute-group__name")
	WebElement att_group_name;
	@FindBy(id="attribute-group__shortText")
	WebElement att_group_short_text;
	@FindBy(id="attribute-group__description")
	WebElement att_group_desc;
	@FindBy(id="attribute-group__nodeType")
	WebElement node_type_drop_down;
	
	@FindBy(xpath="//*[@role='cell' and @data-field='name']")
	List<WebElement> att_grp_list;
	
	@FindBy(xpath="//i[contains(@class,'fa-list-alt')]")
	WebElement action_button;
	@FindBy(xpath="//div[2]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/div[6]/button[2]/i")	
	WebElement edit_attribute_group_button;
	@FindBy(xpath="//div[6]/button[4]/i")
	WebElement delete_att_group;
	@FindBy(xpath="//div[2]/div/div/div[1]/div/input")
	WebElement search_attribute_group_name;
	
	public AttributesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_attribute_tab() throws InterruptedException
	{
		Thread.sleep(2000);
		attributes_tab.click();
	}
	public void click_add_attribute() throws InterruptedException
	{
		Thread.sleep(2000);
		add_attribute.click();
	}
	public void enter_attribute_name(String att_name) throws InterruptedException
	{
		Thread.sleep(2000);
		attribute_name.sendKeys(att_name);
	}
	public void enter_attribute_short_text(String att_short_text) throws InterruptedException
	{
		Thread.sleep(2000);
		attribute_short_text.sendKeys(att_short_text);
	}
	public void enter_attribute_data_type(String att_data_type) throws InterruptedException
	{
		Thread.sleep(2000);
		attribute_type.sendKeys(att_data_type);
	}
	public void enter_attribute_description(String att_desc) throws InterruptedException
	{
		Thread.sleep(2000);
		attribute_desc.sendKeys(att_desc);
	}
	public void enter_attribute_default_value(String att_default_value) throws InterruptedException
	{
		Thread.sleep(2000);
		attribute_default_value.sendKeys(att_default_value);
		Thread.sleep(2000);
	}
	public void clik_save_attribute() throws InterruptedException
	{
		Thread.sleep(2000);
		subimt_button.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	public void search_attribute_name(String att_name) throws InterruptedException
	{
		Thread.sleep(2000);
		search_attribute_name.sendKeys(att_name);
		Thread.sleep(2000);
	}
	public boolean iSAttributeCreated(String att_name) throws InterruptedException
	{
		Thread.sleep(2000);
		String act_name = act_aatribute_name.getText();
		System.out.println(act_name);
		if(act_name.equals(att_name))
		{
			return true;
		}else
		{
			return false;
		}
	}
	public void click_edit_attribute() throws InterruptedException
	{
		Thread.sleep(2000);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",edit_attribute_button);
	}
	public void enter_new_attribute_name(String new_att_name) throws InterruptedException
	{
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		Thread.sleep(1000);
		attribute_name.sendKeys(ctrl_a);
		Thread.sleep(1000);
		attribute_name.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		attribute_name.sendKeys(new_att_name);
		Thread.sleep(1000);
	}
	public void enter_new_attribute_short_text(String new_s_text_name) throws InterruptedException
	{
		Thread.sleep(1000);
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		attribute_short_text.sendKeys(ctrl_a);
		Thread.sleep(1000);
		attribute_short_text.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		attribute_short_text.sendKeys(new_s_text_name);
		Thread.sleep(1000);
	}
	public void enter_new_attribute_data_type(String new_data_type) throws InterruptedException
	{
		Thread.sleep(1000);
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		Thread.sleep(1000);
		attribute_type.sendKeys(ctrl_a);
		Thread.sleep(1000);
		attribute_type.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		attribute_type.sendKeys(new_data_type);
		Thread.sleep(1000);
	}
	public void enter_new_attribute_description(String new_att_desc) throws InterruptedException
	{
		Thread.sleep(1000);
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		Thread.sleep(1000);
		attribute_desc.sendKeys(ctrl_a);
		Thread.sleep(1000);
		attribute_desc.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		attribute_desc.sendKeys(new_att_desc);
		Thread.sleep(1000);
	}
	public void enter_new_attribute_default_value(String new_att_default_value) throws InterruptedException
	{
		Thread.sleep(1000);
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		Thread.sleep(1000);
		attribute_default_value.sendKeys(ctrl_a);
		Thread.sleep(1000);
		attribute_default_value.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		attribute_default_value.sendKeys(new_att_default_value);
		Thread.sleep(1000);
	}
	public void delete_attribute() throws InterruptedException
	{
		Thread.sleep(2000);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",delete_button);
		Thread.sleep(2000);
	}
	public boolean isAttributeDeleted(String attribute_name) throws InterruptedException
	{
		Thread.sleep(2000);
		boolean flag = false;
		List<WebElement> att_names = deleted_attribute_name;
		for(int i=0;i<att_names.size();i++)
		{
			if(att_names.get(i).getText().equals(attribute_name))
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
	public void click_att_group_tab() throws InterruptedException
	{
		Thread.sleep(2000);
		att_group_tab.click();
	}
	public void click_add_att_group() throws InterruptedException
	{
		Thread.sleep(3000);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",add_attribute_group);
		Thread.sleep(2000);
	}
	public void enter_attribute_group_name(String attribute_group_name) throws InterruptedException
	{
		Thread.sleep(2000);
		att_group_name.sendKeys(attribute_group_name);
	}
	public void enter_attribute_group_short_text(String attribute_group_short_text) throws InterruptedException
	{
		Thread.sleep(2000);
		att_group_short_text.sendKeys(attribute_group_short_text);
	}
	public void enter_attribute_group_description(String attribute_group_desc) throws InterruptedException
	{
		Thread.sleep(2000);
		att_group_desc.sendKeys(attribute_group_desc);
	}
	public void select_node_type_from_dropdown(String node_type) throws InterruptedException
	{
		Thread.sleep(2000);
		Select node = new Select(node_type_drop_down);
		node.selectByVisibleText(node_type);
	}
	
	public void search_attribute_group_name(String att_gr_name) throws InterruptedException
	{
		Thread.sleep(2000);
		search_attribute_group_name.sendKeys(att_gr_name);
		Thread.sleep(1000);
	}
	public boolean iSAttributeGroupCreated(String att_name) throws InterruptedException
	{
		boolean flag = false;
		Thread.sleep(2000);
		for(int i=0;i<att_grp_list.size();i++)
		{
			if(att_grp_list.get(i).getText().equals(att_name))
			{
				flag =true;
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
	public void click_edit_attribute_group() throws InterruptedException
	{
		Thread.sleep(3000);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",edit_attribute_group_button);
		Thread.sleep(2000);
	}
	public void enter_new_att_grp_name(String new_atr_group_name) throws InterruptedException
	{
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		Thread.sleep(1000);
		att_group_name.sendKeys(ctrl_a);
		Thread.sleep(1000);
		att_group_name.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		att_group_name.sendKeys(new_atr_group_name);
		Thread.sleep(1000);
	}
	public void enter_new_attribute_group_short_text(String new_atr_grp_desc_name) throws InterruptedException
	{
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		Thread.sleep(1000);
		att_group_short_text.sendKeys(ctrl_a);
		Thread.sleep(1000);
		att_group_short_text.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		att_group_short_text.sendKeys(new_atr_grp_desc_name);
		Thread.sleep(1000);
	}
	public void enter_new_attribute_group_description(String new_atr_grp_desc) throws InterruptedException
	{
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		Thread.sleep(1000);
		att_group_desc.sendKeys(ctrl_a);
		Thread.sleep(1000);
		att_group_desc.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		att_group_desc.sendKeys(new_atr_grp_desc);
		Thread.sleep(1000);
	}
	public void click_delete_attribute_group() throws InterruptedException
	{
		Thread.sleep(2000);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",delete_att_group);
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
	public boolean IsAttGroupDeleted(String att_grp_name) throws InterruptedException
	{
		Thread.sleep(2000);
		boolean flag = false;
		List<WebElement> att_names = deleted_attribute_name;
		for(int i=0;i<att_names.size();i++)
		{
			if(att_names.get(i).getText().equals(att_grp_name))
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
