package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    //click on "Customer Login" Tab
    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");
    public void clickOnCustomerLogin() {
        clickOnElement(customerLogin);
    }

    //	search customer that you created.
    By customerNameLookUp= By.xpath("//select[@id='userSelect']");
    public void clickAndSelectCustomerName() {
        selectByVisibleTextFromDropDown(customerNameLookUp, "Harry Potter");
    }

    //	click on "Login" Button
    By customerLoginTab= By.xpath("//button[contains(text(),'Login')]");
    public void clickOnCustomerLoginTab() {
        clickOnElement(customerLoginTab);
    }

    //	verify "Logout" Tab displayed.
    By customerLogoutTab= By.xpath("//button[contains(text(),'Logout')]");

//  boolean logoutButtonPresence=driver.findElement(customerLogoutTab).isDisplayed();

  //  public boolean isLogoutButtonPresence() {
   //     return logoutButtonPresence;
 //   }
    //	click on "Logout"
    public void clickOnCustomerLogoutTab() {
        clickOnElement(customerLogoutTab);
    }


    //	verify "Your Name" text displayed.
    By customerNameOnPage= By.xpath("//label[contains(text(),'Your Name :')]");
    public String verifyCustomerNameIsDisplayed(){
         return getTextFromElement(customerNameOnPage);
           }


}
