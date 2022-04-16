package utilityPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverPackage.PageDriver;

public class BaseMethods {
    //get current page title
    public String getTitle() {
        return PageDriver.getCurrentDriver().getTitle();
    }

    //send text to the input field
    public void sendText(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

   //hover in web element
    public void hover(WebElement element) {
        Actions actions = new Actions(PageDriver.getCurrentDriver());
        actions.clickAndHold(element).build().perform();
    }


    //select item with value
    public void selectitem(WebElement element, String value) {
        Select selectItems = new Select(element);
        selectItems.selectByValue(value);
    }

    //scroll webpage
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

//Handle Wait Related Task

    WebDriverWait wait;
    // wait for default set seconds
    public void timeOut() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // wait for customize given seconds
    public void timeOut(int duretionMS) {
        try {
            Thread.sleep(duretionMS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Wait for an alert present and return with an alert
    public Alert waitForAlert() {
        wait = new WebDriverWait(PageDriver.getCurrentDriver(), Duration.ofSeconds(30));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        return alert;
    }

   //wait for page loading
    public void waitForPageLoad() {
        wait = new WebDriverWait(PageDriver.getCurrentDriver(), Duration.ofSeconds(30));
        wait.until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState;").equals("complete"));
    }
}
