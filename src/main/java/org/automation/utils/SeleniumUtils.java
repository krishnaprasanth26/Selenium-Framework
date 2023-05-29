package org.automation.utils;

import org.automation.config.ConfigFactory;
import org.automation.driver.DriverManager;
import org.automation.enums.WaitType;
import org.automation.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {


    public static void click(By by, String elementName) {
        waitForElementToBePresent(by);
        DriverManager.getDriver().findElement(by).click();
        ExtentLogger.pass(elementName+" is clicked successfully");
    }

    public static void click(By by, WaitType waitType,String elementName) {
        WebElement element = null;

        if(waitType == WaitType.PRESENCEOFELEMENT) {
            element = waitForElementToBePresent(by);
        } else if(waitType == WaitType.CLICKABLE) {
            element = waitForElementToBeClickable(by);
        } else{
            waitForElementToBePresent(by);
        }
        element.click();
        ExtentLogger.pass(elementName+" is clicked successfully");
    }



    public static void clickAndSendKeys(By by, String data, String elementName) {
        waitForElementToBeClickable(by);
        DriverManager.getDriver().findElement(by).click();
        waitForElementToBePresent(by);
        DriverManager.getDriver().findElement(by).sendKeys(data);
        ExtentLogger.pass(elementName+" is clicked and entered <"+data+">");
    }

    public static void sendKeys(By by, String text, String elementName){

        waitForElementToBePresent(by);
        DriverManager.getDriver().findElement(by).sendKeys(text);
        ExtentLogger.pass(elementName+" is entered successfully <"+text+">");
    }

    public static WebElement waitForElementToBePresent(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static WebElement waitForElementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }


}
