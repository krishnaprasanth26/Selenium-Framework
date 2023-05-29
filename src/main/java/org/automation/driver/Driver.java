package org.automation.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.automation.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public final class Driver {

    private Driver(){}

    public static void initDriver(){

        String browserName = ConfigFactory.getConfig().browser();
        WebDriver driver = DriverFactory.getDriver(browserName);
        DriverManager.setDriver(driver);

        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(), TimeUnit.SECONDS);
        DriverManager.getDriver().get(ConfigFactory.getConfig().url());

    }

    public static void quitDriver(){

        DriverManager.getDriver().quit();
    }

}
