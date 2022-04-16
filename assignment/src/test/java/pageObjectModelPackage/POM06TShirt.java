package pageObjectModelPackage;

import driverPackage.PageDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilityPackage.BaseMethods;

public class POM06TShirt extends BaseMethods {
    public POM06TShirt() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(id = "layered_id_attribute_group_14")
    public WebElement filterBlueColorCheckbox;

    @FindBy(className = "product-container")
    public WebElement product;

    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    public WebElement addToCartButton;

    public String t_ShirtsPageTitle = "T-shirts - My Store";

    public void filterBlueColor() {
        filterBlueColorCheckbox.click();

    }

    public void productAddToCart() {
        scrollToElement(product);
        hover(product);
        addToCartButton.click();
    }
}
