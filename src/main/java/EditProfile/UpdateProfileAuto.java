package main.java.EditProfile;

import Utilities.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Utilities.DataDrivenMethod;

import java.io.IOException;
import java.util.ArrayList;

public class UpdateProfileAuto extends ConfigAuto {

    @Test
    public void UpdateProfileAuto() throws IOException {


        WebDriver driver = configAuto1();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.className("login-btn")).click();
        DataDrivenMethod dd = new DataDrivenMethod();
        ArrayList login1 = dd.getData("Login_1", "Login");
        ArrayList pwd1 = dd.getData("Password_2", "Login");
        ArrayList fname = dd.getData("First_name", "Profile_update");
        ArrayList lname = dd.getData("last_name", "Profile_update");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("email")).sendKeys((CharSequence) login1.get(1));
        driver.findElement(By.id("inputPassword")).sendKeys((CharSequence) pwd1.get(1));
        driver.findElement(By.xpath("//i[@id='eye']")).click();
        driver.findElement(By.className("btn-login")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /*driver.findElement(By.xpath("//*[@id=\"wrapper\"]/ul/li[2]/a")).click();
        driver.findElement(By.id("q")).sendKeys(pdata);
        driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div/div[2]/form/div/div/button")).click();
        driver.findElement(By.linkText("Clear")).click();*/

        for (int i = 1; i <= 4; i++) {

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

            WebElement we = driver.findElement(By.id("first-name"));
            we.clear();
            we.sendKeys((CharSequence) fname.get(i));
            WebElement we2 =driver.findElement(By.id("last-name"));
            we2.clear();
            we2.sendKeys((CharSequence) lname.get(i));

            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div/div/div/div[2]/div[4]/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div/div/div/div[2]/div[5]/button")).click();
        }
        driver.quit();
    }

    /*@DataProvider
    public Object[][] dataProviderProfileUpdate() {


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

    }*/
}
