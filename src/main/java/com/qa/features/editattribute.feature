@tag
Feature: Edit Existing Attribute Test Case
  I want to use this template for test Edit Existing Attribute feature

  @tag1
  	Scenario Outline: Edit Existing Attribute Test
    Then user should see login page
    When user enter username as password as and click login
    When user click on attribute tab
    And user search for attribute name "<attribute_name>"
    When user click on edit attribute
    And user enter new attribute name as "<new_attribute_name>"
    And user enter new attribute short text as "<new_attribute_short_text>"
    And user enter new attribute data type "<new_attribute_data_type>"
    And user enter new attribute description as "<new_attribute_desc>"
    And user enter new attribute default value as "<new_default_value>"
    And user clik on save attribute
    And user search for attribute name "<new_attribute_name>"
    Then user should see attribute created as "<new_attribute_name>"
    When user clik logout 
    
    Examples:
    |attribute_name|new_attribute_name|new_attribute_short_text|new_attribute_data_type|new_attribute_desc|new_default_value|
    |Create new Attribute test|Test Edit Attribute Test|Test|Integer|Testing Edit Attribute feature|NA|