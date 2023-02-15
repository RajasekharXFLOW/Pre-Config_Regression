@tag
Feature: Edit existing Node Type Test Case
  I want to use this template for test Edit existing Node Type feature

  @tag1
  	Scenario Outline: Edit existing Node Type Test
    Then user should see login page
    When user enter username as password as and click login
    When user click on node type tab
    And user search for node type name "<node_name>"
    And user click on edit node type
    And user enter new node type name as "<new_node_name>"
    And user enter new node type short text as "<new_node_short_text>"
    And user enter new node type description as "<new_node_desc>"
    And user clik on save node type
    And user search for node type name "<new_node_name>"
    Then user should see node type created as "<new_node_name>"
    When user clik logout
  
    Examples:
		|node_name|new_node_name|new_node_short_text|new_node_desc|
		|Create new Node test|Edit new Node Type test|Test Edit|Testing Edit Functionality|
    
    
    
    
    
    
    
    
    