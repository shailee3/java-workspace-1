Feature: Shipping Feature
  Show shipping details
  
  Scenario Outline: Verify shipping details
    Given I open the shipping detail application URL
    And I am able to see 'Shipping Details' been displayed as header
    When I click on the <shipmentId> link 
    Then I should be able to see correpsonding shipping details with <name>

    Examples: 
      | shipmentId  | name     | 
      | 6543217     | "Maya"   | 
         
