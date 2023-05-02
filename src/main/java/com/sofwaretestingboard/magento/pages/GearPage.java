package com.sofwaretestingboard.magento.pages;

import com.sofwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    By gear =By.xpath("//a[@id ='ui-id-6']");
    By bags =By.xpath("//a[@id='ui-id-25']");
    By overnightDuffle =By.xpath("//a[normalize-space()='Overnight Duffle']");
    By overnightDuffleText =By.xpath("//span[contains(text(),'Overnight Duffle')]");
    By quantity =By.xpath("//input[@id='qty']");
    By changeQty =By.id("cart-121034-qty");
    By addToCartButton =By.xpath("//button[@id='product-addtocart-button']");
    By overnightDuffleAddedText =By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartButton=By.xpath("//a[@class='action showcart']");
    By viewAndEditButton =By.xpath("//span[normalize-space()='View and Edit Cart']");
    By productOvernightDuffleText =By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By productQuantity =By.xpath("//input[@class='input-text qty']");
    By productPrice =By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By updateShoppingCart = By.xpath("//button[@class='action update']");
    By subTotalText =By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");
    public void mouseHoverOnGearMenu(){
        mouseHoverOnElement(gear);
    }
    public void clickOnBags(){    clickOnElement(bags);    }
    public void clickOnOvernightduffle(){
        clickOnElement(overnightDuffle);
    }
    public String getActualOvernightDuffleText(){
        return getTextFromElement(overnightDuffleText);
    }
    public void changeQuantity(String qty){
        clickOnElement(productQuantity);
        clearTheBox(productQuantity);
        sendTextToElement(productQuantity,qty);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }
    public String getOvernightDuffleAddedMessage(){
        return getTextFromElement(overnightDuffleAddedText);
    }
    public void clickOnShoppingCart(){
        mouseHoverOnElementAndClick(shoppingCartButton);
        clickOnElement(viewAndEditButton);
    }
    public String getProductNameOvernightDuffleText(){
        return getTextFromElement(productOvernightDuffleText);
    }
    public String getProductQuantity(){
        return driver.findElement(productQuantity).getAttribute("value");
    }
    public String getProductPrice(){
        return getTextFromElement(productPrice);
    }
    public void changeProductQuantity(String qty){
        clearTheBox(productQuantity);
        sendTextToElement(productQuantity,qty);
    }
    public void clickOnUpdateShoppingCartButton(){
        clickOnElement(updateShoppingCart);
    }
    public String getSubTotalText(){
        return getTextFromElement(subTotalText);
    }
}
