@tag
Feature: Login Test Case
  I want to use this template for test Login feature

  @tag1
  	Scenario: Login Test
    Given user open browser with url
    Then user should see login page
    When user enter username as password as and click login
    Then user should see home page (verticals page)
    When user clik logout
    Then user should see login page 
    And user click on close browser