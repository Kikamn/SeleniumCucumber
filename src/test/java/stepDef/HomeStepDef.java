package stepDef;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeStepDef extends BaseTest{
    public static HomePage homePage;
    @Then("User is on homepage")
    public void userIsOnHomepage(){
       /* By backPackItem = By.xpath("//*[@id=\"item_4_title_link\"]/div");
        WebElement productElement = driver.findElement(backPackItem);
        assertTrue(productElement.isDisplayed());
        assertEquals("Swag Labs Backpack", productElement.getText());*/
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();


    }
}
