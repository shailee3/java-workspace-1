Feature: Shipping feature
Calculate the total shipping cost of the cargo based on weight , mode of trasport and type of customer.  
  
  Scenario Outline: Verify the shipping calculation
    Given I am on Datex Shipping company portal
    When I enter <weight> and select <transport> mode and click Calculate button
    Then I should be able to see the shipping cost <message>

    Examples: 
      | weight  | transport   | message                                          |
      | 100     |     "air"   | "Dear Customer, your total shipping cost is $100"|
      | 100     |     "ship"  | "Dear Customer, your total shipping cost is $70" |
			| 100     |     "road"  | "Dear Customer, your total shipping cost is $50" |