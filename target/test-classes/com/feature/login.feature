Feature: This feature is to test login functionalities. 
   @smoke 
  Scenario: This scneario is to test login with valid credential.
  Given Launch the browser and load the Url
  When Provide valid username and password hit login "Aiite1" and "1345567AAA"
  Then Validate if the user logged in successfully "HomePage"
  
@smoke
 Scenario: This scneario is to test login with invalid credential.
  Given Launch the browser and load the Url
  When Provide valid username and password hit login "Aiite2" and "1345567AAA35254"
  Then Validate if the user logged in successfully "error"