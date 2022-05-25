@LaptopsAndNoteBooks
Feature: Laptops and NoteBooks

Scenario: Add and remove Mac book from cart 
     Given User is on Retail website
     When User click on Laptop & NoteBook tab 
     And User click on Show all Laptop & NoteBook option 
     And User click on MacBook item 
     And User click add into Cart button 
     Then User should see a message 'Success: You have added MacBook to your shopping cart!'
     And User should see '1 item(s)-602.00' showed to the cart 
     And User click on cart option 
     And user click on red X button to remove the item from cart
     Then item should be removed and cart should show '0 item(s)'
     
Scenario: Product Comparison  
     Given User is on Retail website
     When User click on Laptop & NoteBook tab 
     And User click on Show all Laptop & NoteBook option 
     And User click on product comparison icon on 'MacBook'
     And User click on product comparison icon on 'MacBook Air'
     Then User should see message 'Success: You have added MacBook Air to your product comparison!'
     And User click on Product comparison link 
     Then User should see Product Comparison Chart
     
