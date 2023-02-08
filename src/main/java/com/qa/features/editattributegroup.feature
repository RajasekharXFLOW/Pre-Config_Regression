@tag
Feature: Edit Existing Attribute Group Test Case
  I want to use this template for test Edit Existing Attribute Group feature

  @tag1
  	Scenario Outline: Edit Existing Attribute Group Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    When user click on attribute tab
    When user click on attribute group tab
    And user search for attribute group name "<attribute_group_name>"
    And user click edit attribute group
    And user enter new attribute group name as "<new_attribute_group_name>"
    And user enter new attribute group short text as "<new_attribute_group_short_text>"
    And user enter new attribute group description as "<new_attribute_group_desc>"
    And user node type from dropdown "<new_node_type>"
    And user clik on save attribute
    When user click on attribute group tab
    And user search for attribute group name "<new_attribute_group_name>"
    Then user should see attribute group created as "<new_attribute_group_name>"
    When user clik logout 
    And user click on close browser
    
    Examples:
    |attribute_group_name|new_attribute_group_name|new_attribute_group_short_text|new_attribute_group_desc|new_node_type|
    |Create new Attribute group test|Edit Attribute group test|Test|Testing Edit Attribute Group feature|KPI|