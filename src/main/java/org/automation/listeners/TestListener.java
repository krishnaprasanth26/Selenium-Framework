package org.automation.listeners;

import org.automation.reports.ExtentLogger;
import org.automation.reports.ExtentReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class TestListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {

        ExtentReport.createReport(result.getMethod().getDescription());
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        ExtentLogger.pass(result.getName() + "is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getName() + "is Failed");
        ExtentLogger.fail(result.getThrowable().getMessage());
        ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ExtentReport.initReports();
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReport.flushReports();
    }
}
