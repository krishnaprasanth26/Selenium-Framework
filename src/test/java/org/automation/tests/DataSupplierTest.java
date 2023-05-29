package org.automation.tests;

import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.automation.pages.LoginPage;
import org.automation.testdata.TestData;
import org.automation.utils.DataProviderUtils;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataSupplierTest extends BaseTest {


    @Test(dataProvider = "getData",description = "Test the login feature use data supplier",dataProviderClass = DataProviderUtils.class)
    public void dataSupplierTest(TestData testData) throws InterruptedException {

        LoginPage login = new LoginPage();
        login.loginToApplication(testData.userName, testData.password).
                clickOnAdmin().setUserName(testData.firstName).setEmployeeName(testData.testcasename);
    }


}

