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
Feature: Google Feature 'I'm Feeling Lucky'
  
  Scenario: To validate Google's 'I'm Feeling Lucky' feature
    Given I have launched Google on my browser
    When I click on 'I'm Feeling Lucky' button
    Then Google doodles page should open
    And Link for 'Sufia Kamal's 108th Birthday' should be present
