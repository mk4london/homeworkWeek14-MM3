package com.demo.nopcommerce.testSuite;

import com.demo.nopcommerce.customListner.CustomListner;
import com.demo.nopcommerce.pages.Desktop;
import com.demo.nopcommerce.testBase.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)
public class DeskTopTest extends TestBase {
    Desktop computer = new Desktop();

    @Test(groups = {"sanity", "regression",},priority = 4)
    public void userIsOnDesktopPage() throws InterruptedException {
        computer.clickOnDesktop();
        computer.verifyProductArrangeInAlphaBaticalOrder();
    }

}
