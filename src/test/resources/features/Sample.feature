Feature: cucumber Jvm should work with Scala 2.12


  Scenario: Simple scenario works when run with Scala 2.12 1
    Given I have '4' cukes in the jar
    When I eat '1' cukes
    Then There are '3' cukes in the jar
    And I am not full

  Scenario: Simple scenario works when run with Scala 2.12 2
    Given I have '6' cukes in the jar
    When I eat '2' cukes
    Then There are '4' cukes in the jar
    And I am full