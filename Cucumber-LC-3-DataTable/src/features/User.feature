Feature: Track shipment status 
		 Using the application user can track their shipment status and details. 
Scenario: Using the application user can track their shipment status and details. 

Given user is on landing page
When  user enter his name
| name   | 
| Shamili| 
Then The name,shipmentid,phone number,e-mailId should be displayed.