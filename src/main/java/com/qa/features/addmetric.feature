@tag
Feature: Add new Metric Test Case
  I want to use this template for Add new Metric feature

  @tag1
  	Scenario Outline: Create New Metric Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    When user click on metrics tab
    When user click on add metric
    And user select metric type from dropdown "<metric_type>"
    And user enter metric name as "<metric_name>"
    And user enter metric display name as "<display_name>"
    And user enter metric description as "<m_desc>"
    And user select attribute group from dropdown "<att_group_dd>"
    And user clik on save metric
    When user search metric "<metric_name>"
    Then user should see metric created as "<metric_name>"
    When user clik logout
    And user click on close browser
    
    Examples:
    |metric_type|metric_name|display_name|m_desc|att_group_dd|
    |Test|Testing create new Metric feature|Test|Testing Add metric|Default Attribute|
    
    
