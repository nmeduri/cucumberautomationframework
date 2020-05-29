Feature: This will always be false
  Test scenario
  Scenario: Always false
    Given User is anonymous
    When User navigates to shopping cart
    Then Checkout is enabled
