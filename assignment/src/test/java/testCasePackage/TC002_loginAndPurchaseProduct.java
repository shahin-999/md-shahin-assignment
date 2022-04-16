package testCasePackage;

import driverPackage.BaseDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjectModelPackage.*;

public class TC002_loginAndPurchaseProduct extends BaseDriver {

// Purchase for 1st user
    @Test(priority = 0)
    public void loginAndPurchase1() {

        String email = "shahinshanaous123@gmail.com";
        String password="shahin@1234";
        String comment="Hello I'm Shahin";

        POM01HomePage homepage = new POM01HomePage();
        POM02Signin signInpage = new POM02Signin();
        POM04SignOut myAccountpage = new POM04SignOut();
        POM05CasualDress casualDressespage = new POM05CasualDress();
        POM06TShirt t_Shirtspage = new POM06TShirt();
        POM07Cart cartpage = new POM07Cart();
        POM08CheckOut checkoutpage = new POM08CheckOut();
        SoftAssert softAssert = new SoftAssert();

        // goto sign in page
        homepage.clickSignInButton();

        // wait for signin page loading
        signInpage.waitForPageLoad();

        softAssert.assertEquals(signInpage.getTitle(), signInpage.signinPageTitle);

        // give email and pass for login
        signInpage.loginAccount(email, password);

        // select casual dress
        homepage.hoverAndClickCasualDresses();

        // wait for the page loading
        casualDressespage.waitForPageLoad();

        softAssert.assertEquals(casualDressespage.getTitle(), casualDressespage.casualDressesPageTitle);

        // scroll to product and add product to cart
        casualDressespage.productAddToCart();

        // click on continue shopping
        cartpage.clickContinueShopping();

        // click on tShirts from menu bar
        homepage.clickOnTShirtsButton();

        // wait for load tshirt page
        t_Shirtspage.waitForPageLoad();

        softAssert.assertEquals(t_Shirtspage.getTitle(), t_Shirtspage.t_ShirtsPageTitle);

        // filter blue color dress
        t_Shirtspage.filterBlueColor();

        // add product to cart
        t_Shirtspage.productAddToCart();

        // click checkout option
        cartpage.clickProceedToCheckout();

        // waiting for page loading
        checkoutpage.waitForPageLoad();

        softAssert.assertEquals(checkoutpage.getTitle(), checkoutpage.checkoutpageTitle);

        // click order/checkout summary page button
        checkoutpage.clickSummaryProceedToCheckout();

        //add comment before purchase product
        checkoutpage.addCommentAndProceedToCheckout(comment);

        // click to agree and purchase button
        checkoutpage.checkToSandProceedToCheckout();

        // Scroll and select Pay By Check option
        checkoutpage.clickPaybyCheque();

        // scroll and click on "I confirm my order" button for complete checkout process
        checkoutpage.clickConfirmOrder();

        myAccountpage.clickSignOutButton();

        softAssert.assertAll();
    }

// Purchase for 2nd user
    @Test(priority = 1)
    public void loginAndPurchase2() {

        String email = "abdulkarim123@gmail.com";
        String password="shahin@1234";
        String comment="Hello I'm Abdul karim";

        POM01HomePage homepage = new POM01HomePage();
        POM02Signin signInpage = new POM02Signin();
        POM04SignOut myAccountpage = new POM04SignOut();
        POM05CasualDress casualDressespage = new POM05CasualDress();
        POM06TShirt t_Shirtspage = new POM06TShirt();
        POM07Cart cartpage = new POM07Cart();
        POM08CheckOut checkoutpage = new POM08CheckOut();
        SoftAssert softAssert = new SoftAssert();

        // goto sign in page
        homepage.clickSignInButton();

        // wait for signin page loading
        signInpage.waitForPageLoad();

        softAssert.assertEquals(signInpage.getTitle(), signInpage.signinPageTitle);

        // give email and pass for login
        signInpage.loginAccount(email, password);

        // select casual dress
        homepage.hoverAndClickCasualDresses();

        // wait for the page loading
        casualDressespage.waitForPageLoad();

        softAssert.assertEquals(casualDressespage.getTitle(), casualDressespage.casualDressesPageTitle);

        // scroll to product and add product to cart
        casualDressespage.productAddToCart();

        // click on continue shopping
        cartpage.clickContinueShopping();

        // click on tShirts from menu bar
        homepage.clickOnTShirtsButton();

        // wait for load tshirt page
        t_Shirtspage.waitForPageLoad();

        softAssert.assertEquals(t_Shirtspage.getTitle(), t_Shirtspage.t_ShirtsPageTitle);

        // filter blue color dress
        t_Shirtspage.filterBlueColor();

        // add product to cart
        t_Shirtspage.productAddToCart();

        // click checkout option
        cartpage.clickProceedToCheckout();

        // waiting for page loading
        checkoutpage.waitForPageLoad();

        softAssert.assertEquals(checkoutpage.getTitle(), checkoutpage.checkoutpageTitle);

        // click order/checkout summary page button
        checkoutpage.clickSummaryProceedToCheckout();

        //add comment before purchase product
        checkoutpage.addCommentAndProceedToCheckout(comment);

        // click to agree and purchase button
        checkoutpage.checkToSandProceedToCheckout();

        // Scroll and select Pay By Check option
        checkoutpage.clickPaybyCheque();

        // scroll and click on "I confirm my order" button for complete checkout process
        checkoutpage.clickConfirmOrder();

        myAccountpage.clickSignOutButton();

        softAssert.assertAll();
    }
}
