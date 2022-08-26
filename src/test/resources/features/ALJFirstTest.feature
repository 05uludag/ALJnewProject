@wip
Feature: Search Box Test
  Background:
    Given the user go to the Toyota home Page

    Scenario: Search Box Verification
      Then the user verify that search box is seen

      Scenario: Search Button Verification
        And The user verify that Search Button is disabled
        Then the user type any letter to search Box
        And The user verify that Search Button is enabled

        Scenario: Search with text
          When the user types "Gasket" on Search Box
          And the user click Search button
          Then the user verify that "Is this part compatitable with your car?" is written on the car copatitable box
