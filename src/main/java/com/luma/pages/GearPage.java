package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility{
        //Click on Product Name ‘Overnight Duffle’
        By bagProductName = By.xpath("//a[normalize-space()='Overnight Duffle']");


        // Click on Product Name ‘Overnight Duffle’
        public void clickOnBagProductName() throws InterruptedException {
            Thread.sleep(2000);
            clickOnElement(bagProductName);
        }


    }
