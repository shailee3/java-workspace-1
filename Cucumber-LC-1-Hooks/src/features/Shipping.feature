Feature: Title of your feature
  I want to use this template for my feature file
  
  Scenario Outline: Title of your scenario outline
    Given I am on Datex Shipping company portal
    When I enter <weight> and select <transport> mode and click Calculate button
    Then I should be able to see the shipping cost <message>

    Examples: 
      | weight  | transport   | message                                          |
      | 100     |     "air"   | "Dear Customer, your total shipping cost is $100"|
      | 100     |     "ship"  | "Dear Customer, your total shipping cost is $70" |
			| 100     |     "road"  | "Dear Customer, your total shipping cost is $50" |