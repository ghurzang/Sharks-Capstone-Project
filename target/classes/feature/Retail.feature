@Retail
Feature: for this feature you have to have an existing account

Background:
    Given User is on Retail website 
    And User click  on MyAccount     
    When  User click on Login 
    And User enter username "azg1234@tekschool.us" and password "123abcd" 
    And User click on Login button
    Then User should be logged in to MyAccount dashboard
 
    
Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on 'Register for an Affiliate Account' link 
    And User fill affiliate form with below information
   # |company|website|taxID|paymentMethod|
   # And User check on About us check box 
   # And User click on Continue button 
   # Then User should see a success message 
    
    
    
    


