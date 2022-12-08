package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void clickOnBankManagerLogin() {
        clickOnElement(bankManagerLogin);
    }


    By addCustomer = By.xpath("//button[contains(text(),'Add Customer')]");
    public void clickOnAddCustomerTab() {
        clickOnElement(addCustomer);
    }


    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }
    By postCodeField= By.xpath("//input[@placeholder='Post Code']");
    public void enterPostCode(String postCode) {
        sendTextToElement(postCodeField, postCode);
    }
    By addCustomerSubmitTab = By.xpath("//button[@type='submit']");
    public void clickOnAddCustomerSubmitTab() {
        clickOnElement(addCustomerSubmitTab);
    }
    public String verifyTextFromPopUp(){
        return getTextFromAlert();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

}
