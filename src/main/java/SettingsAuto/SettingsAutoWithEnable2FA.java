package main.java.SettingsAuto;

import main.java.ConfigFile.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SettingsAutoWithEnable2FA extends ConfigAuto {

    @Test
    public void SettingsAutoMain() {

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

        //2FA
        driver.findElement(By.xpath("//*[@id=\"pills-verification-tab\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"pills-verification\"]/div/div/div/a")).click();


        driver.findElement(By.id("pin-0")).sendKeys("0");
        driver.findElement(By.id("pin-1")).sendKeys("0");
        driver.findElement(By.id("pin-2")).sendKeys("0");
        driver.findElement(By.id("pin-3")).sendKeys("0");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //C-2FA
        driver.findElement(By.id("confirm-pin-0")).sendKeys("0");
        driver.findElement(By.id("confirm-pin-1")).sendKeys("0");
        driver.findElement(By.id("confirm-pin-2")).sendKeys("0");
        driver.findElement(By.id("confirm-pin-3")).sendKeys("0");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //reveal pin
        driver.findElement(By.xpath("//*[@id=\"reveal-pin\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"twofa-form\"]/div[3]/div/div/div/button")).click();

        //final 2FA
        for (int i = 0; i <= 4; i++) {

            driver.findElement(By.xpath("//button[@data-value=\"0\"]")).click();
        }

        driver.findElement(By.xpath("//*[@id=\"two-fa-form\"]/table/tbody/tr[5]/td[4]/button")).click();


    }
}
