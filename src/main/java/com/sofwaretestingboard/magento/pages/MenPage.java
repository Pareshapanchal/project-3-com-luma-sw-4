package com.sofwaretestingboard.magento.pages;

import com.sofwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {

    By men    =By.xpath("//a[@id='ui-id-5']");
    By bottom =By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pants  =By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By cronusYogaPant =By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 =By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By colourBlack =By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By addToCart =By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By addedShoppingCartText =By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink =By.xpath("//a[@class='action showcart']");
    By shoppingCartText =By.xpath("//span[@class='base']");
    By productName =By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By productSize =By.xpath("//dd[contains(text(),'32')]");
    By productColour =By.xpath("//dd[contains(text(),'Black')]");
    By viewAndEditCart =By.xpath("//span[normalize-space()='View and Edit Cart']");


    public void mouseHoverOnMenMenu(){
        mouseHoverOnElement(men);
    }
    public void mouseHoverOnBottoms(){
        mouseHoverOnElement(bottom);
    }
    public void clickOnPants(){
        clickOnElement(pants);
    }
    public void mouseHoverOnCronusYogaPantAndClickOnSize32(){
        mouseHoverOnElement(cronusYogaPant);
        mouseHoverOnElementAndClick(size32);
    }
    public void mouseHoverOnCronusYogaPantAndClickOnColourBlack(){
        mouseHoverOnElement(cronusYogaPant);
        mouseHoverOnElementAndClick(colourBlack);
    }
    public void mouseHoverOnCronusYogaPantAndClickOnClickOnAddToCartButton(){
        mouseHoverOnElement(cronusYogaPant);
        mouseHoverOnElementAndClick(addToCart);
    }
    public String getActualYouAddedCronusYogaPantToYourShoppingCartMessage(){
        return getTextFromElement(addedShoppingCartText);
    }
    public void clickOnShoppingCartLink(){
        mouseHoverOnElementAndClick(shoppingCartLink);
    }
    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public String getActualProductName(){
        return getTextFromElement(productName);
    }
    public String getActualProductSize(){
        return getTextFromElement(productSize);
    }
    public String getActualProductColour(){
        return getTextFromElement(productColour);
    }
    public void clickOnViewAndEditCart(){
        mouseHoverOnElementAndClick(viewAndEditCart);
    }
}
