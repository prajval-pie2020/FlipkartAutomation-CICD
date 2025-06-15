Feature: To validate the flipkart Application

  Background:

    Given Launch the flipkart Application
    When Close the popup
    Then It should Navigate to the home page

  Scenario: To validate the Search functionality

      Given User enter the Text in the Search Field
      When Click the search button
      Then It should Navigate to the search page and display result
      And Select Minimum and Maximum Amount
      And Select the Brand
      And Select the Ram
      And Select the Battery Capacity
      Then It should display the Relevant result
