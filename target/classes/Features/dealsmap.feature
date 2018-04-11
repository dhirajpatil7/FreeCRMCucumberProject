Feature: Deal data creation 

Scenario: Free CRM create new deal scenario 

	Given User is already on login page 
	When title of login page is Free CRM 
	Then user enters username and password 
		| username | password |
		| naveenk | test@123 | 
	Then user clicks on login button 
	Then user is on home page 
	Then user moves to deal page 
	Then user enters deal details 
		| title 	 | amount | probability | commission |
		| test deal1 | 1400   | 60 			| 12 		 |
		| test deal2 | 1300   | 70 			| 13 		 |
		| test deal3 | 1000   | 40 			| 16 		 |
		
	Then Close the browser