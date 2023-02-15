package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.AttributesPage;
import com.qa.pages.FunctionsPage;
import com.qa.pages.LoginPage;
import com.qa.pages.MetricsPage;
import com.qa.pages.NodeTypePage;
import com.qa.pages.VerticalsPageClass;
import com.qa.util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PreCofigLibrary extends TestBase
{
	LoginPage loginpage;
	VerticalsPageClass verticalspage;
	FunctionsPage functionspage;
	NodeTypePage nodetypepage;
	AttributesPage att_page;
	MetricsPage metrics_page;
	
	@Given("^user open browser with url$")
	public void user_open_browser_with_url()
	{
		TestBase.intilization();
	}

	@Then("^user should see login page$")
	public void user_should_see_login_page() throws InterruptedException
	{
		loginpage = new LoginPage();
		boolean res = loginpage.checkLoginPage();
		Assert.assertTrue(res);
	}

	@When("^user enter username as password as and click login$")
	public void user_enter_username_as_password_as_and_click_login() throws InterruptedException
	{
	    loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^user should see home page \\(verticals page\\)$")
	public void user_should_see_home_page_verticals_page() throws InterruptedException
	{
	    boolean res = loginpage.checkLogin();
	    Assert.assertTrue(res);
	}

	@When("^user clik logout$")
	public void user_clik_logout() throws InterruptedException
	{
	    loginpage.logout();
	}

	@Then("^user click on close browser$")
	public void user_click_on_close_browser()
	{
	   driver.close();
	}
	@When("^user click on add vertical$")
	public void user_click_on_add_vertical() throws Throwable 
	{
		verticalspage = new VerticalsPageClass();
		Thread.sleep(2000);
		verticalspage.click_on_add_vertical();
	}

	@When("^user enter vertical name as \"([^\"]*)\"$")
	public void user_enter_vertical_name_as(String vertical_name) throws Throwable 
	{
		verticalspage.enter_vertical_name(vertical_name);
	}

	@When("^user enter vertical short text as \"([^\"]*)\"$")
	public void user_enter_vertical_short_text_as(String shortText) throws Throwable 
	{
		verticalspage.enetrVertical_short_text(shortText);
	}

	@When("^user enter vertical description as \"([^\"]*)\"$")
	public void user_enter_vertical_description_as(String desc) throws Throwable 
	{
		verticalspage.enter_vertical_desc(desc);
	}

	@When("^user select time range as \"([^\"]*)\"$")
	public void user_select_time_range_as(String range) throws Throwable 
	{
		verticalspage.select_time_range(range);
	}

	@When("^user clik on save$")
	public void user_clik_on_save() throws Throwable 
	{
		verticalspage.saveVertical();
		driver.navigate().refresh();
	}

	@Then("^user should see vertical created as \"([^\"]*)\"$")
	public void user_should_see_vertical_created_as(String vertical_name) throws Throwable 
	{
		Thread.sleep(2000);
		verticalspage.search_vertical_name(vertical_name);
		Thread.sleep(1000);
		boolean res = verticalspage.isVerticalCreted(vertical_name);
		Assert.assertTrue(res);
	}

	@When("^user click on edit vertical \"([^\"]*)\"$")
	public void user_click_on_edit_vertical(String vertical_name) throws Throwable 
	{
		verticalspage = new VerticalsPageClass();
		verticalspage.search_vertical_name(vertical_name);
	    verticalspage.click_edit_vertical();
	    
	}

	@When("^user enter new vertical name as \"([^\"]*)\"$")
	public void user_enter_new_vertical_name_as(String new_name) throws Throwable
	{
		verticalspage.edit_vertical_name(new_name);
	}

	@When("^user enter new vertical short text as \"([^\"]*)\"$")
	public void user_enter_new_vertical_short_text_as(String new_s_text) throws Throwable
	{
		verticalspage.edit_vertical_s_text(new_s_text);
	}

	@When("^user enter new vertical description as \"([^\"]*)\"$")
	public void user_enter_new_vertical_description_as(String new_description) throws Throwable
	{
		verticalspage.edit_vertical_desc(new_description);
	}

	@When("^user select value range as \"([^\"]*)\"$")
	public void user_select_value_range_as(String val_range) throws Throwable
	{
	    verticalspage.select_velue_range(val_range);
	}

	@When("^user select data range as \"([^\"]*)\"$")
	public void user_select_data_range_as(String data_range_value) throws Throwable 
	{
	   verticalspage.select_data_range(data_range_value);
	}

	@When("^user select trend range as \"([^\"]*)\"$")
	public void user_select_trend_range_as(String trend_range_value) throws Throwable 
	{
	    verticalspage.select_trend_range(trend_range_value);
	}

	@When("^user select context range as \"([^\"]*)\"$")
	public void user_select_context_range_as(String context_range_value) throws Throwable 
	{
	    verticalspage.select_context_range(context_range_value);
	}

	@When("^user select contributors range as \"([^\"]*)\"$")
	public void user_select_contributors_range_as(String contributors_range_value) throws Throwable 
	{
	    verticalspage.select_contributors_range(contributors_range_value);
	}

	@When("^user select recomended actions range as \"([^\"]*)\"$")
	public void user_select_recomended_actions_range_as(String recomended_actions_range_value) throws Throwable 
	{
	    verticalspage.select_recomended_actions_range(recomended_actions_range_value);
	}

	@When("^user select prediction range as \"([^\"]*)\"$")
	public void user_select_prediction_range_as(String prediction_range_value) throws Throwable 
	{
		verticalspage.select_prediction_range(prediction_range_value);
	}

	@Then("^user should see modified vertical \"([^\"]*)\"$")
	public void user_should_see_modified_vertical(String new_name) throws Throwable 
	{
		boolean res = verticalspage.is_vertical_modified(new_name);
		Assert.assertTrue(res);
	}
	@When("^user search vertical to delete \"([^\"]*)\"$")
	public void user_search_vertical_to_delete(String vertical_name) throws Throwable 
	{
		verticalspage = new VerticalsPageClass();
		verticalspage.search_vertical_name(vertical_name);
	}

	@When("^user click on delete vertical$")
	public void user_click_on_delete_vertical() throws Throwable 
	{
		verticalspage.delete_vertical();
	}

	@Then("^user should see vertical deleted \"([^\"]*)\"$")
	public void user_should_see_vertical_deleted(String vertical_name) throws Throwable 
	{
		boolean res = verticalspage.isVerticalDeleted(vertical_name);
		Assert.assertFalse(res);
	}
	@When("^user click on functions from menu$")
	public void user_click_on_functions_from_menu() throws Throwable 
	{
		functionspage = new FunctionsPage();
		functionspage.click_on_functions();
	}

	@When("^user click on add function$")
	public void user_click_on_add_function() throws Throwable
	{
		functionspage.click_add_function();
	}

	@When("^user enter function name as \"([^\"]*)\"$")
	public void user_enter_function_name_as(String fun_name) throws Throwable 
	{
		functionspage.enter_function_name(fun_name);
	}

	@When("^user enter function short text as \"([^\"]*)\"$")
	public void user_enter_function_short_text_as(String s_text) throws Throwable 
	{
		functionspage.enter_short_text(s_text);
	}

	@When("^user enter function description as \"([^\"]*)\"$")
	public void user_enter_function_description_as(String f_desc) throws Throwable 
	{
		functionspage.enter_desc(f_desc);
	}
	
	@When("^user clik on save function$")
	public void user_clik_on_save_function() throws Throwable 
	{
		functionspage.click_save_function();
	}

	@When("^user search function \"([^\"]*)\"$")
	public void user_search_function(String function_name) throws Throwable 
	{
		functionspage = new FunctionsPage();
		functionspage.search_function_name(function_name);
	}

	@Then("^user should see function created as \"([^\"]*)\"$")
	public void user_should_see_function_created_as(String function_name) throws Throwable 
	{
		functionspage.isFunctionCreted(function_name);
	}
	
	@When("^user click on edit function \"([^\"]*)\"$")
	public void user_click_on_edit_function(String arg1) throws Throwable
	{
		functionspage.edit_function();
	}
	@When("^user enter new function name as \"([^\"]*)\"$")
	public void user_enter_new_function_name_as(String new_name) throws Throwable 
	{
		functionspage = new FunctionsPage();
		functionspage.edit_function_name(new_name);
	}

	@When("^user enter new function short text as \"([^\"]*)\"$")
	public void user_enter_new_function_short_text_as(String new_s_text) throws Throwable 
	{
		functionspage.edit_function_short_text(new_s_text);
	}

	@When("^user enter new function description as \"([^\"]*)\"$")
	public void user_enter_new_function_description_as(String new_description) throws Throwable
	{
		functionspage.edit_function_desc(new_description);
	}
	
	@When("^user search function to delete \"([^\"]*)\"$")
	public void user_search_function_to_delete(String function_name) throws Throwable 
	{
		functionspage = new FunctionsPage();
		functionspage.search_function_name(function_name);
	}
	
	@When("^user click on delete function$")
	public void user_click_on_delete_function() throws Throwable 
	{
		functionspage = new FunctionsPage();
		functionspage.delete_function();
	}

	@Then("^user should see function deleted \"([^\"]*)\"$")
	public void user_should_see_function_deleted(String function_name) throws Throwable 
	{
		boolean res =  functionspage.is_Function_Deleted(function_name);
		Assert.assertFalse(res);
	}
	
	@When("^user read the count of actual verticals linked to function$")
	public void user_read_the_count_of_actual_verticals_linked_to_function() throws Throwable 
	{
		functionspage.read_actual_ver_count();
	}
	@When("^user click action against function$")
	public void user_click_action_against_function() throws Throwable 
	{
		functionspage.click_action_buttion();
	}

	@When("^user select vertical \"([^\"]*)\"$")
	public void user_select_vertical(String vertical_name) throws Throwable 
	{
		functionspage.select_vertical_name(vertical_name);		
	}

	@When("^user click close the popup$")
	public void user_click_close_the_popup() throws Throwable 
	{
		functionspage.click_close_popup();
	}

	@Then("^user should see the verticals count updated$")
	public void user_should_see_the_verticals_count_updated() throws Throwable 
	{
		functionspage = new FunctionsPage();
		boolean res =  functionspage.isVerticalCountUpdated();
		Assert.assertFalse(res);
	}
	@When("^user click on node type tab$")
	public void user_click_on_node_type_tab() throws Throwable 
	{
		nodetypepage = new NodeTypePage();
		nodetypepage.click_node_type_tab();
	}

	@When("^user click on add node type$")
	public void user_click_on_add_node_type() throws Throwable 
	{
		nodetypepage.click_add_node_type();	    
	}

	@When("^user enter node type name as \"([^\"]*)\"$")
	public void user_enter_node_type_name_as(String node_name) throws Throwable 
	{
		nodetypepage.enter_node_name(node_name);
	}
	
	@When("^user enter node type short text as \"([^\"]*)\"$")
	public void user_enter_node_type_short_text_as(String short_text) throws Throwable 
	{
	    nodetypepage.enter_node_short_text(short_text);
	}

	@When("^user enter node type description as \"([^\"]*)\"$")
	public void user_enter_node_type_description_as(String node_desc) throws Throwable 
	{
	   nodetypepage.enter_node_desc(node_desc);
	}

	@When("^user clik on save node type$")
	public void user_clik_on_save_node_type() throws Throwable 
	{
		nodetypepage.click_save_node_type();
	}

	@When("^user search for node type name \"([^\"]*)\"$")
	public void user_search_for_node_type_name(String node_name) throws Throwable 
	{
	    nodetypepage.search_node_name(node_name);
	}
	
	@Then("^user should see node type created as \"([^\"]*)\"$")
	public void user_should_see_node_type_created_as(String expected_node_name) throws Throwable 
	{
		boolean res =  nodetypepage.isNodeCreated(expected_node_name);
		Assert.assertTrue(res);
	}
	
	@When("^user click on edit node type$")
	public void user_click_on_edit_node_type() throws Throwable 
	{
		nodetypepage.click_edit_node();
	}

	@When("^user enter new node type name as \"([^\"]*)\"$")
	public void user_enter_new_node_type_name_as(String new_node_name) throws Throwable 
	{
		nodetypepage.enter_new_node_name(new_node_name);
	}

	@When("^user enter new node type short text as \"([^\"]*)\"$")
	public void user_enter_new_node_type_short_text_as(String new_short_text) throws Throwable 
	{
		nodetypepage.enter_new_node_short_text(new_short_text);
	}

	@When("^user enter new node type description as \"([^\"]*)\"$")
	public void user_enter_new_node_type_description_as(String new_node_desc) throws Throwable 
	{
	    nodetypepage.enter_new_node_desc(new_node_desc);
	}
	
	@When("^user click on delete node type$")
	public void user_click_on_delete_node_type() throws Throwable 
	{
	    nodetypepage.delete_node_type();
	}

	@Then("^user should see node type deleted \"([^\"]*)\"$")
	public void user_should_see_node_type_deleted(String node_name) throws Throwable 
	{
	    boolean res = nodetypepage.isNodeTypeDeleted(node_name);
	    Assert.assertFalse(res);
	}
	
	@When("^user click on attribute tab$")
	public void user_click_on_attribute_tab() throws Throwable 
	{
	    att_page = new AttributesPage();
	    att_page.click_attribute_tab();
	}

	@When("^user click on add attribute$")
	public void user_click_on_add_attribute() throws Throwable 
	{
	    att_page.click_add_attribute();
	}

	@When("^user enter attribute name as \"([^\"]*)\"$")
	public void user_enter_attribute_name_as(String att_name) throws Throwable 
	{
	    att_page.enter_attribute_name(att_name);
	}

	@When("^user enter attribute short text as \"([^\"]*)\"$")
	public void user_enter_attribute_short_text_as(String att_short_text) throws Throwable 
	{
	    att_page.enter_attribute_short_text(att_short_text);
	}

	@When("^user enter attribute data type \"([^\"]*)\"$")
	public void user_enter_attribute_data_type(String att_data_type) throws Throwable 
	{
	    att_page.enter_attribute_data_type(att_data_type);
	}

	@When("^user enter attribute description as \"([^\"]*)\"$")
	public void user_enter_attribute_description_as(String att_desc) throws Throwable 
	{
	    att_page.enter_attribute_description(att_desc);
	}
	
	@When("^user enter attribute default value as \"([^\"]*)\"$")
	public void user_enter_attribute_default_value_as(String att_default_value) throws Throwable 
	{
	    att_page.enter_attribute_default_value(att_default_value);
	}

	@When("^user clik on save attribute$")
	public void user_clik_on_save_attribute() throws Throwable 
	{
	    att_page.clik_save_attribute();
	}

	@When("^user search for attribute name \"([^\"]*)\"$")
	public void user_search_for_attribute_name(String att_name) throws Throwable 
	{
	    att_page.search_attribute_name(att_name);
	}

	@Then("^user should see attribute created as \"([^\"]*)\"$")
	public void user_should_see_attribute_created_as(String att_name) throws Throwable 
	{
	   boolean res = att_page.iSAttributeCreated(att_name);
	   Assert.assertTrue(res);
	}
	
	@When("^user click on edit attribute$")
	public void user_click_on_edit_attribute() throws Throwable 
	{
	    att_page.click_edit_attribute();
	}

	@When("^user enter new attribute name as \"([^\"]*)\"$")
	public void user_enter_new_attribute_name_as(String new_att_name) throws Throwable 
	{
	    att_page.enter_new_attribute_name(new_att_name);
	}

	@When("^user enter new attribute short text as \"([^\"]*)\"$")
	public void user_enter_new_attribute_short_text_as(String new_s_text_name) throws Throwable 
	{
	    att_page.enter_new_attribute_short_text(new_s_text_name);
	}
	
	@When("^user enter new attribute data type \"([^\"]*)\"$")
	public void user_enter_new_attribute_data_type(String new_data_type) throws Throwable 
	{
	    att_page.enter_new_attribute_data_type(new_data_type);
	}

	@When("^user enter new attribute description as \"([^\"]*)\"$")
	public void user_enter_new_attribute_description_as(String new_att_desc) throws Throwable 
	{
	    att_page.enter_new_attribute_description(new_att_desc);
	}

	@When("^user enter new attribute default value as \"([^\"]*)\"$")
	public void user_enter_new_attribute_default_value_as(String new_att_default_value) throws Throwable 
	{
	   att_page.enter_new_attribute_default_value(new_att_default_value);
	}
	@When("^user click on delete attribute$")
	public void user_click_on_delete_attribute() throws Throwable 
	{
	    att_page.delete_attribute();
	}

	@Then("^user should see attribute deleted \"([^\"]*)\"$")
	public void user_should_see_attribute_deleted(String attribute_name) throws Throwable 
	{
	    boolean res = att_page.isAttributeDeleted(attribute_name);
	    Assert.assertFalse(res);
	}
	
	@When("^user click on attribute group tab$")
	public void user_click_on_attribute_group_tab() throws Throwable 
	{
	    att_page.click_att_group_tab();
	}
	
	@When("^user click on add attribute group$")
	public void user_click_on_add_attribute_group() throws Throwable 
	{
	    att_page.click_add_att_group();
	}


	@When("^user enter attribute group name as \"([^\"]*)\"$")
	public void user_enter_attribute_group_name_as(String attribute_group_name) throws Throwable 
	{
	   att_page.enter_attribute_group_name(attribute_group_name);
	}

	@When("^user enter attribute group short text as \"([^\"]*)\"$")
	public void user_enter_attribute_group_short_text_as(String attribute_group_short_text) throws Throwable 
	{
	    att_page.enter_attribute_group_short_text(attribute_group_short_text);
	}

	@When("^user enter attribute group description as \"([^\"]*)\"$")
	public void user_enter_attribute_group_description_as(String attribute_group_desc) throws Throwable 
	{
	    att_page.enter_attribute_group_description(attribute_group_desc);
	}

	@When("^user node type from dropdown \"([^\"]*)\"$")
	public void user_node_type_from_dropdown(String node_type) throws Throwable 
	{
	   att_page.select_node_type_from_dropdown(node_type);
	}
	@When("^user search for attribute group name \"([^\"]*)\"$")
	public void user_search_for_attribute_group_name(String att_gr_name) throws Throwable 
	{
	    att_page.search_attribute_group_name(att_gr_name);
	}
	@Then("^user should see attribute group created as \"([^\"]*)\"$")
	public void user_should_see_attribute_group_created_as(String att_name) throws Throwable 
	{
	   boolean res =  att_page.iSAttributeGroupCreated(att_name);
	   Assert.assertTrue(res);
	}
	
	@When("^user click edit attribute group$")
	public void user_click_edit_attribute_group() throws Throwable 
	{
	    att_page.click_edit_attribute_group();
	}

	@When("^user enter new attribute group name as \"([^\"]*)\"$")
	public void user_enter_new_attribute_group_name_as(String new_atr_group_name) throws Throwable 
	{
	    att_page.enter_new_att_grp_name(new_atr_group_name);
	}

	@When("^user enter new attribute group short text as \"([^\"]*)\"$")
	public void user_enter_new_attribute_group_short_text_as(String new_atr_grp_desc_name) throws Throwable 
	{
	    att_page.enter_new_attribute_group_short_text(new_atr_grp_desc_name);
	}

	@When("^user enter new attribute group description as \"([^\"]*)\"$")
	public void user_enter_new_attribute_group_description_as(String new_atr_grp_desc) throws Throwable 
	{
	    att_page.enter_new_attribute_group_description(new_atr_grp_desc);
	}
	
	@When("^user click delete attribute group$")
	public void user_click_delete_attribute_group() throws Throwable 
	{
	    att_page.click_delete_attribute_group();
	}
	
	@Then("^user should see attribute group deleted \"([^\"]*)\"$")
	public void user_should_see_attribute_group_deleted(String att_grp_name) throws Throwable 
	{
	    boolean res = att_page.IsAttGroupDeleted(att_grp_name);
	    Assert.assertFalse(res);
	}
	@When("^user read the count of no attributes against the attribute group$")
	public void user_read_the_count_of_no_attributes_against_the_attribute_group() throws Throwable 
	{
	    att_page.read_actual_attributes_count();
	}

	@When("^user click actions against attribute group$")
	public void user_click_actions_against_attribute_group() throws Throwable 
	{
	    att_page.click_action_buttion_against_att_group();
	}

	@When("^user select required attribute in popup window \"([^\"]*)\"$")
	public void user_select_required_attribute_in_popup_window(String attribute_name) throws Throwable 
	{
	   att_page.select_attribute_name(attribute_name);
	}

	@Then("^user should see the count updated$")
	public void user_should_see_the_count_updated() throws Throwable 
	{
	   boolean res = att_page.isAttributeCountUpdated();
	   Assert.assertFalse(res);
	}
	@When("^user click on metrics tab$")
	public void user_click_on_metrics_tab() throws Throwable 
	{
		metrics_page = new MetricsPage();
		metrics_page.click_metrics_tab();
	}

	@When("^user click on add metric$")
	public void user_click_on_add_metric() throws Throwable 
	{
	    metrics_page.click_add_metric_button();
	}

	@When("^user select metric type from dropdown \"([^\"]*)\"$")
	public void user_select_metric_type_from_dropdown(String metric_type) throws Throwable 
	{
	    metrics_page.select_metric_type(metric_type);
	}

	@When("^user enter metric name as \"([^\"]*)\"$")
	public void user_enter_metric_name_as(String metric_name) throws Throwable 
	{
	    metrics_page.enter_metric_name(metric_name);
	}

	@When("^user enter metric display name as \"([^\"]*)\"$")
	public void user_enter_metric_display_name_as(String disply_name) throws Throwable 
	{
	    metrics_page.enter_metric_display_name(disply_name);
	}

	@When("^user enter metric description as \"([^\"]*)\"$")
	public void user_enter_metric_description_as(String description) throws Throwable 
	{
	   metrics_page.enter_metric_description(description);
	}

	@When("^user select attribute group from dropdown \"([^\"]*)\"$")
	public void user_select_attribute_group_from_dropdown(String att_group_name) throws Throwable 
	{
	    metrics_page.select_attribute_group_from_dropdown(att_group_name);
	}

	@When("^user clik on save metric$")
	public void user_clik_on_save_metric() throws Throwable 
	{
	    metrics_page.click_save_metric();
	}

	@When("^user search metric \"([^\"]*)\"$")
	public void user_search_metric(String metric_name) throws Throwable 
	{
	    metrics_page.search_metric_name(metric_name);
	}

	@Then("^user should see metric created as \"([^\"]*)\"$")
	public void user_should_see_metric_created_as(String metric_name) throws Throwable 
	{
	    boolean res = metrics_page.is_Metric_Created(metric_name);
	    Assert.assertTrue(res);
	}
}	



