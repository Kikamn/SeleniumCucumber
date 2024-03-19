package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {
    public static WebDriver driver;

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void validateOnHomePage(){
        ///assertTrue(driver.findElement(backPackItem).isDisplayed());
        WebElement prductElement = driver.findElement(productTitle);
        assertTrue(prductElement.isDisplayed());
        assertEquals("Swag Labs Backpack", prductElement.getText());
    }
}
