@tag
Feature: Delete existing Function Test Case
  I want to use this template for test Delete existing Function feature

  @tag1
  	Scenario Outline: Delete existing Function Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    When user click on functions from menu
    When user search function to delete "<function_name>"
    When user click on delete function 
    Then user should see function deleted "<function_name>"
    When user clik logout
    And user click on close browser
    
    Examples:
    |function_name|
    |Edit new Function test|