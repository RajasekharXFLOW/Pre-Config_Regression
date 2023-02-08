@tag
Feature: Delete existing Vertical Test Case
  I want to use this template for test Delete existing Vertical feature

  @tag1
  	Scenario Outline: Delete existing Vertical Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    And user search vertical to delete "<vertical_name>"
    When user click on delete vertical
    Then user should see vertical deleted "<vertical_name>"
    When user clik logout
    And user click on close browser
    
    Examples:
    |vertical_name|
    |Create new Vertical test|
		
    
    
    
    
    
    
    