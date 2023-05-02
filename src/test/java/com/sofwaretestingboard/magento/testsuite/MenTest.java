package com.sofwaretestingboard.magento.testsuite;

import com.sofwaretestingboard.magento.pages.MenPage;
import com.sofwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    MenPage menPage = new MenPage();
    @Test
    //1.userShouldAddProductSuccessFullyToShoppinCart()
    public void userShouldAddProductSuccessFullyToShoppinCart()throws InterruptedException{

    // * Mouse Hover on Men Menu
        menPage.mouseHoverOnMenMenu();
    // * Mouse Hover on Bottoms
        menPage.mouseHoverOnBottoms();
        Thread.sleep(2000);
    // * Click on Pants
        menPage.clickOnPants();
    // * Mouse Hover on product name‘Cronus Yoga Pant’ and click on size32.
        menPage.mouseHoverOnCronusYogaPantAndClickOnSize32();
    // * Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.
        menPage.mouseHoverOnCronusYogaPantAndClickOnColourBlack();
    // * Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
        menPage.mouseHoverOnCronusYogaPantAndClickOnClickOnAddToCartButton();
    // * Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedCronusYogaPantAddedMessage ="You added Cronus Yoga Pant to your shopping cart.";
        String actualCronusYogaPantAddedMessage = menPage.getActualYouAddedCronusYogaPantToYourShoppingCartMessage();
        Assert.assertEquals(actualCronusYogaPantAddedMessage,expectedCronusYogaPantAddedMessage,"Not Match");
    // * Click on ‘shopping cart’ Link into message
        menPage.clickOnShoppingCartLink();
    // verify the text ‘Shopping Cart.’
        menPage.clickOnViewAndEditCart();
        String expectedShoppingCartText = "Shopping Cart";
        String actualShoppingCartText = menPage.getShoppingCartText();
        Assert.assertEquals(actualShoppingCartText,expectedShoppingCartText,"Not Match");
    // * Verify the product name ‘Cronus Yoga Pant’
        String expectedProductName ="Cronus Yoga Pant";
        String actualProductName = menPage.getActualProductName();
        Assert.assertEquals(actualProductName,expectedProductName,"Not Match");
    // * Verify the product size ‘32’
        String expectedProductSize="32";
        String actualProductSize = menPage.getActualProductSize();
        Assert.assertEquals(actualProductSize,expectedProductSize,"Not Match");
    // * Verify the product colour ‘Black’
        String expectedProductColour="Black";
        String actualProductColour = menPage.getActualProductColour();
        Assert.assertEquals(actualProductColour,expectedProductColour,"Not match");
    }
}
