package com.qa.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.TestBase;

public class MetricsPage extends TestBase
{
	JavascriptExecutor js;
	
	//Locators
	
	@FindBy(xpath="//a[@href='/app/metrics']")
	WebElement metrics_tab;
	@FindBy(xpath="//div[2]/div[1]/div/div/div[1]/button")
	WebElement add_metric_button;
	@FindBy(id="metric__type")
	WebElement metric_type_dropdown;
	@FindBy(id="metric__name")
	WebElement metric_name_field;
	@FindBy(id="metric__displayName")
	WebElement display_name_field;
	@FindBy(id="metric__description")
	WebElement desc_field;
	@FindBy(id="metric__attributeGroup")
	WebElement att_grp_dropdown;
	@FindBy(xpath="//button[@type='submit']")
	WebElement save_button;
	@FindBy(xpath="//div[1]/div/div/div[1]/div/input")
	WebElement search_metric;
	@FindBy(xpath="//*[@data-field='name']")
	List<WebElement> metrics_names_list;
	
	// Edit Metric Locators
	
	@FindBy(xpath="//i[contains(@class,'fa-pen')]")
	WebElement edit_button;
	@FindBy(xpath="//i[contains(@class,'fa-trash')]")
	WebElement delete_button;
	
	public MetricsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_metrics_tab() throws InterruptedException
	{
		Thread.sleep(1000);
		metrics_tab.click();
	}
	
	public void click_add_metric_button() throws InterruptedException
	{
		Thread.sleep(1000);
		add_metric_button.click();
	}
	
	public void select_metric_type(String metric_type) throws InterruptedException
	{
		Thread.sleep(2000);
		Select metric_type_drop_down = new Select(metric_type_dropdown);
		metric_type_drop_down.selectByVisibleText(metric_type);
	}
	
	public void enter_metric_name(String metric_name) throws InterruptedException
	{
		Thread.sleep(2000);
		metric_name_field.sendKeys(metric_name);
	}
	
	public void enter_metric_display_name(String disply_name) throws InterruptedException
	{
		Thread.sleep(2000);
		display_name_field.sendKeys(disply_name);
	}
	public void enter_metric_description(String description) throws InterruptedException
	{
		Thread.sleep(2000);
		desc_field.sendKeys(description);
	}
	public void select_attribute_group_from_dropdown(String att_group_name) throws InterruptedException
	{
		Thread.sleep(2000);
		Select att_group_dropdown = new Select(att_grp_dropdown);
		att_group_dropdown.selectByVisibleText(att_group_name);
	}
	public void click_save_metric() throws InterruptedException
	{
		Thread.sleep(3000);
		save_button.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	public void search_metric_name(String metric_name) throws InterruptedException
	{
		Thread.sleep(2000);
		search_metric.sendKeys(metric_name);
	}
	public boolean is_Metric_Created(String metric_name) throws InterruptedException
	{
		Thread.sleep(2000);
		boolean flag = false;
		for(int i=0;i<metrics_names_list.size();i++)
		{
			if(metrics_names_list.get(i).getText().equals(metric_name))
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
