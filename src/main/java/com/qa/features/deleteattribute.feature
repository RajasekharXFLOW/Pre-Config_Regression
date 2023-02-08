@tag
Feature: Delete existing Attribute Test Case
  I want to use this template for test Delete existing Attribute feature

  @tag1
  	Scenario Outline: Delete existing Attribute Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    When user click on attribute tab
    And user search for attribute name "<attribute_name>"
    When user click on delete attribute 
    And user search for attribute name "<attribute_name>"
    Then user should see attribute deleted "<attribute_name>"
    When user clik logout
    And user click on close browser
    
    Examples:
    |attribute_name|
    |Test Edit Attribute Test|