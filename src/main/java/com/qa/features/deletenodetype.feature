@tag
Feature: Delete existing Node Type Test Case
  I want to use this template for test Delete existing Node Type feature

  @tag1
  	Scenario Outline: Delete existing Node Type Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    When user click on node type tab
    And user search for node type name "<node_name>"
    When user click on delete node type 
    And user search for node type name "<node_name>"
    Then user should see node type deleted "<node_name>"
    When user clik logout
    And user click on close browser
    
    Examples:
    |node_name|
    |Edit new Node Type test|