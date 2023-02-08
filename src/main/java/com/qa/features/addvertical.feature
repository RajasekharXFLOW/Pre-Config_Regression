@tag
Feature: Add new Vertical Test Case
  I want to use this template for test Add new Vertical feature

  @tag1
  	Scenario Outline: Create New Vertical Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    When user click on add vertical
    And user enter vertical name as "<vertical_name>"
    And user enter vertical short text as "<short_text>"
    And user enter vertical description as "<v_desc>"
    And user select time range as "<time_range>"
    And user select value range as "<value_range>"
    And user select data range as "<data_range>"
    And user select trend range as "<trend_range>"
    And user select context range as "<context_range>"
    And user select contributors range as "<contributors_range>"
    And user select recomended actions range as "<recomended_actions_range>"
    And user select prediction range as "<prediction_range>"
    And user clik on save
    Then user should see vertical created as "<vertical_name>"
    When user clik logout
    Then user should see login page 
    And user click on close browser
    
    Examples:
    |vertical_name|short_text|v_desc|time_range|value_range|data_range|trend_range|context_range|contributors_range|recomended_actions_range|prediction_range|
    |Create new Vertical test|Test|Testing create new vertical feature|Daily|WEEKLY|WEEKLY|WEEKLY|WEEKLY|WEEKLY|WEEKLY|WEEKLY|
    
    
