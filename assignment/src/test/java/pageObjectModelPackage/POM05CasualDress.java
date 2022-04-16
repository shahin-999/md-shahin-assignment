package pageObjectModelPackage;

import driverPackage.PageDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilityPackage.BaseMethods;

public class POM05CasualDress extends BaseMethods {
    public POM05CasualDress() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(className = "product-container")
    public WebElement product;

    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    public WebElement addToCartButton;

    public String casualDressesPageTitle = "Casual Dresses - My Store";

    public void productAddToCart() {
        scrollToElement(product);
        hover(product);
        addToCartButton.click();

    }
}
