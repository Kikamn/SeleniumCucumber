package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Protectable;
import junit.runner.BaseTestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import page.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStep extends BaseTest {
    //cara bikin ini tulis dulu TC di login.feature
    // arahkan kursor ke tc yang garis kuning
    public static WebDriver driver;
   /* @Before
    public void beforeTest(){
        //System.out.println("Before");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disbale-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @After
    public void afterTest(){
        driver.close();
    }*/

    protected LoginPage loginPage; //inisialisasi
    @Given("user is on login page") //disebut Method
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver); // cara object
        loginPage.goToLoginPage(); //memangil inisialisasi yang di buat
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
