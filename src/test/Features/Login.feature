Feature: Login Test

  Scenario: Go to website and test login page
      Given user launch chrome browser
      When user open URL "https://admin-demo.nopcommerce.com/login"
      And user enters email as "admin@yourstore.com" and password as "admin"
      And click on Login
      Then Page Title
      When user click on Log out link
      And close browser