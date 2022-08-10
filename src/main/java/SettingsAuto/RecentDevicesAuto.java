package main.java.SettingsAuto;

import Utilities.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RecentDevicesAuto extends ConfigAuto {

    @Test
    public void deviceAuto() {

        WebDriver driver = configAuto1();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.className("login-btn")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("email")).sendKeys("q2@yopmail.com");
        driver.findElement(By.id("inputPassword")).sendKeys("Qa123!@");
        driver.findElement(By.xpath("//i[@id='eye']")).click();
        driver.findElement(By.className("btn-login")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@id=\"userDropdown\"]/span[2]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@id=\"content\"]/nav/ul/li/div/a[5]")).click();
        driver.findElement(By.id("pills-preference-tab")).click();
        driver.findElement(By.xpath("//*[@id=\"pills-preference\"]/div/div/div/div/a[1]/div/div[1]/span")).click();
        //language
        driver.findElement(By.xpath("//*[@id=\"localeDropdown\"]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"localeDropdown\"]/div[2]/div[1]/small")).click();
        //timezone
        driver.findElement(By.xpath("//*[@id=\"timezoneDropdown\"]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"timezoneDropdown\"]/div[2]/div[26]/small")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //save changes
        driver.findElement(By.xpath("//*[@id=\"preferences-form\"]/div[2]/div/button")).click();

        driver.findElement(By.xpath("//*[@id=\"pills-preference\"]/div/div/div/div/a[2]/div/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"timezoneDropdown\"]/input[2]")).click();
        //timezone
        driver.findElement(By.xpath("//*[@id=\"timezoneDropdown\"]/div[2]/div[26]/small")).click();

        //save changes
        driver.findElement(By.xpath("//*[@id=\"preferences-form\"]/div[2]/div/button")).click();

        //Recent devices
        driver.findElement(By.id("pills-devices-tab")).click();
        driver.findElement(By.linkText("See All")).click();

        //Scroll down

        for (int j = 0; j <= 15; j++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
        }

        driver.navigate().back();
        driver.quit();
    }
}
