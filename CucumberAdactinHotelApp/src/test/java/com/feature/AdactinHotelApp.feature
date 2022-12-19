Feature: User to Book a Hotel Room 




Scenario: User to login the account 
	Given User to launch the Url 
	
	When User to give the username 
	And User to give the password 
	And User to click the login 
	
Scenario: User to give the room details and search the hotel 
	When User to select the location 
	And User to select the hotels 
	And User to select the room type 
	And User to select the no of rooms 
	And User to give the checkin details 
	And User to give the checkout details 
	And User to select the adults per room 
	And User to select the childrens per room 
	And User to select the search 
	
Scenario: User to select the hotel and continue 
	When User to select the radio button 
	And User to select the continue 
	
Scenario: User to give information details and book hotel 
	When User to give the first name 
	And User to give the last name 
	And User to give the bill address 
	And User to give the credit card no 
	And User to select credit card type 
	And User to select expiry month 
	And User to select expiry year 
	And User to give credit card cvv number 
	And User to click booknow 
	
	
	
	
	
	
	
	
	    