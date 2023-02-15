@tag
Feature: Add New Attribute Group Test Case
  I want to use this template for test Add New Attribute Group feature

  @tag1
  	Scenario Outline: Create New Attribute Group Test
    Then user should see login page
    When user enter username as password as and click login
    When user click on attribute tab
    When user click on attribute group tab
    When user click on add attribute group
    And user enter attribute group name as "<attribute_group_name>"
    And user enter attribute group short text as "<attribute_group_short_text>"
    And user enter attribute group description as "<attribute_group_desc>"
    And user node type from dropdown "<node_type>"
    And user clik on save attribute
    When user click on attribute group tab
    And user search for attribute group name "<attribute_group_name>"
    Then user should see attribute group created as "<attribute_group_name>"
    When user clik logout
    
    Examples:
    |attribute_group_name|attribute_group_short_text|attribute_group_desc|node_type|
    |Create new Attribute group test|Test|Testing create Attribute Group feature|KPI|