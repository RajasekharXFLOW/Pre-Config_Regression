@tag
Feature: Delete Existing Attribute Group Test Case
  I want to use this template for test Delete Existing Attribute Group feature

  @tag1
  	Scenario Outline: Delete Edit Existing Attribute Group Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    When user click on attribute tab
    When user click on attribute group tab
    And user search for attribute group name "<attribute_group_name>"
    And user click delete attribute group
    When user click on attribute group tab
    And user search for attribute group name "<attribute_group_name>"
    Then user should see attribute group deleted "<attribute_group_name>"
    When user clik logout 
    And user click on close browser
    
    Examples:
    |attribute_group_name|
    |Testing|