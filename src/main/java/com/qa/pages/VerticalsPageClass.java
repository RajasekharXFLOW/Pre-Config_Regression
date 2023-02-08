package com.qa.pages;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.qa.util.TestBase;


public class VerticalsPageClass extends TestBase
{
	JavascriptExecutor js;
	// Create vertical Locators
	@FindBy(xpath="//button[contains(@class,'css-1zb9ui')]")
	WebElement addVertical;
	@FindBy(id="vertical__name")
	WebElement enterVerticalName;
	@FindBy(id="vertical__shortText")
	WebElement enterVertical_short_text;
	@FindBy(id="vertical__description")
	WebElement enter_vertical_description;
	@FindBy(xpath="//*[@id='vertical__range']/div/div[1]/div[2]")
	WebElement dropdown;
	@FindBy(id="react-select-2-input")
	WebElement time_range;
	@FindBy(xpath="//button[@type ='submit']")
	WebElement submit;
	@FindBy(xpath="//input[@placeholder='Search...']")
	WebElement search;
	@FindBy(xpath="//*[@role='cell' and @data-field='name']")
	WebElement actual_vertical_name;
	
	// Edit Vertical Locators
	@FindBy(xpath="//i[contains(@class,'fa-pen')]")
	WebElement edit_button;
	@FindBy(id="vertical__name")
	WebElement new_vertical_name;
	@FindBy(id="vertical__shortText")
	WebElement new_short_text;
	@FindBy(id="vertical__description")
	WebElement new_desc;
	@FindBy(id="feature__value")
	WebElement value_range;
	@FindBy(id="feature__dataRange")
	WebElement data_range;
	@FindBy(id="feature__trend")
	WebElement trend_range;
	@FindBy(id="feature__context")
	WebElement context_range;
	@FindBy(id="feature__contributors")
	WebElement contributors_range;
	@FindBy(id="feature__recommended_actions")
	WebElement actions_range;
	@FindBy(id="feature__prediction")
	WebElement predictions_range;
	@FindBy(xpath="//*[@data-field='name']")
	List<WebElement> modified_vertical;
	
	// Delete Vertical Locators
	
	@FindBy(xpath="//i[contains(@class,'fa-trash')]")
	WebElement delete_button;
	@FindBy(xpath="//footer/button[2]")
	WebElement confirm_delete_button;
	@FindBy(xpath="//*[@data-field='name']")
	List<WebElement> deleted_vertical;
		
	public VerticalsPageClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_on_add_vertical()
	{
		addVertical.click();
	}
	public void enter_vertical_name(String vertical_name)
	{
		enterVerticalName.sendKeys(vertical_name);
	}
	public void enetrVertical_short_text(String shortText)
	{
		enterVertical_short_text.sendKeys(shortText);
	}
	public void enter_vertical_desc(String desc)
	{
		enter_vertical_description.sendKeys(desc);
	}
	
	public void select_time_range(String range) throws InterruptedException
	{
		dropdown.click();
		Thread.sleep(1000);
		time_range.sendKeys(range);
		time_range.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	public void saveVertical() throws InterruptedException
	{
		submit.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	
	public void search_vertical_name(String vertical_name) throws InterruptedException
	{
		Thread.sleep(2000);
		search.sendKeys(vertical_name);
		Thread.sleep(2000);
	}
	public boolean isVerticalCreted(String vertical_name) throws InterruptedException
	{
		Thread.sleep(2000);
		String act_name = actual_vertical_name.getText();
		if(act_name.equals(vertical_name))
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	public void click_edit_vertical() throws InterruptedException
	{
		Thread.sleep(2000);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",edit_button);
		// edit_button.click();
	}
	public void edit_vertical_name(String new_name) throws InterruptedException
	{
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		Thread.sleep(1000);
		new_vertical_name.sendKeys(ctrl_a);
		Thread.sleep(1000);
		new_vertical_name.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		new_vertical_name.sendKeys(new_name);
		Thread.sleep(1000);
	}
	public void edit_vertical_s_text(String new_s_text) throws InterruptedException
	{
		Thread.sleep(1000);
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		new_short_text.sendKeys(ctrl_a);
		Thread.sleep(1000);
		new_short_text.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		new_short_text.sendKeys(new_s_text);
		Thread.sleep(1000);
	}
	public void edit_vertical_desc(String new_description) throws InterruptedException
	{
		Thread.sleep(1000);
		String ctrl_a = Keys.chord(Keys.CONTROL, "a");
		Thread.sleep(1000);
		new_desc.sendKeys(ctrl_a);
		Thread.sleep(1000);
		new_desc.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		new_desc.sendKeys(new_description);
		Thread.sleep(1000);
	}
	public void select_velue_range(String val_range) throws InterruptedException
	{
		Thread.sleep(1000);
		Select value_dropdown = new Select(value_range);
		Thread.sleep(1000);
		value_dropdown.selectByVisibleText(val_range);
	}
	public void select_data_range(String data_range_value) throws InterruptedException
	{
		Thread.sleep(1000);
		Select data_range_dropdown = new Select(data_range);
		Thread.sleep(2000);
		data_range_dropdown.selectByVisibleText(data_range_value);
	}
	public void select_trend_range(String trend_range_value) throws InterruptedException
	{
		Thread.sleep(1000);
		Select trend_range_dropdown = new Select(trend_range);
		Thread.sleep(2000);
		trend_range_dropdown.selectByVisibleText(trend_range_value);
	}
	public void select_context_range(String context_range_value) throws InterruptedException
	{
		Thread.sleep(1000);
		Select conext_range_dropdown = new Select(context_range);
		Thread.sleep(2000);
		conext_range_dropdown.selectByVisibleText(context_range_value);
	}
	public void select_contributors_range(String contributors_range_value) throws InterruptedException
	{
		Thread.sleep(1000);
		Select contributors_range_dropdown = new Select(contributors_range);
		Thread.sleep(2000);
		contributors_range_dropdown.selectByVisibleText(contributors_range_value);
	}
	public void select_recomended_actions_range(String recomended_actions_range_value) throws InterruptedException
	{
		Thread.sleep(1000);
		Select recomended_actions_range_dropdown = new Select(actions_range);
		Thread.sleep(2000);
		recomended_actions_range_dropdown.selectByVisibleText(recomended_actions_range_value);
	}
	public void select_prediction_range(String prediction_range_value) throws InterruptedException
	{
		Thread.sleep(1000);
		Select prediction_range_dropdown = new Select(predictions_range);
		Thread.sleep(2000);
		prediction_range_dropdown.selectByVisibleText(prediction_range_value);
	}
	public boolean is_vertical_modified(String new_name) throws InterruptedException
	{
		Thread.sleep(2000);
		search.sendKeys(new_name);
		Thread.sleep(2000);
		boolean flag = false;
		for(int i=0;i<modified_vertical.size();i++)
		{
			if(modified_vertical.get(i).getText().contains(new_name))
			{
				modified_vertical.get(i).click();
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
	public void delete_vertical() throws InterruptedException
	{
		Thread.sleep(2000);
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",delete_button);
		Thread.sleep(2000);
		confirm_delete_button.click();
		Thread.sleep(2000);
	}
	public boolean isVerticalDeleted(String vertical_name) throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(1000);
		search.sendKeys(vertical_name);
		boolean flag = false;
		List<WebElement> v_names = deleted_vertical;
		for(int i=0;i<v_names.size();i++)
		{
			if(v_names.get(i).getText().equals(vertical_name))
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
