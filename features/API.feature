Feature: Test facebook smoke scenario

  Scenario: Test login with unvalid credentials
    Given Open login application
    When I sign in
    And I consult my catalogs
