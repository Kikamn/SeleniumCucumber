package stepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginStep {

    LoginPage loginPage;

    public LoginStep() {
        this.loginPage = new LoginPage();
    }
    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage.goToLoginPage();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
     /*By usernameInputText = By.cssSelector("input#user-name");
        driver.findElement(usernameInputText).sendKeys(username); //selenium snytack*/
        //cara object oop
        loginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        /*By passwordInputText = By.xpath("//*[@id=\"password\"]");
        driver.findElement(passwordInputText).sendKeys(password);*/
        //cara oop
        loginPage.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        /*By loginButton = By.id("login-button");
        driver.findElement(loginButton).click();*/
        //cara object oop
        loginPage.clickButtonLogin();
    }

    @Then("user able to see error message {string}")
    public void userAbleToSeeErrorMessage(String errorMassage) {
        //assertTrue(driver.getPageSource().contains(errorMassage));
        //cara objeck oop
        loginPage.validateErrorAppear(errorMassage);
    }
}
