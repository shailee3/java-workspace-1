Feature: Gaati Shipping Customer Registration form
  A registration form to add a new customer to the company
    
  Scenario Outline: Validate the registration functionality for Gaati Shipping registration page
    Given I am on the registration page of 'Gaati Shipping' company
    When I fill my <name>, <age>, <address>, <phoneNumber>, <email> in the form and click on Submit
    Then I should be registered successfully and the <message> should be displayed

    Examples: 
      | name    | age | address                        |phoneNumber|email      |message                 |
      | "name1" |   5 | "a101 house,pune"              |3214343354 |"a@b.com"  |"Registered Succesfully"|
      | "name2" |   7 | "xyz flats, hinjewadi,pune"    |99888787   |"aa@bb.com"|"Registered Succesfully"|
