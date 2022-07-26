package main.java.DashboardAuto;

import main.java.ConfigFile.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DashboardAutomationTest extends ConfigAuto {

    @Test(dataProvider = "dataProviderTransactionSearch")
    public void DashAuto(String pdata){


        WebDriver driver=configAuto1();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.className("login-btn")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("email")).sendKeys("qa222@yopmail.com");
        driver.findElement(By.id("inputPassword")).sendKeys("Qa123!@");
        driver.findElement(By.xpath("//i[@id='eye']")).click();
        driver.findElement(By.className("btn-login")).click();


        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/ul/li[2]/a")).click();
        driver.findElement(By.id("q")).sendKeys(pdata);
        driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div/div[2]/form/div/div/button")).click();
        driver.findElement(By.linkText("Clear")).click();

        driver.findElement(By.id("userDropdown")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"content\"]/nav/ul/li/div/a[1]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.id("first-name")).sendKeys("Alora");
        driver.findElement(By.id("last-name")).sendKeys("Venson");
        driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div/div/div/div[2]/div[4]/div/div[1]")).click();
        driver.findElement(By.xpath("")).click();

        driver.quit();

    }


    @DataProvider
    public Object[][] dataProviderTransactionSearch() {


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Object[][] data1 = new Object[4][1];
        //1st set
        //1st set
        data1[0][0] = "Account";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //2nd set
        data1[1][0] = "Arnold";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //3rd set
        data1[2][0] = "Jul";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //4th set
        data1[3][0] = "22063";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return data1;

    }



}

