package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //Mouse Hover on Women Menu
    By womensMenuHover = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");
    //Mouse Hover on Tops
    By clickOnJackets = By.xpath("//a[@id='ui-id-9']");
    //Click on Jackets
    By clickOnTab = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    //Mouse Hover on Men Menu
    By hoverOnMensMenuTab = By.xpath("//a[@id='ui-id-5']");
    //Mouse Hover on Bottoms and click on pants
    By hoverOnBottomsTab = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    //Click on Pants
    By clickOnPants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    // Mouse Hover on Gear Menu
    By hoverOnGearMenu = By.xpath("//span[normalize-space()='Gear']");
    // Click on Bags
    By clickOnBags = By.xpath("//span[normalize-space()='Bags']");

    public void hoverOnWomensMenu() {
        mouseHoverToElement(womensMenuHover);
    }

    public void hoverOnTops() {
        mouseHoverToElement(clickOnJackets);
    }

    public void clickOnJackets() {
        mouseHoverToElementAndClick(clickOnTab);
    }

    public void hoverOnMensMenu() {
        mouseHoverToElement(hoverOnMensMenuTab);
    }

    public void hoverOnBottoms() {
        mouseHoverToElement(hoverOnBottomsTab);

    }

    public void clickOnPants() {
        mouseHoverToElementAndClick(clickOnPants);
    }

    public void gearMenu() {
        mouseHoverToElement(hoverOnGearMenu);
    }

    public void clickOnBags() throws InterruptedException {
        Thread.sleep(2000);

        clickOnElement(clickOnBags);
    }
    }


