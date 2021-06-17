package com.demo.nopcommerce.testSuite;

import com.demo.nopcommerce.customListner.CustomListner;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.testBase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)
public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();
    By electronics = By.xpath("//div[@class='page-title']/h1");

    @Test(groups = {"smoke","sanity"},priority = 1)
    public void userIsOnHomePage(){
        homePage.nopCommerceHomePage();
    }


    @Test(groups = {"sanity", "regression",},priority = 2)
    public void verifyPageNavigation() throws InterruptedException {
        homePage.selecFromTopMenuTab("Electronics");
        Thread.sleep(500);
        homePage.verifyMessage(electronics, 5, "Electronics");
    }
}
