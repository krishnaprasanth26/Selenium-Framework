package org.automation.pages.pagecomponent;

import org.automation.driver.DriverManager;
import static org.automation.utils.SeleniumUtils.*;
import org.openqa.selenium.By;

public class FooterComponents {

    private final By HYPERLINK_FOOTERTEXT = By.xpath(".//a[contains(text(),'OrangeHRM, Inc')]");

    public void clickFooterComponents() {

        click(HYPERLINK_FOOTERTEXT,"Footer link");
    }
}
