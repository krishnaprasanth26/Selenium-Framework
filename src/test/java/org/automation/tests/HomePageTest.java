package org.automation.tests;

import org.automation.driver.DriverManager;
import org.automation.pages.HomePage;
import org.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test(description = "Check whether user is not able to login to the website")
    public void homePageTitle() throws InterruptedException {

        LoginPage login = new LoginPage();

        login.loginToApplication("Admin","admin123").
                clickOnAdmin().setUserName("Krishna").setEmployeeName("Jason");





    }


}
