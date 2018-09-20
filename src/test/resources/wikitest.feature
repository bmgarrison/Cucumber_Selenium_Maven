
Feature: Wiki test

  Scenario Outline: Title of your scenario
   Given I open wikipedia
   When I type an input <input>
   And press search
   Then I validate the outcomes
    
  Examples:
  
  | input   |
  | "Java"  |
  | "Python"|
    
    
