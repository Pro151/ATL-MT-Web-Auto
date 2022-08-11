package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotPicker extends ConfigAuto{

    public static void takeScreenshot(String fileName) throws IOException {

        WebDriver driver = configAuto1();
        fileName = fileName + ".png";
        String directory = "C://Users//Promit//Downloads//Test//Projects//ATL MT//Automation//ScreenShot/";
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(directory + fileName));


    }
}
