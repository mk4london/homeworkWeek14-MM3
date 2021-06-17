package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class Desktop extends Utility {
    By computer = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");

    By desktop = By.linkText("Desktops");
    By productArrange = By.xpath("//select[@id='products-orderby']");
    By descendingOrder = By.xpath("//h2[@class='product-tittle']");

    public void clickOnDesktop() throws InterruptedException {
        Reporter.log("clicking on Computer tab " + computer.toString() + "<br>");
        clickOnElement(computer);
        clickOnElement(desktop);

    }

    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        Reporter.log("Product is arrange by alphabetical order" + desktop + "<br>");
        Reporter.log("clicking on Computer tab " + computer.toString() + "<br>");
        clickOnElement(computer);
        mouseHoverToElement(desktop);
        mouseclickToElement(desktop,10);
        Thread.sleep(5000);
        selectByValueFromDropdown(productArrange, 50, "6");
        verifyDecendingorder(descendingOrder);


    }

}
