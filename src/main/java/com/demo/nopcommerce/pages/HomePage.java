package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    By welcome = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By topmenu = By.xpath("//ul[@class='top-menu notmobile']/child::li");

    public void nopCommerceHomePage(){
        Reporter.log("Welcome to our store"+welcome+"<br>");
        verifyMessage(welcome,10,"Welcome to our store");
    }


    public void selecFromTopMenuTab(String menu) throws InterruptedException {

        List<WebElement> elementList2 = driver.findElements(topmenu);
        Thread.sleep(5000);
        for (WebElement element : elementList2) {
            if (element.getText().equalsIgnoreCase(menu)) {
                element.click();
                break;
            }
        }
        Reporter.log("clicking on top menu tab " + topmenu.toString() + "<br>");

    }


}
