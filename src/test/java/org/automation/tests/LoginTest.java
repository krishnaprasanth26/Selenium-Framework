package org.automation.tests;

import org.automation.driver.DriverManager;
import org.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


    @Test(description = "Check whether user is able to login to ORANGE crm using valid credentials")
    public void loginTestPositive() {

        LoginPage login = new LoginPage();
        login.loginToApplication("Admin","admin123");
        System.out.println("driver.getTitle() = " + DriverManager.getDriver().getTitle());
    }

    @Test(description = "Validate the title of the displayed page in Orange CRM")
    public void validateTitleOfPage() {

        LoginPage login = new LoginPage();
        login.loginToApplication("Admin","admin123");
        Assert.assertEquals(DriverManager.getDriver().getTitle(),"OrangeHRM1");

    }

}
