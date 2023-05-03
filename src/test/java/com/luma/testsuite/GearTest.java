package com.luma.testsuite;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OvernightDufflePage;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();
    ShoppingCartPage shoppingcartPage = new ShoppingCartPage();
    OvernightDufflePage overnightDuffle = new OvernightDufflePage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homePage.gearMenu();
        homePage.clickOnBags();
// Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnBagProductName();
        // Change Qty 3
        overnightDuffle.setChangeBagQty();
        // Click on ‘Add to Cart’ Button.
        overnightDuffle.setAddToCartButton();

        // Verify the product name ‘Overnight Duffle’
        Assert.assertEquals(shoppingcartPage.verifyTheBagProductName(), "Overnight Duffle");
        //Verify the Qty is ‘3’
        Assert.assertEquals(shoppingcartPage.verifyTheProductQuantity(), "3");
        // Verify the product price ‘$135.00’
        Assert.assertEquals(shoppingcartPage.verifyTheProductPrice(), "$135.00");
        // Change Qty to ‘5’
        shoppingcartPage.changeShoppingCartQuantity();
        // Click on ‘Update Shopping Cart’ button
        shoppingcartPage.updateShoppingCartButton();
        // Verify the product price ‘$225.00’
        Assert.assertEquals(shoppingcartPage.verifyNewProductPrice(), "$225.00");

    }

}
