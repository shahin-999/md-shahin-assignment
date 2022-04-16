package pageObjectModelPackage;

import driverPackage.PageDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilityPackage.BaseMethods;

public class POM07Cart extends BaseMethods {
    public POM07Cart() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Continue shopping']//span[1]")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    public void clickContinueShopping() {
        continueShoppingButton.click();
    }

    public void clickProceedToCheckout() {
        proceedToCheckoutButton.click();
    }
}
