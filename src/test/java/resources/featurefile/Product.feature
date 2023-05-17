Feature:  Product Test
  As user I want to login into sauce demo website
@sanity @regression
  Scenario: Verify that six products are displayed on page
    Given I am on Homepage
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click on Login button
    Then verify that "6" products are displayed on page