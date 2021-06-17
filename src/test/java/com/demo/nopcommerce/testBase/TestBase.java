package com.demo.nopcommerce.testBase;

import com.demo.nopcommerce.propertyReader.PropertyReader;
import com.demo.nopcommerce.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");


    public void closeBrowser(){
        if (driver != null){
            driver.quit();
        }
    }
    @BeforeMethod (groups = {"smoke","sanity","regression"})
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod (groups = {"smoke","sanity","regression"})
    public void tearDown(){
        closeBrowser();
    }
}
