*** Settings ***
Library           keywords.CustomKeywords


*** Keywords ***
The user starts a new game with number
    [Arguments]     ${number}
    Start new game with     ${number}

The user makes a guess of
    [Arguments]     ${guess}
    Make guess      ${guess}

The result should be
    [Arguments]         ${result}
    ${actual}=          Get result of guess
    Should Be Equal     ${result}   ${actual}


*** Test Cases ***
Scenario: Guess too high
    Given the user starts a new game with number    42
    And the user makes a guess of   50
    Then the result should be       HIGH

Scenario: Guess too low
    Given the user starts a new game with number    42
    And the user makes a guess of   25
    Then the result should be       LOW

Scenario: Guess just right
    Given the user starts a new game with number    42
    And the user makes a guess of   42
    Then the result should be       EQUAL

