package pageObjectModelPackage;

import driverPackage.PageDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilityPackage.BaseMethods;

public class POM01HomePage extends BaseMethods {

    public POM01HomePage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(className = "login")
    public WebElement btnSignin;

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement btnDress;

    @FindBy(xpath = "(//a[@title='Casual Dresses'])[2]")
    public WebElement btnCasualDresses;

    @FindBy(xpath = "(//a[@title='T-shirts'])[2]")
    public WebElement btntShirt;

    public void clickSignInButton() {
        btnSignin.click();
    }

    public void hoverAndClickCasualDresses() {
        hover(btnDress);
        btnCasualDresses.click();
    }

    public void clickOnTShirtsButton() {
        btntShirt.click();
    }

}
