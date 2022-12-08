package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void clickOnBankManagerLogin() {
        clickOnElement(bankManagerLogin);
    }
    By getOpenCustomerAccountTab= By.xpath("//button[@ng-click='openAccount()']");
    public void clickOnOpenAccountTab() {
        clickOnElement(getOpenCustomerAccountTab);
    }
    By customerNameLookUp= By.xpath("//select[@id='userSelect']");
    public void clickAndSelectCustomerName() {
        selectByVisibleTextFromDropDown(customerNameLookUp, "Harry Potter");
    }
    By currencyTypeLookUp= By.xpath("//select[@id='currency']");
    public void clickAndSelectCurrencyType() {
        selectByVisibleTextFromDropDown(currencyTypeLookUp, "Pound");
    }
    By processButtonTab= By.xpath("//button[contains(text(),'Process')]");
    public void clickOnProcessButtonTab() {
        clickOnElement(processButtonTab);
    }
    public String verifyTextFromPopUp(){
        return getTextFromAlert();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
