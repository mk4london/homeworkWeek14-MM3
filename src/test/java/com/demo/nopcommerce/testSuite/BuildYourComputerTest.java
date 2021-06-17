package com.demo.nopcommerce.testSuite;

import com.demo.nopcommerce.customListner.CustomListner;
import com.demo.nopcommerce.pages.BuildYourOnComputer;
import com.demo.nopcommerce.testBase.TestBase;
import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(CustomListner.class)
public class BuildYourComputerTest extends TestBase {
    BuildYourOnComputer buildYourComputer = new BuildYourOnComputer();
    By actuelMessage = By.xpath("//p[@class='content']");

    @Test (groups = {"sanity","regression",} ,priority = 5)
    public void buildYourOwnComputer() throws InterruptedException {
        buildYourComputer.buildYourOwnComputer();
        buildYourComputer.selectProcessor("1");
        // select ram option 2 GB please enter value 3
        // select ram option 2 GB please enter value 4
        // select ram option 2 GB please enter value 5
        buildYourComputer.selectRam("3");
        // select hdd = 320 GB
        // select hdd = 400 GB [+$100.00]
        buildYourComputer.selectHdd("400 GB [+$100.00]");
        // select Os = Vista Home [+$50.00]
        // select Os = Vista Premium [+$60.00]
        buildYourComputer.selectOs("Vista Premium [+$60.00]");
        // select the software = Microsoft Office [+$50.00]
        // select the software = Acrobat Reader [+$10.00]
        // select the software = Total Commander [+$5.00]
        buildYourComputer.selectSoftware("Microsoft Office [+$50.00]");
        buildYourComputer.addToCart();
        buildYourComputer.verifyMessage(actuelMessage, 10, "The product has been added to your shopping cart");

    }


}
