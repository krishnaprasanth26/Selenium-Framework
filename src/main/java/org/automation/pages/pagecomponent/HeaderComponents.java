package org.automation.pages.pagecomponent;

import org.automation.driver.Driver;
import org.automation.driver.DriverManager;
import static org.automation.utils.SeleniumUtils.*;
import org.openqa.selenium.By;

public class HeaderComponents {


    public By BUTTON_ADMIN = By.xpath(".//a[@class='oxd-main-menu-item']/span[contains(.,'Admin')]/parent::a/parent::li");
    public By BUTTON_PIM = By.xpath(".//a[@class='oxd-main-menu-item']/span[contains(.,'PIM')]/parent::a/parent::li");
    public By BUTTON_LEAVE = By.xpath(".//a[@class='oxd-main-menu-item']/span[contains(.,'Leave')]/parent::a/parent::li");


    public void clickAdmin(){

        click(BUTTON_ADMIN,"Admin");
    }

    public void clickPIM(){

        click(BUTTON_PIM,"PIM Button");
    }

    public void clickLeave(){
        click(BUTTON_LEAVE,"Leave Button");
    }


}
