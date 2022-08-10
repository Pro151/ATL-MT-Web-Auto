package main.java.AddRecipientAuto;

import main.java.ConfigFile.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.DataDrivenMethod;

import java.io.IOException;
import java.util.ArrayList;


public class AddRecipientAccountTx extends ConfigAuto {

    @Test
    public void AccountTx() throws IOException {

        WebDriver driver = configAuto1();
        DataDrivenMethod dd = new DataDrivenMethod();
        ArrayList login1 = dd.getData("Login_1", "Login");
        ArrayList pwd1 = dd.getData("Password_2", "Login");
        ArrayList fname1 = dd.getData("F_name", "Add_recipient");
        ArrayList lname1 = dd.getData("L_name", "Add_recipient");
        ArrayList acno1 = dd.getData("Ac_no", "Add_recipient");
        ArrayList sco1 = dd.getData("sco", "Add_recipient");
        ArrayList pno1 = dd.getData("M_no", "Add_recipient");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("email")).sendKeys((CharSequence) login1.get(1));
        driver.findElement(By.id("inputPassword")).sendKeys((CharSequence) pwd1.get(1));
        driver.findElement(By.xpath("//i[@id='eye']")).click();
        driver.findElement(By.className("btn-login")).click();


        for (int k = 1; k <= 5; k++) {

            driver.findElement(By.xpath("//*[@id=\"wrapper\"]/ul/li[3]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div/div[1]/div/h4[2]/a")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            driver.findElement(By.xpath("//*[@id=\"countryList\"]/div[17]/div/a")).click();
            driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div/div/div[2]/div[1]/a/div/h6")).click();
            driver.findElement(By.id("first-name")).sendKeys((CharSequence) fname1.get(k));
            driver.findElement(By.id("last-name")).sendKeys((CharSequence) lname1.get(k));
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[4]/div/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[4]/div/div/div[2]/div[1]")).click();
            driver.findElement(By.id("account-number")).sendKeys((CharSequence) acno1.get(k));
            driver.findElement(By.id("sortcode")).sendKeys((CharSequence) sco1.get(k));
            driver.findElement(By.id("mobile-number-number")).sendKeys((CharSequence) pno1.get(k));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[8]/div/div/div[1]")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[8]/div/div/div[2]/div[2]")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[9]/div/button")).click();
        }
        driver.quit();

    }


    /*@DataProvider
    public Object[][] dataProviderRecipientAccountTx() {


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Object[][] data1 = new Object[3][4];
        //1st set
        //1st set
        data1[0][0] = "ArnonlWi ";
        data1[0][1] = "ArwinOh";
        data1[0][2] = "6766678652342";
        data1[0][3] = "676667865";

        //2nd set
        data1[1][0] = "Qurin ";
        data1[1][1] = "Alesso";
        data1[1][2] = "6766678655672";
        data1[1][3] = "676667871";

        //3rd set
        data1[2][0] = "Alissa ";
        data1[2][1] = "Alen";
        data1[2][2] = "6766678653452";
        data1[2][3] = "718144158";


        return data1;
    }*/
}
