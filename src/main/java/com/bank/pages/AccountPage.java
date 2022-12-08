package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
  By depositTab=  By.xpath("//button[@ng-click='deposit()']");
    public void clickOnDepositTab() {
        clickOnElement(depositTab);
    }
    By amountTab= By.xpath("//input[@placeholder='amount']");
    public void enterAmount(String amount){
        sendTextToElement(amountTab, amount);
    }

    By submitDepositTab= By.xpath("//button[@type='submit']");
    public void clickOnSubmitDepositTab() {
        clickOnElement(submitDepositTab);
    }
    By depositSuccessfullyText= By.xpath("//span[contains(text(),'Deposit Successful')]");
    public String verifyDepositSuccessfullyTextMessage(){
        return getTextFromElement(depositSuccessfullyText);
    }

    By withdrawalTab=  By.xpath("//button[@ng-click='withdrawl()']");
    public void clickOnWithdrawalTab() {
        clickOnElement(withdrawalTab);
    }
    By withdrawalAmountTab= By.xpath("//input[@placeholder='amount']");
    public void enterWithdrawalAmount(String amount){
        sendTextToElement(withdrawalAmountTab, amount);
    }
    By withdrawTab= By.xpath("//button[@class='btn btn-default']");
    public void clickOnWithdrawTransactionTab() {
        clickOnElement(withdrawTab);
    }
    By withdrawalSuccessfullyText= By.xpath("//span[contains(text(),'Deposit Successful')]");
    public String verifyWithdrawalSuccessfullyTextMessage(){
        return getTextFromElement(withdrawalSuccessfullyText);
    }
}
