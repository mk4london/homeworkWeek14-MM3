package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class Computer extends Utility {

    By computer = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    //By desktop = By.xpath("//ul[@class='sublist first-level']/li[1]");
    By desktop = By.linkText("Desktops");

    public void clickOnComputer() {
        Reporter.log("clicking on Computer tab " + computer.toString() + "<br>");
        clickOnElement(computer);
        clickOnElement(desktop);

    }


}
