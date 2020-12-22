#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Select Courses 

  @tag1
  Scenario: Join course demo class 
    Given user is in the Cyber Tech homepage
    When user clicks on Select Courses 
    Then user clicks on first course in the Marketing Category 
    And user provides name, email, phone number to join the demo class
    And user continues to repeat the same steps for the rest of the courses in all course categories
    Then user closes browser
    
    

    
    
    
    

  
