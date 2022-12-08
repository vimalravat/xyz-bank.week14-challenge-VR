package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTestPage extends BaseTest {
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AccountPage accountPage = new AccountPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    CustomersPage customersPage = new CustomersPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    HomePage homePage = new HomePage();
    OpenAccountPage openAccountPage = new OpenAccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        // click On "Bank Manager Login" Tab
        bankManagerLoginPage.clickOnBankManagerLogin();
        //	click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomerTab();
        //	enter FirstName
        bankManagerLoginPage.enterFirstName("Harry");
        //	enter LastName
        bankManagerLoginPage.enterLastName("Potter");
        //	enter PostCode
        bankManagerLoginPage.enterPostCode("123456");
        //	click On "Add Customer" Button
        bankManagerLoginPage.clickOnAddCustomerSubmitTab();
        //	popup display verify message "Customer added successfully"
        String expectedText = "Customer added successfully with customer id :6";
        String actualText = bankManagerLoginPage.verifyTextFromPopUp();
        Assert.assertEquals(actualText, expectedText, "No such message found");
        //	click on "ok" button on popup.
        bankManagerLoginPage.acceptAlert();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        //click On "Bank Manager Login" Tab
        openAccountPage.clickOnBankManagerLogin();
        //	click On "Open Account" Tab
        openAccountPage.clickOnOpenAccountTab();
        //	Search customer that created in first test
        openAccountPage.clickAndSelectCustomerName();
        //	Select currency "Pound"
        openAccountPage.clickAndSelectCurrencyType();
        //	click on "process" button
        openAccountPage.clickOnProcessButtonTab();
        //	popup displayed
        //	verify message "Account created successfully"
        String expectedText = "Account created successfully with account Number :1016";
        String actualText = openAccountPage.verifyTextFromPopUp();
        Assert.assertEquals(actualText, expectedText, "No such message found");
        //	click on "ok" button on popup.
        openAccountPage.acceptAlert();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
        //click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLogin();
        //	search customer that you created.
        customerLoginPage.clickAndSelectCustomerName();
        //	click on "Login" Button
        customerLoginPage.clickOnCustomerLoginTab();
        //	verify "Logout" Tab displayed.
       // customerLoginPage.isLogoutButtonPresence();
        //	click on "Logout"
        customerLoginPage.clickOnCustomerLogoutTab();
        //	verify "Your Name" text displayed.
        String expectedText = "Your Name :";
        String actualText = customerLoginPage.verifyCustomerNameIsDisplayed();
        Assert.assertEquals(actualText, expectedText, "No such message found");
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        //click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLogin();
        //	search customer that you created.
        customerLoginPage.clickAndSelectCustomerName();
        //	click on "Login" Button
        customerLoginPage.clickOnCustomerLoginTab();
        //	click on "Deposit" Tab
        accountPage.clickOnDepositTab();
        //	Enter amount 100
        accountPage.enterAmount("100");
        //	click on "Deposit" Button
        accountPage.clickOnSubmitDepositTab();
        //	verify message "Deposit Successful"
        String expectedText = "Deposit Successful";
        String actualText = accountPage.verifyDepositSuccessfullyTextMessage();
        Assert.assertEquals(actualText, expectedText, "No such message found");


    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        //click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLogin();
        //	search customer that you created.
        customerLoginPage.clickAndSelectCustomerName();
        //	click on "Login" Button
        customerLoginPage.clickOnCustomerLoginTab();
        //	click on "Deposit" Tab
        accountPage.clickOnDepositTab();
        //	Enter amount 100
        accountPage.enterAmount("100");
        //	click on "Deposit" Tab
        accountPage.clickOnDepositTab();
        //	click on "Withdrawal" Tab
        accountPage.clickOnWithdrawalTab();
        //	Enter amount 50
        accountPage.enterWithdrawalAmount("50");
        //	click on "Withdraw" Button
        accountPage.clickOnWithdrawTransactionTab();
        //	verify message "Transaction Successful"
        String expectedText = "Transaction successful";
        String actualText = accountPage.verifyWithdrawalSuccessfullyTextMessage();
        Assert.assertEquals(actualText, expectedText, "No such message found");


    }

}
