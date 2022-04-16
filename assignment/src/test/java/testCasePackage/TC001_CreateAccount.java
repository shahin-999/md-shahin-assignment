package testCasePackage;

import driverPackage.BaseDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjectModelPackage.POM01HomePage;
import pageObjectModelPackage.POM02Signin;
import pageObjectModelPackage.POM03CreateAccount;
import pageObjectModelPackage.POM04SignOut;

public class TC001_CreateAccount extends BaseDriver {
// register for 1st user
    @Test(priority = 0)
    public void registration1(){
        String email = "shahinshanaous13459@gmail.com";
        String firstname = "Md Shahin";
        String lastname = "Shanaous";
        String password = "shahin@1234";
        String day = "15";
        String month = "10";
        String year = "1999";
        String companyName = "BUBT";
        String addressone = "Mirpur-1, Dhaka";
        String Addresstwo = "Chuadanga Sadar, Chuadanga";
        String city = "Dhaka";
        String statename = "8";
        String zipCode = "12001";
        String countryname = "21";
        String additionalAddress = "Take left from Sony hall Mirpur-1";
        String homephone = "01934662488";
        String mobilephone = "01334662488";
        String aliasAddress = "My address";


        POM01HomePage homepage = new POM01HomePage();
        POM02Signin signInpage = new POM02Signin();
        POM03CreateAccount register = new POM03CreateAccount();
        POM04SignOut myAccountpage = new POM04SignOut();
        SoftAssert softAssert = new SoftAssert();

        // goto the signin page by clicking signin button
        homepage.clickSignInButton();

        // wait for the signin page loading
        signInpage.waitForPageLoad();

        softAssert.assertEquals(signInpage.getTitle(), signInpage.signinPageTitle);

        // give email to the email text field
        signInpage.createAccountWithEmail(email);

        // wait for the page load
        register.waitForPageLoad();

        softAssert.assertEquals(register.pageSubHeading.getText(), register.pageSubHeadingText);

        // give all the personal info
        register.fillPersonalInformation(firstname, lastname, password, day, month, year);

        // give the address
        register.fillYourAddress(companyName, addressone, Addresstwo, city, statename, zipCode, countryname, additionalAddress, homephone, mobilephone, aliasAddress);

        // click on Registration button
        register.clickRegisterButton();

        // Waiting for Completely load My Account page
        myAccountpage.waitForPageLoad();

        String fullName = firstname + " " +lastname;
        softAssert.assertEquals(myAccountpage.userName.getText(), fullName);

        // click on signout button
        myAccountpage.clickSignOutButton();

        softAssert.assertAll();
    }

// register for 2nd user
    @Test(priority = 1)
    public void registration2(){
        String email = "abdulkarim13452@gmail.com";
        String firstname = "Md Abdul";
        String lastname = "Karim";
        String password = "shahin@1234";
        String day = "19";
        String month = "11";
        String year = "1991";
        String companyName = "BS23";
        String addressone = "Rampura, Dhaka";
        String Addresstwo = "Khulna Sadar, Khulna";
        String city = "Dhaka";
        String statename = "8";
        String zipCode = "12001";
        String countryname = "21";
        String additionalAddress = "Take left from Sony hall Mirpur-1";
        String homephone = "01934662488";
        String mobilephone = "01334662488";
        String aliasAddress = "My address";


        POM01HomePage homepage = new POM01HomePage();
        POM02Signin signInpage = new POM02Signin();
        POM03CreateAccount register = new POM03CreateAccount();
        POM04SignOut myAccountpage = new POM04SignOut();
        SoftAssert softAssert = new SoftAssert();

        // goto the signin page by clicking signin button
        homepage.clickSignInButton();

        // wait for the signin page loading
        signInpage.waitForPageLoad();

        softAssert.assertEquals(signInpage.getTitle(), signInpage.signinPageTitle);

        // give email to the email text field
        signInpage.createAccountWithEmail(email);

        // wait for the page load
        register.waitForPageLoad();

        softAssert.assertEquals(register.pageSubHeading.getText(), register.pageSubHeadingText);

        // give all the personal info
        register.fillPersonalInformation(firstname, lastname, password, day, month, year);

        // give the address
        register.fillYourAddress(companyName, addressone, Addresstwo, city, statename, zipCode, countryname, additionalAddress, homephone, mobilephone, aliasAddress);

        // click on Registration button
        register.clickRegisterButton();

        // Waiting for Completely load My Account page
        myAccountpage.waitForPageLoad();

        String fullName = firstname + " " +lastname;
        softAssert.assertEquals(myAccountpage.userName.getText(), fullName);

        // click on signout button
        myAccountpage.clickSignOutButton();

        softAssert.assertAll();
    }

}
