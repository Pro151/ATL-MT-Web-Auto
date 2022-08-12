package main.java.EditRecipientAuto;

import Utilities.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.DataDrivenMethod;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class EditRecipientAuto1 extends ConfigAuto {

    @Test
    public void EditRecipient() throws IOException {

        WebDriver driver = configAuto1();
        DataDrivenMethod dd = new DataDrivenMethod();
        ArrayList login1 = dd.getData("Login_1", "Login");
        ArrayList pwd1 = dd.getData("Password_2", "Login");
        ArrayList fname1 = dd.getData("F_name", "Edit_Recipient");
        ArrayList lname1 = dd.getData("L_name", "Edit_Recipient");
        ArrayList mno1 = dd.getData("M_no", "Edit_Recipient");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.className("login-btn")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.id("email")).sendKeys((CharSequence) login1.get(1));
        driver.findElement(By.id("inputPassword")).sendKeys((CharSequence) pwd1.get(1));
        driver.findElement(By.xpath("//i[@id='eye']")).click();
        driver.findElement(By.className("btn-login")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int m = 1; m <= 5; m++) {

            driver.findElement(By.xpath("//a[@href='/recipients']")).click();
            driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div/div[3]/div/div[1]/div[1]/div")).click();

            ////*[@id="content"]/section/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/a/p[1]
            driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div[1]/div/div[1]/div[1]/div/div[2]/a[2]/span[2]")).click();
            WebElement fname = driver.findElement(By.id("first-name"));
            fname.clear();
            fname.sendKeys((CharSequence) fname1.get(m));
            WebElement lname = driver.findElement(By.id("last-name"));
            lname.clear();
            lname.sendKeys((CharSequence) lname1.get(m));
            WebElement mnw = driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[2]/div"));
            mnw.click();
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[2]/div/div[2]/div[2]")).click();
            WebElement mno = driver.findElement(By.id("mobile-number"));
            mno.clear();
            mno.sendKeys((CharSequence) mno1.get(m));
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[4]/div")).click();
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[4]/div/div[2]/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[5]/div/button[2]")).click();

        }


    }


}
