package org.automation.pages;

import org.automation.driver.DriverManager;
import org.automation.pages.pagecomponent.FooterComponents;
import org.automation.pages.pagecomponent.HeaderComponents;
import static org.automation.utils.SeleniumUtils.*;
import org.openqa.selenium.WebDriver;

public class HomePage {


    private HeaderComponents headerComponents;
    private FooterComponents footerComponents;

    public HomePage(){
        headerComponents = new HeaderComponents();
        footerComponents = new FooterComponents();
    }


    public String getHomePageTitle(){
        String titlePage = DriverManager.getDriver().getTitle();
        return titlePage;
    }

    public AdminPage clickOnAdmin(){

        click(headerComponents.BUTTON_ADMIN,"Admin Button") ;
        return new AdminPage();

    }

    public void clickOnFooterText(){

        footerComponents.clickFooterComponents();
    }

}
