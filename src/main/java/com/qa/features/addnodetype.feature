@tag
Feature: Add new Node Type Test Case
  I want to use this template for test Add new Node Type feature

  @tag1
  	Scenario Outline: Create New Node Type Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    When user click on node type tab
    When user click on add node type
    And user enter node type name as "<node_name>"
    And user enter node type short text as "<short_text>"
    And user enter node type description as "<node_desc>"
    And user clik on save node type
    And user search for node type name "<node_name>"
    Then user should see node type created as "<node_name>"
    When user clik logout 
    And user click on close browser
    
    Examples:
    |node_name|short_text|node_desc|
    |Create new Node test|Test Node|Testing create new Node feature|