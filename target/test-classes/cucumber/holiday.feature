@BookHotelAndFlights
  Feature: Going on holiday
    I want to book flight tickets and hotel

    Background:
      Given I live in Mumbai
      And I want to go on a holiday
      And I want to travel
        |Goa|Delhi|Kolkata|

  @BookHotel
  Scenario: I want to book hotel
    And We are 3 adults
      |Adult1|Adult2|Adult3|
      |A     |B     |C     |
      |23    |25    |30    |
    And We want to book from 10th jan 2019 to 20th jan 2019
    When I go to travel agent
    Then He should be able to help me in a budget of 1000 USD
    And He should provide me option to cancel
    But He should not ask for advance more then 300 USD

    @BookFlight
    Scenario Outline: I want to book hotel
      And We are 3 adults
        |Adult1|Adult2|Adult3|
        |A     |B     |C     |
        |23    |25    |30    |
      And We want to book flight to <Destination> on <FromDate>
      And Return flight on <ToDate>

      Examples:
      |Destination|FromDate   |ToDate       |
      |Goa        |2nd oct 2019|5th oct 2019 |
      |Delhi      |6th oct 2019|10th oct 2019|
