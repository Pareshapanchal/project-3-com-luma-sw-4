package com.sofwaretestingboard.magento.pages;

import com.sofwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {
    By women =By.xpath(" //a[@id='ui-id-4']//span[contains(text(),'Women')]");
    By tops =By.xpath("//a[@id='ui-id-9']");
    By jackets =By.xpath("//a[@id ='ui-id-11']");
    By sortBy =By.xpath("(//select[@id='sorter'])[1]");
    By listOfProducts =By.xpath("//ol[@class='products list items product-items']");
    By price =By.xpath("(//select[@id='sorter'])[1]");

    public void mousehoverOnWomenMenu(){
        mouseHoverOnElement(women);
    }
    public void mouseHoverOnTops(){
        mouseHoverOnElement(tops);
    }
    public void clickOnJackets(){
        clickOnElement(jackets);
    }
    public List<String> getExpectedProductsSorted(){
        List<String> list = getTheListOfElementFromTheList(listOfProducts);
        Collections.sort(list);
        return list;
    }

    public List<String> getActualProductsSorted(){
        List<String> list = getTheListOfElementFromTheList(listOfProducts);
        return list;
    }
    public void sortProductsFromSortbyDropDown(String text){
        selectByVisibleTextFromDropDown(sortBy,text);
    }
}
