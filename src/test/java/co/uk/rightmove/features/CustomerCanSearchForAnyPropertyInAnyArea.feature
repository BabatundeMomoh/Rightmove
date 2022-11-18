Feature: Search Functionality
  As a user
  I want the ability to search for any property in any area
  so that I can purchase it

  Scenario Outline: User can search for a house
    Given I navigate to the homepage
    When I enter '<Location>' in the search field
    And I click on For sale button
    And I select radius '<Radius>' of the location
    And minimum price range of '<MinPrice>'
    And maximum price range of '<MaxPrice>'
    And I select '<MinBed>' as the minimum no of bedroom
    And I select '<MaxBed>' as the maximum no of bedroom
    And I select '<Property>' as the property type
    And I select '<AddedToSite>' as Added to site option
    And I click on Find properties button
    And I ensure that Search result page is displayed
    And I click on the second result
    Then the details of the property is displayed
    Examples: Test data for different properties
    |Location  |Radius         |MinPrice|MaxPrice|MinBed|MaxBed|Property|AddedToSite|
    |Manchester|Within 10 miles|125,000 |250,000 |2     |4     |Houses  |Last 7 days|
    #|London    |Within 1 miles |250,000 |500,000 |2     |4     |Houses  |Last 24 house|
