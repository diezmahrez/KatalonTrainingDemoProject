Feature: test login functionality


	@smoke  
  Scenario Outline: Check login is successful with valid credentials
  
 		 Given user is on login page
 		 When user enter <username> and <password>
 		 And click on login butoon
 		 Then user is navigated to home page
		
		@valid
		Examples:
			| username | password |
			| admin    | admin123 |
			
		@invalid	
		Examples:
			| username | password |
			| admin    | admin456 |