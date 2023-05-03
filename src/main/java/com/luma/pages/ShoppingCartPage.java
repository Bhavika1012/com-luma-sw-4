package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    // Verify the text ‘Shopping Cart.'
    By verifyTextShoppingCart = By.xpath("//span[@class='base']");

    // Verify the product name ‘Cronus Yoga Pant’
    By verifyProductName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");

    // Verify the product size ‘32’
    By verifyProductSize = By.xpath("//dd[contains(text(),'32')]");

    // Verify the product colour ‘Black’
    By verifyProductColour = By.xpath("//dd[contains(text(),'Black')]");



    // Verify the product name ‘Overnight Duffle’
    By verifyProductNameDuffle = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    //Verify the Qty is ‘3’
    By verifyProductQuantity = By.xpath("//input[@title='Qty']");
    // Verify the product price ‘$135.00’
    By verifyProductPrice = By.xpath("(//span[@class='cart-price']//span)[2]");
    // Change Qty to ‘5’
    By changeQuantity = By.xpath("(//input[@class='input-text qty'])[1]");
    // Click on ‘Update Shopping Cart’ button
    By updateShoppingCartButton = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    // Verify the product price ‘$225.00’
    By newProductPrice = By.xpath("(//span[@class='cart-price']//span)[2]");




    public String verifyTextShoppingCart() {
        return getTextFromElement(verifyTextShoppingCart);
    }

    public String verifyProductName() {
        return getTextFromElement(verifyProductName);
    }
    public String verifyProductSize() {
        return getTextFromElement(verifyProductSize);
    }

    public String verifyProductColour() {
        return getTextFromElement(verifyProductColour);
    }



    // Verify the product name ‘Overnight Duffle’
    public String verifyTheBagProductName() {
        waitUntilVisibilityOfElementLocated(verifyProductNameDuffle, 20);
        return getTextFromElement(verifyProductNameDuffle);
    }
    //Verify the Qty is ‘3’
    public String verifyTheProductQuantity() throws InterruptedException {
        Thread.sleep(3000);

        return getAttributeValueFromElement(verifyProductQuantity);
    }
    // Verify the product price ‘$135.00’
    public String verifyTheProductPrice() {
        return getTextFromElement(verifyProductPrice);
    }
    // Change Qty to ‘5’
    public void changeShoppingCartQuantity(){
        sendTextToElement(changeQuantity, "5");
    }
    // Click on ‘Update Shopping Cart’ button
    public void updateShoppingCartButton(){
        clickOnElement(updateShoppingCartButton);
    }
    // Verify the product price ‘$225.00’
    public String verifyNewProductPrice() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(newProductPrice);
    }

}
