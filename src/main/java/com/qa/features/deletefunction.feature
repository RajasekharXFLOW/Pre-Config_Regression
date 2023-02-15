@tag
Feature: Delete existing Function Test Case
  I want to use this template for test Delete existing Function feature

  @tag1
  	Scenario Outline: Delete existing Function Test
    Then user should see login page
    When user enter username as password as and click login
    When user click on functions from menu
    When user search function to delete "<function_name>"
    When user click on delete function 
    Then user should see function deleted "<function_name>"
    When user clik logout
    
    Examples:
    |function_name|
    |Edit new Function test|