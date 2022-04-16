package pageObjectModelPackage;

import driverPackage.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilityPackage.BaseMethods;

public class POM02Signin extends BaseMethods {
    public POM02Signin() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    @FindBy(id = "email_create")
    public WebElement emailInputField;

    @FindBy(id = "SubmitCreate")
    public WebElement createAccountButton;

    @FindBy(id = "email")
    public WebElement emailLoginField;

    @FindBy(id = "passwd")
    public WebElement passwordLoginField;

    @FindBy(id = "SubmitLogin")
    public WebElement signInButton;

    public String signinPageTitle = "Login - My Store";

    public void createAccountWithEmail(String email) {
        sendText(emailInputField, email);
        createAccountButton.click();
    }

    public void loginAccount(String email, String password) {
        sendText(emailLoginField, email);
        sendText(passwordLoginField, password);
        signInButton.click();

    }
}
