package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {
    public static WebDriver driver;
    By usernameInputText = By.cssSelector("input#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver){ //bikin contractur yang sama dengan name class
        this.driver = driver;
    }
    public void goToLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }
    public void inputUsername(String username){
        driver.findElement(usernameInputText).sendKeys(username); //selenium snytack
    }
    public void inputPassword(String password){
        driver.findElement(passwordInputText).sendKeys(password);
    }
    public void clickButtonLogin(){
        driver.findElement(loginButton).click();
    }
    public void validateErrorAppear(String errorMassage){
        assertTrue(driver.getPageSource().contains(errorMassage));
    }
}
