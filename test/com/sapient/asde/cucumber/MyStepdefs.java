package com.sapient.asde.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I have <opening balance> beer cans")
    public void iHaveOpeningBalanceBeerCans() {
    }

    @And("I have drunk <processed> beer cans")
    public void iHaveDrunkProcessedBeerCans() {
    }

    @When("I go to my fridge")
    public void iGoToMyFridge() {
    }

    @Then("I should have <in stock> beer cans")
    public void iShouldHaveInStockBeerCans() {
    }

    @Given("I have {int} beer cans")
    public void i_have_beer_cans(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @Given("I have drunk {int} beer cans")
    public void i_have_drunk_beer_cans(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @Then("I should have {int} beer cans")
    public void i_should_have_beer_cans(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
}
