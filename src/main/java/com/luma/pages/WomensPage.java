package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomensPage extends Utility {
    // Selecting Sort By filter to “Product Name”
    By filterProductName = By.xpath("(//select[@id='sorter'])[1]");
    // Storing jackets names in list
    By jacketsNameListBefore = By.xpath("//strong[@class='product name product-item-name']//a");
    // After Sorting value
    By jacketNameListAfter = By.xpath("//strong[@class='product name product-item-name']//a");

    // Storing jackets price in list
    By jacketPriceListBefore = By.xpath("//span[@class='price-wrapper ']//span");

    //  "Price" sorted
    By filterPrice = By.xpath("(//select[@id='sorter'])[1]");

    // After Sorting Products by Price
    By jacketPriceListAfter = By.xpath("//span[@class='price-wrapper ']//span");

    public List<String> productListBeforeSorting() {
        //Storing jacket names in list
        List<WebElement> jacketsElementsList = driver.findElements(jacketsNameListBefore);
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        //Sorting in ascending order
            jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);
            return jacketsNameListBefore;
        }

    public List<String> productListAfterSorting(){
        // Select Sort By filter “Product Name”
        selectByVisibleTextFromDropDown(filterProductName, "Product Name");
        waitUntilVisibilityOfElementLocated(By.xpath("(//select[@id='sorter'])[1]"), 20);
        // After Sorting value
        List<WebElement> jacketsElementsList = driver.findElements(jacketNameListAfter);
        List<String> jacketsNameListAfter = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListAfter.add(value.getText());
        }

        return jacketsNameListAfter;
    }

    public List<Double> sortByPriceBefore() {
        //Storing jackets price in list
        List<WebElement> jacketsPriceElementList = driver.findElements(jacketPriceListBefore);
        List<Double> jacketsPriceBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList){
            //Converting price in to Double and Removing $ from price
            jacketsPriceBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceBefore);
        return jacketsPriceBefore;
    }

    public List<Double> sortByPriceAfter(){
        //Selecting sort by price
        selectByVisibleTextFromDropDown(filterPrice,"Price");
        //After sorting by price
        List<WebElement> jacketsPriceElementsList = driver.findElements(jacketPriceListAfter);
        List <Double> jacketsPriceAfter = new ArrayList<>();
        for (WebElement value : jacketsPriceElementsList){
            //Converting price in to Double and Removing $ from price
            jacketsPriceAfter.add(Double.valueOf(value.getText().replace("$","")));
        }
        return jacketsPriceAfter;
    }

}
