package main.java.BetaATLMTwebPageClicks;

import main.java.ConfigFile.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ButtonAndLinksClickable extends ConfigAuto {

    @Test
    public void clickableAuto() throws InterruptedException {

        //click on how it works?
        WebDriver driver = configAuto1();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/nav/ul[1]/li[2]/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@id=\"hero\"]/div/div/div[2]/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[0].click()",
                driver.findElement(By.cssSelector("body > div.vbox-overlay > div.vbox-container > div")));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Page scroll

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
        js.executeScript("window.scrollBy(0,-10)");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Clicks & opening money transfer guidelines

        driver.findElement(By.xpath("//*[@id=\"faq\"]/div/div[2]/div/div/ul/li[1]/a")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"faq\"]/div/div[2]/div/div/ul/li[2]/a ")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"faq\"]/div/div[2]/div/div/ul/li[3]/a")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"faq\"]/div/div[2]/div/div/ul/li[4]/a")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@id=\"faq\"]/div/div[3]/div/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        JavascriptExecutor js0 = (JavascriptExecutor) driver;
        js0.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div/h5/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js00 = (JavascriptExecutor) driver;
        js00.executeScript("window.scrollBy(0,1000)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div/h5/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js01 = (JavascriptExecutor) driver;
        js01.executeScript("window.scrollBy(0,1000)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[3]/div/h5/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js02 = (JavascriptExecutor) driver;
        js02.executeScript("window.scrollBy(0,1000)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1200)");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@id=\"main\"]/section[2]/div/div[3]/div/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,-1200)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.navigate().back();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollBy(0,3600)");


        WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div[2]/div/div/div[1]/div/h4"));
        WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div[2]/div/div/div[2]/div/h4"));
        WebElement ele3 = driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div[2]/div/div/div[3]/div/h4"));

        //Creating object of an Actions class
        Actions action = new Actions(driver);

        //Performing the mouse hover action on the target element.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        action.moveToElement(ele1).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        action.moveToElement(ele2).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        action.moveToElement(ele3).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("window.scrollBy(0,1000)");

        //video play
        driver.findElement(By.xpath("//*[@id=\"main\"]/section[5]/div/div/div/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor jse3 = (JavascriptExecutor) driver;
        jse3.executeScript("arguments[0].click()",
                driver.findElement(By.cssSelector("body > div.vbox-overlay > div.vbox-container > div")));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("window.scrollBy(0,2200)");


        //all
        driver.findElement(By.id("pills-all-tab")).click();
        driver.findElement(By.xpath("//*[@id=\"pills-all\"]/div[1]/div[2]/div[1]/div[1]/ul/li/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.getTitle();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"pills-all\"]/div[1]/div[2]/div[1]/div[2]/ul/li/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.getTitle();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"pills-all\"]/div[1]/div[2]/div[1]/div[3]/ul/li/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.getTitle();
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"pills-all\"]/div[1]/div[2]/div[1]/div[4]/ul/li/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.getTitle();
        driver.navigate().back();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@id=\"pills-all\"]/div[2]/div[2]/div/div[1]/ul/li/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.getTitle();
        driver.navigate().back();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(By.xpath("//*[@id=\"pills-all\"]/div[2]/div[2]/div/div[2]/ul/li/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.getTitle();
        driver.navigate().back();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //africa
        driver.findElement(By.id("pills-africa-tab")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //asia
        driver.findElement(By.id("pills-asia-tab")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //europe
        driver.findElement(By.id("pills-europe-tab")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
