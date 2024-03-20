package page;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static stepDef.BaseTest.driver;

public class LoginPage {
    By usernameInputText = By.cssSelector("input#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");

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
