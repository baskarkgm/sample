Feature: Title of your feature
I want to use this template for my feature file
 
 @tag2
  Scenario Outline: Title of your scenario outline.
  Given I want to write a step with "<name>"
  When I check for the "<value>" in step
  Then I verify the "<status>" in step
  
  Examples:
  | name  | value | status  |
  | name1 | a5    | success |
  | name2 | b7    | Fail    |
  | name3 | b8    | Fail    |
  