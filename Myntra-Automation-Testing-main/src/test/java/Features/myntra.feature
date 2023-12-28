
@tag
Feature: Myntra Automation testing
  I want to use this template for my feature file

  @tag1
  Scenario: Product add to cart
    Given I want to open the Myntra website
    And login to Myntra
    And search for the <iteam>
    When select the Iteam 
    And click add to cart button
    

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    Examples: 
      | iteam  |
      | tees |
