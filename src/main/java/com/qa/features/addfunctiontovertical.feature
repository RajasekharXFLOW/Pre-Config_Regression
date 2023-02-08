Feature: Add Function to Vertical Test Case
  I want to use this template for Add Function to Vertical feature

  @tag1
  	Scenario Outline: Add Function to Vertical Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    When user click on functions from menu
    When user search function "<function_name>"
    And user read the count of actual verticals linked to function
    When user click action against function
    And user select vertical "<vertical_name>"
    And user click close the popup
    When user search function "<function_name>"
    Then user should see the verticals count updated
    When user clik logout
    And user click on close browser
    
    Examples:
    |function_name|vertical_name|
    |Testing 231|Quintess|
    
    