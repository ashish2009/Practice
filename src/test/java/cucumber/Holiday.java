package cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

import java.util.List;
import java.util.Map;

public class Holiday extends Setup{

    /*

    Start and end symbol ^  $
    Passing values from scenarios
    [a-zA-Z]{1,} - Any number of alphabets
    \\d+ - Any number of digit
    [a-zA-Z0-9]{1,} - Alpha numeric
    (.*) - list
    [^\"]* - Anything


     */

    /*
       This @Before and @After will run before/after every scenario
     */
    @Before
    public void beforeScenario(){
        System.out.println("---------------Before Execution-----------");
    }

    @After
    public void afterScenario(){
        System.out.println("---------------After Execution-----------");
    }


    /*
     We can set different before/after for specific scenario like shown below
     */

    @Before("@BookHotel")
    public void beforeHotelScenario(){
        System.out.println("---------------Before BookHotel Scenario Execution-----------");
    }

    @After("@BookHotel")
    public void afterHotelScenario(){
        System.out.println("---------------After BookHotel Scenario Execution-----------");
    }

    @Given("^I live in ([a-zA-Z]{1,})$")
    public void i_live(String cityName){
        System.out.println("I live in "+cityName);
        setup();
    }

    @And("^I want to go on a holiday$")
    public void i_want(){
        System.out.println("I want to go on a holiday");
    }

    @And("^I want to travel$")
    public void to_travel(List<String> places){
        System.out.println("I want to travel "+places.toString());
    }

    @And("^We are (\\d+) adults$")
    public void we_are(int adults, List<Map<String,String>> names){
        System.out.println("We are "+adults+" adults "+ names.toString());
    }

    @And("^We want to book from ([^\"]*) to ([^\"]*)$")
    public void we_want_to_book(String from,String to){
        System.out.println("We want to book from "+from+" to "+to);
    }

    @When("^I go to travel agent$")
    public void go_to_travel_agent(){
        System.out.println("I go to travel agent");
    }

    @Then("^He should be able to help me in a budget of 1000 USD$")
    public void help_me_in_budget(){
        System.out.println("He should be able to help me in a budget of 1000 USD");
    }

    @And("^He should provide me option to cancel$")
    public void provide_option(){
        System.out.println("He should provide me option to cancel");
    }

    @But("^He should not ask for advance more then 300 USD$")
    public void should_not_ask(){
        System.out.println("He should not ask for advance more then 300 USD");
    }

    @And("We want to book flight to ([a-zA-Z]{1,}) on ([^\"]*)")
    public void book_flight(String destination,String fromDate){
        System.out.println("We want to book flight to "+destination+" on "+fromDate);
    }

    @And("Return flight on ([^\"]*)")
    public void return_flight(String returnDate){
        System.out.println("Return flight on "+returnDate);
    }
}
