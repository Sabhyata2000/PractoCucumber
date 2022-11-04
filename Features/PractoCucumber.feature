Feature: Practo testing using cucumber
Description: This test is to check the functionality of Practo website

Background: User is logged in
Given User is on Practo homepage
When User clicks on login button
And User enters mobile number
And User enters password
And User clicks on Login


Scenario: Testing
When User enters a location
And User clicks on Medicine section
Then User is on Medicine page
When User clicks on Skin care section
And User clicks on Acne care category
Then User is on Acne care page
When User clicks on Add button under a product
And User clicks on plus button to add one more of the same item
Then User has successfully added products to the cart
When User clicks on View Cart button
Then User can successfully checkout the items in the cart