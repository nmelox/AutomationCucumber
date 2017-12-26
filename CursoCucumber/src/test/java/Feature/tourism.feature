Feature: Curso de automation

Scenario Outline: Log in to the system

Given I enter a username <username>
And I enter a password <password>
When I click  Sign-In button
Then login result must be <result>

Examples:
|username |password |result     |
| pepe    | pepe    | badLogin  |
| mercury | mercury | goodLogin |