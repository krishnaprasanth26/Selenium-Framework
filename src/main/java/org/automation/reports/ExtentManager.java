package org.automation.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {

    private ExtentManager(){}

    private static final ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();

    //Removing the public keyword , so that method is accessible only inside the package.
    static ExtentTest getExtentTest(){
        return threadLocal.get();
    }

    static void setExtentTest(ExtentTest test){
        threadLocal.set(test);
    }



}
