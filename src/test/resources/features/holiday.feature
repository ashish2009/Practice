@BookHotelAndFlights
  Feature: Going on holiday
    I want to book flight tickets and hotel

  @BookHotel
  Scenario: I want to book hotel
    Given I live in Bangalore
    And I want to go on a holiday
    And We are 10 adults
    And We want to book from 10th jan 2019 to 20th jan 2019
    When I go to travel agent
    Then He should be able to help me in a budget of 1000 USD
    And He should provide me option to cancel
    But He should not ask for advance more then 300 USD
