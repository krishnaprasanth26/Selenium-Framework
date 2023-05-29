package org.automation.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.automation.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public final class DriverFactory {

    private DriverFactory(){}

    public static WebDriver getDriver(String browserName) {


        WebDriver driver;

        if (browserName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();


        } else
        {
            System.out.println("Please enter any valid browser name. Chrome, Edge");
            return null;
        }
        return driver;

    }

}
