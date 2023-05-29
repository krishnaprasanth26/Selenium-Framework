package org.automation.pages;

import org.automation.driver.DriverManager;
import static org.automation.utils.SeleniumUtils.*;
import org.openqa.selenium.By;

public class AdminPage {


    private static final By USER_NAME = By.xpath(".//label[contains(text(),'Username')]/following::div[1]/input[@class='oxd-input oxd-input--active']");
    private static final By EMPLOYEE_NAME = By.xpath(".//label[contains(text(),'Employee Name')]/following::div[1]/div/div/input");

    public AdminPage setUserName(String userName){

        sendKeys(USER_NAME,userName,"User Name");
        return this;

    }

    public AdminPage setEmployeeName(String employeeName) throws InterruptedException {

        clickAndSendKeys(EMPLOYEE_NAME,employeeName,"Employee Name");
        return this;

    }


}
