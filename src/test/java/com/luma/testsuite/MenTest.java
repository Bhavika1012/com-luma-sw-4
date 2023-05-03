package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.MensPage;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    MensPage mensPage = new MensPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homePage.hoverOnMensMenu();
        homePage.hoverOnBottoms();
        homePage.clickOnPants();

        // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
        mensPage.clickOnPantSize();

        // Click on pant colour
        mensPage.pantColour();
        //Add to cart
        mensPage.addToCart();
        Assert.assertEquals(mensPage.verifyItemAdded(), "You added Cronus Yoga Pant to your shopping cart.");
        mensPage.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.verifyTextShoppingCart(), "Shopping Cart");
        Assert.assertEquals(shoppingCartPage.verifyProductName(), "Cronus Yoga Pant");
        Assert.assertEquals(shoppingCartPage.verifyProductSize(), "32");
        Assert.assertEquals(shoppingCartPage.verifyProductColour(), "Black");
    }
}
