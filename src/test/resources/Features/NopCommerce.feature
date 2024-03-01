@demo
Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given Launch the Website and user navigates to login page
    When User enters valid username and password
    And Save the credentials and Clicks on login button
    Then User is navigated to the Dashboard page

  Scenario: Check orders
    Given Click on sales
    When Click on ordes
    Then Read the orders table

  Scenario: Edit one of the customer details
    Given Click on customers from dashboard
    When Click on edit buttom to change the password for the customer
    And Click on add rewards point
    Then Add the rewards points to the customer
    Then Read a table with added rewards points

  Scenario: Close the browser
    And Close the browser
