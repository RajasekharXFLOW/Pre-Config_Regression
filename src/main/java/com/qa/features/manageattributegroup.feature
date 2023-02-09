@tag
Feature: Manage Attribute Group Test Case
  I want to use this template for test Manage Attribute Group feature by adding Attribute to Group.

  @tag1
  	Scenario Outline: Manage Attribute Group Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    When user click on attribute tab
    When user click on attribute group tab
    And user search for attribute group name "<attribute_group_name>"
    When user read the count of no attributes against the attribute group
    And user click actions against attribute group
    And user select required attribute in popup window "<attribute_name>"
    And user search for attribute group name "<attribute_group_name>"
    When user read the count of no attributes against the attribute group
    Then user should see the count updated
    When user clik logout 
    And user click on close browser
    
    Examples:
    |attribute_group_name|attribute_name|
    |Create new Attribute group test|Goal|