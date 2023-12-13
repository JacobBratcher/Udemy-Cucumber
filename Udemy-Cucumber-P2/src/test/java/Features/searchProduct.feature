Feature: Search and place the order for products

Scenario: Search experience for product search in both home and offers page

Given User is on GreenCart landing page  
When User searched for short name "Tom" and extracted the actual name of the product
Then User searches for same short name in offersd page to check if the product exists 
Then It is verified that both pages display the same product when searching with a short name