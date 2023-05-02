package com.sofwaretestingboard.magento.testsuite;

import com.sofwaretestingboard.magento.pages.GearPage;
import com.sofwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    GearPage gearPage = new GearPage();
    @Test
    //1.userShouldAddProductSuccessFullyToShoppinCart()
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException{
        // * Mouse Hover on Gear Menu
        gearPage.mouseHoverOnGearMenu();
        // * Click on Bags
        gearPage.clickOnBags();
        // * Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnOvernightduffle();
        // * Verify the text ‘Overnight Duffle’
        String expectedOvernightDuffleText ="Overnight Duffle";
        String actualMessage  = gearPage.getActualOvernightDuffleText();
        Assert.assertEquals(actualMessage,expectedOvernightDuffleText,"not match");
        // * Change Qty 3
        gearPage.changeQuantity("3");
        // * Click on ‘Add to Cart’ Button.
        gearPage.clickOnAddToCartButton();
        // * Verify the text‘You added Overnight Duffle to your shopping cart.’
        String expectedProductAddedMessage ="You added Overnight Duffle to your shopping cart.";
        String actualProductAddedMessage = gearPage.getOvernightDuffleAddedMessage();
        Assert.assertEquals(actualProductAddedMessage,expectedProductAddedMessage,"not match");
        // * Click on ‘shopping cart’ Link into message
        gearPage.clickOnShoppingCart();
        // * Verify the product name ‘Cronus Yoga Pant’
        Thread.sleep(2000);
        String expectedProductName ="Overnight Duffle";
        String actualProductName = gearPage.getProductNameOvernightDuffleText();
        Assert.assertEquals(actualProductName,expectedProductName,"not match");
        // Verify the Qty is ‘3’
        String expectedQty ="3";

        String actualQty =gearPage.getProductQuantity();
        Assert.assertEquals(actualQty,expectedQty,"not match");
        Thread.sleep(2000);
        // * Verify the product price ‘$135.00’
        String expectedProductPrice = "$135.00";
        String actualProductPrice = gearPage.getProductPrice();
        Assert.assertEquals(actualProductPrice,expectedProductPrice,"not match");
        // * Change Qty to ‘5’
        gearPage.changeProductQuantity("5");
        // * Click on ‘Update Shopping Cart’ button
        gearPage.clickOnUpdateShoppingCartButton();
        // * Verify the product price ‘$225.00’
        String expectedTotal ="$225.00";
        String actualTotal = gearPage.getSubTotalText();
        Assert.assertEquals(actualTotal,expectedTotal,"Not match");
    }

}
