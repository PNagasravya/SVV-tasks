Feature: Check if the website is accessible

  Scenario: Verify the NOVA website is accessible
   Given Browser is open
   When the user navigates to the NOVA website
   Then the user should be on NOVA website
   