@Retail
Feature: for this feature you have to have an existing account

  Background: 
    Given user is on Retail websited
    And User click  on MyAccount
    When User click on Login
    And User enter username "h.h@gmail.com" and password "1234"
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company   | website      | taxID   | paymentMethod | payeeName |
      | tekSchool | tekschool.us | 1234678 | Cheque        | test      |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on 'Edit your affiliate information' link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | BOA      |    123456 |    002100 | tek         |   11234567890 |
    And User click on Continue button
    Then User should see a success message


  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastName | email         | telephone  |
      | Jan       | Khan     | g.g@gmail.com | 1234567890 |
    And User click on continue button
    Then User should see a message 'Success: Your account has been successfully updated'.
