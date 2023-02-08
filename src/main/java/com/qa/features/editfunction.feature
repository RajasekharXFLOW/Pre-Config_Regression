@tag
Feature: Edit existing Function Test Case
  I want to use this template for test Edit existing Function feature

  @tag1
  	Scenario Outline: Edit existing Function Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    When user click on functions from menu
    When user search function "<function_name>"
    And user click on edit function "<function_name>"
    And user enter new function name as "<new_function_name>"
    And user enter new function short text as "<new_short_text>"
    And user enter new function description as "<new_f_desc>"
    And user clik on save function
    When user search function "<new_function_name>"
    Then user should see function created as "<new_function_name>"
    When user clik logout
    And user click on close browser
    
    Examples:
		|function_name|new_function_name|new_short_text|new_f_desc|
		|Create new Function test|Edit new Function test|Test Edit|Testing Edit Functionality|
    
    
    
    
    
    
    
    
    