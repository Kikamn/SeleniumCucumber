package com.rizkika.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    //cara bikin ini tulis dulu TC di login.feature
    // arahkan kursor ke tc yang garis kuning
    @Then("user is on homepage") //disebut anotation
    public void userIsOnHomepage() {

    }

    @Given("user is on login page") //disebut Method
    public void userIsOnLoginPage() {
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
    }

    @When("user click login button")
    public void userClickLoginButton() {
    }
}
