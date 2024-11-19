package com.sidgupta.bdd;

import com.sidgupta.pages.greenkart.CheckoutPage;
import com.sidgupta.pages.greenkart.LandingPage;
import com.sidgupta.util.Config;
import com.sidgupta.util.Constants;
import com.sidgupta.util.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CheckoutPageSteps {

    private TestContextSetup testContextSetup;
    private CheckoutPage checkoutPage;

    public CheckoutPageSteps(TestContextSetup testContextSetup) {

        this.testContextSetup = testContextSetup;
        checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
    }

    @Then("^user can successfully see the (.+) in the checked out items$")
    public void userSearchesSameProduct(String productName) {

        Assert.assertTrue(checkoutPage.isAT());
        Assert.assertEquals(checkoutPage.getProductName(), testContextSetup.landingPageProductName);

    }

    @Then("^user can apply (.+)$")
    public void userCanApplyPromocode(String promocode) {
        checkoutPage.applyPromoCode(promocode);
    }

    @Then("user can place order")
    public void userCanPlaceOrder() {
        checkoutPage.placeOrder();
    }
}
