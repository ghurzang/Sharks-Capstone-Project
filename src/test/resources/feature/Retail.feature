@Retail
Feature: for this feature you have to have an existing account

Background:
    Given user is on Retail websited 
    And User click  on MyAccount     
    When  User click on Login 
    And User enter username "tigers@tekschool.us" and password "987654321" 
    And User click on Login button
    Then User should be logged in to MyAccount dashboard
 
    
Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on 'Register for an Affiliate Account' link 
    And User fill affiliate form with below information
        |company  |website        |taxID    |paymentMethod |
        |TekSchool|tek-school.com |1234678  |PayPal        |
    And User check on About us check box 
    And User click on Continue button 
    Then User should see a success message 
    
    
    
    


