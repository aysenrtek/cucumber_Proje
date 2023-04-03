package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(15));
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

    public void sendKeysFunction(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.clear();
        element.sendKeys(text);
    }

    public void clickFunction(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
    }

//    public void Assertion(WebElement actual, String expected) {   // text doğrulama fonksiyonu
//        wait.until(ExpectedConditions.visibilityOf(actual));
//        Assert.assertEquals(actual.getText(), expected);
//        System.out.println("My Message :" + actual.getText());

    public void verifyContains (WebElement element, String value)
    {
        wait.until(ExpectedConditions.textToBePresentInElement(element,value)); //Hem text'in gözüksün hem var olsun
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"Assertion failed");
    }
}
