Feature: Registration functionality
@Smoke
Scenario: To verify registration functionality by entering valid credentials
Given user has launched the browser and the application
When user enter valid firstname
When user enter valid lastname
When user enter valid email
When user enter valid telephone
When user enter valid password
When user enter valid password confirm
When user click on radio button
When user click on privacy policy checkbox
When user click on continue button
Then user able to be in homepage

