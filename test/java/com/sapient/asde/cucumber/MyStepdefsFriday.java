package com.sapient.asde.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


class IsItFriday {
    static String isItFriday(String today) {
//        return null;
//        return "Nope";
//        return "TGIF";

//        if(today.equals("Friday")){
//            return "TGIF";
//        }
//        return "Nope";

        return "Friday".equals(today) ? "TGIF" : "Nope";
    }

}

public class MyStepdefsFriday {
    private String today;
    private String actualAnswer;

    @Given("today is Sunday")
    public void todayIsSunday() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        today = "Sunday";
    }


    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        assertEquals(expectedAnswer, actualAnswer);
    }



    @Given("today is Friday")
    public void today_is_friday() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        today="Friday";
    }
}
