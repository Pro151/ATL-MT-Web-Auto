package main.java.DocumentUploadVerificationAuto;

import Utilities.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;

public class DocUploadVerifyAuto extends ConfigAuto {

    @Test
    public void UploadAutoDemo() throws AWTException, InterruptedException {

        WebDriver driver = configAuto1();

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

        driver.findElement(By.id("userDropdown")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"content\"]/nav/ul/li/div/a[3]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@id=\"pills-transfer\"]/div/div[1]/ul/li[1]/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"pills-transfer\"]/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"kyc-document-list\"]/div[1]/div[3]/span/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"kyc-document-list\"]/div/div[3]/span/a")).click();

        WebElement element = driver.findElement(By.xpath("//*[@id=\"upload-form\"]/div[2]/div[1]/div[1]/div/div[2]/div[2]/label"));
        element.click();
        //For picking the file from data source

        File f = null;
        try {
            f = new File("\"C:\\Users\\Promit\\Downloads\\2ec386d989ba3de1b6df1065c8202f78.jpg\"");
        } catch (Exception e) {
            e.printStackTrace();
        }
        filePicker(f.getPath());

        WebElement element2= driver.findElement(By.xpath("//*[@id=\"upload-form\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/label"));
        element2.click();
        File f2 = null;
        try {
            f2 = new File("\"C:\\Users\\Promit\\Downloads\\signature.png\"");
        } catch (Exception e) {
            e.printStackTrace();
        }
        filePicker(f2.getPath());



        //verifying document

        driver.findElement(By.xpath("//*[@id=\"upload-form\"]/div[2]/div[3]/div[2]/button")).click();

        //navigating back
        driver.findElement(By.xpath("//*[@id=\"upload-form\"]/div[2]/div[3]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"pills-transfer\"]/div[3]/div/a[2]")).click();
    }
}
