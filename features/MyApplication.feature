Feature: Test facebook smoke scenario

  Scenario Outline: Test login with unvalid credentials
    Given Open firefox and start application
    When I enter valid "<username>" and unvalid "<password>"
    Then user should not be able to login successfully
    Then application should be closed

    Examples:
      |username|password|
      |clovisdu5@hotmail.fr|toto|