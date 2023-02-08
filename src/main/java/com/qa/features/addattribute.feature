@tag
Feature: Add New Attribute Test Case
  I want to use this template for test Add New Attribute feature

  @tag1
  	Scenario Outline: Create New Attribute Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    When user click on attribute tab
    When user click on add attribute
    And user enter attribute name as "<attribute_name>"
    And user enter attribute short text as "<attribute_short_text>"
    And user enter attribute data type "<attribute_data_type>"
    And user enter attribute description as "<attribute_desc>"
    And user enter attribute default value as "<default_value>"
    And user clik on save attribute
    And user search for attribute name "<attribute_name>"
    Then user should see attribute created as "<attribute_name>"
    When user clik logout 
    And user click on close browser
    
    Examples:
    |attribute_name|attribute_short_text|attribute_data_type|attribute_desc|default_value|
    |Create new Attribute test|Test|String|Testing create Attribute feature|Default|