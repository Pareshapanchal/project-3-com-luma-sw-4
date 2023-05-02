package com.sofwaretestingboard.magento.testsuite;

import com.sofwaretestingboard.magento.pages.WomenPage;
import com.sofwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WomenTest extends BaseTest {
    WomenPage womenPage = new WomenPage();
    //1.verifyTheSortByProductNameFilter
    @Test
    public void verifyTheSortByProductNameFilter()throws InterruptedException {

        // Mouse Hover on Women Menu
        womenPage.mousehoverOnWomenMenu();
        // Mouse Hover on Tops
        womenPage.mouseHoverOnTops();
        // Click on Jackets
        womenPage.clickOnJackets();
        //  Select Sort By filter “Product Name”
        womenPage.sortProductsFromSortbyDropDown("Product Name");
        //  Verify the products name display in alphabetical order
        List<String> expectedProductList = womenPage.getExpectedProductsSorted();
        List<String> actualProductList = womenPage.getActualProductsSorted();
        boolean message = expectedProductList.equals(actualProductList);
        Assert.assertTrue(message);
}
@Test
    // 2. verifyTheSortByPriceFilter
    public void verifyTheSortByPriceFilter() {
    // * Mouse Hover on Women Men
    womenPage.mousehoverOnWomenMenu();
    // * Mouse Hover on Tops
    womenPage.mouseHoverOnTops();
    // * Click on Jackets
    womenPage.clickOnJackets();
    // * Select Sort By filter “Price”
    womenPage.sortProductsFromSortbyDropDown("Price");
    // * Verify the products price display in Low to High
    List<String> expectedProductList = womenPage.getExpectedProductsSorted();
    List<String> actualProductlist = womenPage.getActualProductsSorted();
    boolean message = expectedProductList.equals(actualProductlist);
    Assert.assertTrue(message);
   }
}
