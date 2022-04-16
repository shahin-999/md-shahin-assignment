package pageObjectModelPackage;

import driverPackage.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilityPackage.BaseMethods;

public class POM03CreateAccount extends BaseMethods {
    public POM03CreateAccount() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }
    @FindBy(id = "id_gender1")
    public WebElement mrTitle;

    @FindBy(id = "id_gender2")
    public WebElement mrsTitle;

    @FindBy(id = "customer_firstname")
    public WebElement firstName;

    @FindBy(id = "customer_lastname")
    public WebElement lastName;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "passwd")
    public WebElement passwordField;

    @FindBy(id = "days")
    public WebElement dayforDateOfBirth;

    @FindBy(id = "months")
    public WebElement monthforDateOfBirth;

    @FindBy(id = "years")
    public WebElement yearforDateOfBirth;

    @FindBy(id = "newsletter")
    public WebElement newsletter;

    @FindBy(id = "optin")
    public WebElement offer;

    @FindBy(id = "company")
    public WebElement companyNameField;

    @FindBy(id = "address1")
    public WebElement yourAddressOneField;

    @FindBy(id = "address2")
    public WebElement yourAddressTwoField;

    @FindBy(id = "city")
    public WebElement cityField;

    @FindBy(id = "id_state")
    public WebElement stateSelect;

    @FindBy(id = "postcode")
    public WebElement postCode;

    @FindBy(id = "id_country")
    public WebElement countrySelect;

    @FindBy(id = "other")
    public WebElement otherInformationField;

    @FindBy(id = "phone")
    public WebElement homePhoneField;

    @FindBy(id = "phone_mobile")
    public WebElement mobilePhoneField;

    @FindBy(id = "alias")
    public WebElement aliasField;

    @FindBy(id = "submitAccount")
    public WebElement registerButton;

    @FindBy(xpath = "//h3[normalize-space()='Your personal information']")
    public WebElement pageSubHeading;

    public String pageSubHeadingText = "YOUR PERSONAL INFORMATION";

    public void fillPersonalInformation(String firstname, String lastname, String password, String day, String month,
                                        String year) {
        mrTitle.click();
        sendText(firstName, firstname);
        sendText(lastName, lastname);
        sendText(passwordField, password);
        selectitem(dayforDateOfBirth, day);
        selectitem(monthforDateOfBirth, month);
        selectitem(yearforDateOfBirth, year);
        newsletter.click();
        offer.click();
    }

    public void fillYourAddress(String companyName, String addressone, String addresstwo, String city, String statename,
                                String zipCode, String countryname, String additionalAddress, String homephone, String mobilephone,
                                String aliasAddress) {
        sendText(companyNameField, companyName);
        sendText(yourAddressOneField, addressone);
        sendText(yourAddressTwoField, addresstwo);
        sendText(cityField, city);
        selectitem(stateSelect, statename);
        sendText(postCode, zipCode);
        selectitem(countrySelect, countryname);
        sendText(otherInformationField, additionalAddress);
        sendText(homePhoneField, homephone);
        sendText(mobilePhoneField, mobilephone);
        sendText(aliasField, aliasAddress);

    }

    public void clickRegisterButton() {
        registerButton.click();
    }
}
