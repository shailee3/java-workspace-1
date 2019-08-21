Feature: Track shipment status 
Scenario: Sign-up a new user with datatable example.
Given the user is on landing page
When he chooses to sign up
And he provides his details as follows:
| firstName | lastName | email | password |
| Sukesh | Kumar | validemail@aq.com | password |
And he signs-up
Then he should be logged in to the application