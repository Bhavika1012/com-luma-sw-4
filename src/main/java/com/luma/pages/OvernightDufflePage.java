package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class OvernightDufflePage extends Utility {
    //Change Qty 3
    By changeBagQty = By.xpath("//input[@id='qty']");
    //Click on ‘Add to Cart’ Button.
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    //Click on ‘shopping cart’ Link into message
    By clickShoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");

    // Change Qty 3
    public void setChangeBagQty() {
        sendTextToElement(changeBagQty, "3");
    }

    // Click on ‘Add to Cart’ Button.
    public void setAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    // Click on ‘shopping cart’ Link into message
    public void setClickShoppingCartLink() {
        waitUntilVisibilityOfElementLocated(clickShoppingCartLink, 20);
        clickOnElement(clickShoppingCartLink);
    }

}

