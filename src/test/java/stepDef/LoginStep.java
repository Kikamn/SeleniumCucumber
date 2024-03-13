package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
    //cara bikin ini tulis dulu TC di login.feature
    // arahkan kursor ke tc yang garis kuning
    @Then("user is on homepage") //disebut anotation
    public void userIsOnHomepage() {
        System.out.println("Test 1");
    }

    @Given("user is on login page") //disebut Method
    public void userIsOnLoginPage() {
        System.out.println("Test 2");
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        System.out.println("Test 3");
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        System.out.println("Test 4");
    }

    @When("user click login button")
    public void userClickLoginButton() {
        System.out.println("Test 5");
    }
}
