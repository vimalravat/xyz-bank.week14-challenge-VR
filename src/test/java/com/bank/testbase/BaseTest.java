package com.bank.testbase;

import com.bank.propertyreader.PropertyReader;
import com.bank.utility.Utility;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    //  String browser = "chrome";

    @BeforeMethod
    public void setUP() {
        selectBrowser(browser);
    }
/*
    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }

 */
}
