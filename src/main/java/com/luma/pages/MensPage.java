package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class MensPage extends Utility {
    //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32
    By hoverOnPantsSize = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");

    //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black
    By clickOnPantSize = By.xpath("(//div[@class='swatch-option text'])[1]");
    //Click on pant colour
    By pantColour = By.xpath("(//div[@class='swatch-option color'])[1]");

    //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
    By hoverOnProduct = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");

    By clickOnAddToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");

    //Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
    By verifyAddedToShoppingCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");

    //Click on ‘shopping cart’ Link into message
    By clickOnShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnPantSize() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(hoverOnPantsSize);
        mouseHoverToElementAndClick(clickOnPantSize);
    }

    public void pantColour() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(pantColour);
    }

    public void addToCart() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElement(hoverOnProduct);
        mouseHoverToElementAndClick(clickOnAddToCart);
    }

    public String verifyItemAdded() {
        return getTextFromElement(verifyAddedToShoppingCart);
    }

    public void clickOnShoppingCart() {
        mouseHoverToElementAndClick(clickOnShoppingCart);
    }

}
