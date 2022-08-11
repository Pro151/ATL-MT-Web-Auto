package Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        //ITestListener.super.onTestStart(result);

        System.out.println("Testing Started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        //ITestListener.super.onTestSuccess(result);

        System.out.println("I successfully executed the test script" +"_"+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        //ITestListener.super.onTestFailure(result);
        System.out.println("Test case failed" +"_"+result.getName());

        try {
            ScreenshotPicker.takeScreenshot(result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        //ITestListener.super.onTestSkipped(result);
        System.out.println("The test case skipped"+"_"+result.getName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
        //ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        // TODO Auto-generated method stub
        //ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
        //ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
        //ITestListener.super.onFinish(context);
    }


}
