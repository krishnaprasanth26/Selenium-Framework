package org.automation.pages;

import org.automation.driver.DriverManager;
import  static org.automation.utils.SeleniumUtils.*;
import org.openqa.selenium.By;

public class LoginPage {

    private static final By TXTBOX_USERNAME = By.xpath(".//input[@name='username']");
    private static final By TXTBOX_PASSWORD = By.xpath(".//input[@name='password']");
    private static final By BUTTON_LOGIN = By.xpath(".//button[@type='submit']");
    private static final By HYPERLINK_FORGOTPASSWORD = By.xpath(".//p[contains(.,'Forgot your password?')]");


    private LoginPage setUserName(String userName) {
        sendKeys(TXTBOX_USERNAME,userName,"Username");
        return this;
    }
    private LoginPage setPassword(String password) {
        sendKeys(TXTBOX_PASSWORD,password,"Password");
        return this;
    }
    private HomePage clickLoginButton() {
        click(BUTTON_LOGIN,"Login Button");
        return new HomePage();
    }
    private void clickForgotPasswordButton() {
        click(HYPERLINK_FORGOTPASSWORD,"Forgot Password");
    }

    public HomePage loginToApplication(String userName,String password) {
         return setUserName(userName).setPassword(password).clickLoginButton();

    }

}
