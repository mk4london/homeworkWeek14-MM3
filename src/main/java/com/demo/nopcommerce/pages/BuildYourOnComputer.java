package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Reporter;

public class BuildYourOnComputer extends Utility {


    By computer = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By desktop = By.xpath("//ul[@class='sublist first-level']/li[1]");
    By buildComputer = By.xpath("//div[@class='buttons']");
    By selectProcessor = By.xpath("//select[@name='product_attribute_1']");
    By selectRam = By.id("product_attribute_2");
    By selectHdd = By.xpath("//label[contains(text(),'320 GB')]");
    By selectHdd400GB = By.cssSelector("#product_attribute_3_7");
    By selectHdd320GB = By.cssSelector("#product_attribute_3_7");
    By operating = By.xpath("//input[@id='product_attribute_4_9']");
    By vistaHome = By.cssSelector("#product_attribute_4_8");
    By vistaPremium = By.cssSelector("#product_attribute_4_9");
    By microsoftOffice = By.cssSelector("#product_attribute_5_10");
    By acorobatReader = By.cssSelector("#product_attribute_5_11");
    By commander = By.cssSelector("#product_attribute_5_12");
    By addToCartButtton = By.cssSelector("#add-to-cart-button-1");



    public boolean buildYourOwnComputer() throws InterruptedException {
        Reporter.log("Build Your Computer ");
        mouseHoverToElement(computer, 10);
        mouseclickToElement(desktop, 30);
        selectByValueFromDropdown(By.xpath("//select[@id='products-orderby']"), 10, "5");
        Thread.sleep(3000);
        mouseHoverToElement(buildComputer, 10);
        mouseclickToElement(buildComputer, 10);
        try {
            mouseclickToElement(buildComputer, 10);
        } catch (StaleElementReferenceException e) {
            mouseclickToElement(buildComputer, 10);

        }

        return false;
    }

    public void selectProcessor(String value) throws InterruptedException {
        Reporter.log("SelectProcessor " + selectProcessor + "<br>");
        selectByValueFromDropdown(selectProcessor, 10, value);
    }

    public void selectRam(String value) throws InterruptedException {
        Reporter.log("Select Ram " + selectRam + "<br>");
        selectByValueFromDropdown(selectRam, 10, value);
    }


    public void selectHdd(String size) throws InterruptedException {
        Reporter.log("Select Hard Disk " + selectHdd + "<br>");
        String hdd = getTextFromElement(selectHdd, 5);
        String hddsize = size;
        hddsize.equalsIgnoreCase(size);
        if (hdd.equals(hddsize)) {
            Thread.sleep(500);
            clickOnElement(selectHdd320GB, 5);
        } else {
            Thread.sleep(5000);
            clickOnElement(selectHdd400GB, 5);
        }


    }

    public void selectOs(String operatingSystem) throws InterruptedException {
        Reporter.log("Select Operating System " + operating + "<br>");
        Thread.sleep(5000);
        //    String os = getTextFromElement(By.cssSelector("#product_attribute_4_8"), 50);
        String os = getTextFromElement(operating, 50);
        String operating = operatingSystem;
        operating.equalsIgnoreCase(operatingSystem);
        if (os.equals(operating)) {
            Thread.sleep(500);
            clickOnElement(vistaHome, 5);
        } else {
            Thread.sleep(5000);
            clickOnElement(vistaPremium, 5);
        }

    }

    public void selectSoftware(String software) throws InterruptedException {
        Reporter.log("SelectProcessor " + selectProcessor + "<br>");

        String office = getTextFromElement(microsoftOffice, 10);
        String acrobat = getTextFromElement(acorobatReader, 10);
        String totalcommander = getTextFromElement(commander, 10);
        String soft = software;
        soft.equalsIgnoreCase(software);
        if (soft.equals(office)) {

            clickOnElement(microsoftOffice, 10);
            clickOnElement(microsoftOffice, 10);

        } else if (soft.equals(acrobat)) {
            clickOnElement(microsoftOffice, 10);
            clickOnElement(acorobatReader, 10);

        } else if (soft.equals(totalcommander)) {
            clickOnElement(microsoftOffice, 10);
            clickOnElement(commander, 5);

        }


    }

    public void addToCart() {
        Reporter.log("Click on Add to cart  " + addToCartButtton + "<br>");

        mouseHoverToElement(addToCartButtton, 10);
        mouseclickToElement(addToCartButtton, 10);

    }

}
