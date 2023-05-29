package org.automation.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.automation.utils.ScreenshotUtils;

public class ExtentLogger {

    private ExtentLogger(){}

    public static void pass(String message){
        ExtentManager.getExtentTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenShot()).build());
    }

    public static void fail(String message) {
        ExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenShot()).build());
    }

    public static void infoMessage(String message) {
        ExtentManager.getExtentTest().info(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenShot()).build());
    }
}
