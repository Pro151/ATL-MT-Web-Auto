/*package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Element;

public class takeScreenShots extends ConfigAuto {

    public void takeScreenshot() throws IOException {

        WebDriver driver = configAuto1();
        File File = ((TakesScreenshot)driver)
                .getScreenshotAs(OutputType.FILE);

        String FileName = null;
        FileUtils.copyFile(File,
                new File("C://Users//Promit//Downloads//Test//Projects//ATL MT//Automation//ScreenShot"
                        + FileName + ".jpeg"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript(
                "arguments[0].style.border = '3px solid red'",
                Element);

    }

   /* public static void MakeBorder(WebElement Element)
    {

    }*/

