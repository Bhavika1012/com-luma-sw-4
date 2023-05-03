package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.WomensPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    HomePage homepage = new HomePage();
    WomensPage womensPage = new WomensPage();

    @Test
    public void verifyTheSortByProductNameFilter(){
        //Calling methods
        homepage.hoverOnWomensMenu();
        homepage.hoverOnTops();
        homepage.clickOnJackets();
        // Verify that the products name display in alphabetical order
        Assert.assertEquals(womensPage.productListAfterSorting(), womensPage.productListBeforeSorting());
        Assert.assertEquals(womensPage.sortByPriceAfter(),womensPage.sortByPriceBefore());
    }

    @Test
    public void verifyTheSortByPriceFilter(){
        //Calling methods
        homepage.hoverOnWomensMenu();
        homepage.hoverOnTops();
        homepage.clickOnJackets();

    }


}

