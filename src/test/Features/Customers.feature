Feature: Customers

  Scenario: Add a new Customer
    Given user launch chrome browser
    When user open URL "https://admin-demo.nopcommerce.com/login"
    And user enters email as "admin@yourstore.com" and password as "admin"
    And click on Login
    Then User can view Dashboad
    When user click on customers Menu Item
    And click on Add new button
    Then User can view Add new customer page
    When User enter customer info
    And click on Save button
    Then User can view confirmation message "The new customer has been added successfully."
    And close browser
