@raja
Feature: As a User
  I Want to Navigate to Menu tab on Homepage and
  I want to checkout on Redtea and
  I Want to Place order

  Scenario: I Should able to click on Menu Button On Homepage
     Given I am on Homepage
     When I click on Menu Button
     Then I Should be able to see Menu Page

  Scenario: I Should be able to click on checkout button for Redtea
    Given  I am on Menu Page
    When I Click on checkout Button
    And I enter my email adress
    And I enter my name
    And I enter my adress
    And I enter my cardtype
    And I enter my Cardnumber
    And I enter my Cardholdername
    And I enter my verificationcode
    And I clicl on placeorder button
    Then I Should be able to place order successfully