package main.java.AddRecipientAuto;

import main.java.ConfigFile.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddRecipientMobileWallet extends ConfigAuto {

    @Test
    public void addRecipientAuto(){

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

        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div/div[1]/div/h4[2]/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"countryList\"]/div[5]/div/a/strong")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("first-name")).sendKeys("Alino");
        driver.findElement(By.id("last-name")).sendKeys("Vinko");
        driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[2]/div/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[2]/div/div/div[2]/div[1]")).click();
        driver.findElement(By.id("mobile-number")).sendKeys("56565656565");
        driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[4]/div/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[4]/div/div/div[2]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[5]/div/button")).click();

    }
}
