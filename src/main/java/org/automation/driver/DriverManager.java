package org.automation.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {


    public static final ThreadLocal<WebDriver> driverThreadLocalLocal = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driverThreadLocalLocal.get();
    }

    public static  void setDriver(WebDriver driver) {
        driverThreadLocalLocal.set(driver);
    }




}
