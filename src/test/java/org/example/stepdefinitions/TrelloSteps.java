package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrelloSteps {

    @Given("The test board exists and contains the correct information")
    public void getBoardAndCheckInfo(){
       System.out.println("We check the Board!");
    }
    //alt+enter on @When
    @When("I change the board title to {string}")
    public void changeBoardTitle(String name) {
        System.out.println("The new name is " + name);
    }
    @And("I check that the board was updated to {string}")
        public void checkBoardisUpdated(String name) {
        System.out.println("The board was changed to " + name);
    }
    @Then("I add a list with title {string} to the board")
    public void AddListwithTitle(String name) {
        System.out.println("The list with title is " + name);
    }
}
