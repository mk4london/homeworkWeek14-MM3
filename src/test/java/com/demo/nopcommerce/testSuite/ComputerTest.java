package com.demo.nopcommerce.testSuite;

import com.demo.nopcommerce.customListner.CustomListner;
import com.demo.nopcommerce.pages.Computer;
import com.demo.nopcommerce.testBase.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)
public class ComputerTest extends TestBase  {
    Computer homepage = new Computer();
    @Test(groups = {"sanity","regression",},priority = 3)
    public void clickoncomputer (){
       homepage.clickOnComputer();
    }

}
