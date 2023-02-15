@tag
Feature: Add new Function Test Case
  I want to use this template for Add new Function feature

  @tag1
  	Scenario Outline: Create New Function Test
    Then user should see login page
    When user enter username as password as and click login
    When user click on functions from menu
    When user click on add function
    And user enter function name as "<function_name>"
    And user enter function short text as "<short_text>"
    And user enter function description as "<f_desc>"
    And user clik on save function
    When user search function "<function_name>"
    Then user should see function created as "<function_name>"
    When user clik logout
    
    Examples:
    |function_name|short_text|f_desc|
    |Create new Function test|Test|Testing create new Function feature|
    
    
