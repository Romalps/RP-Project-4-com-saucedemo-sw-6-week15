Feature:  Login Test
  As user I want to login into sauce demo website

  @smoke
  Scenario: User should Login successfully with valid credentials
    Given I am on Homepage
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click on Login button
    Then verify the text "Products" is displayed
