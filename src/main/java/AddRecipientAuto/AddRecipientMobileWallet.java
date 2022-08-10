package main.java.AddRecipientAuto;

import main.java.ConfigFile.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.java.DataDrivenMethod;

import java.io.IOException;
import java.util.ArrayList;

public class AddRecipientMobileWallet extends ConfigAuto {

    @Test
    public void addRecipientAuto() throws IOException {

        WebDriver driver = configAuto1();
        DataDrivenMethod dd = new DataDrivenMethod();
        ArrayList login1 = dd.getData("Login_1", "Login");
        ArrayList pwd1 = dd.getData("Password_2", "Login");
        ArrayList fname1 = dd.getData("F_name", "Add_recipient_MW");
        ArrayList lname1 = dd.getData("L_name", "Add_recipient_MW");
        ArrayList pno1 = dd.getData("M_no", "Add_recipient_MW");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("email")).sendKeys((CharSequence) login1.get(1));
        driver.findElement(By.id("inputPassword")).sendKeys((CharSequence) pwd1.get(1));
        driver.findElement(By.xpath("//i[@id='eye']")).click();
        driver.findElement(By.className("btn-login")).click();


        for (int j = 1; j <= 5; j++) {

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
            driver.findElement(By.id("first-name")).sendKeys((CharSequence) fname1.get(j));
            driver.findElement(By.id("last-name")).sendKeys((CharSequence) lname1.get(j));
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[2]/div/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[2]/div/div/div[2]/div[1]")).click();
            driver.findElement(By.id("mobile-number")).sendKeys((CharSequence) pno1.get(j));
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[4]/div/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[4]/div/div/div[2]/div[3]")).click();
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[5]/div/button")).click();

        }


        driver.quit();
    }

    /*@DataProvider
    public Object[][] dataProviderRecipientMwallet() {


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Object[][] data1 = new Object[3][3];
        //1st set
        //1st set
        data1[0][0] = "Arnonli ";
        data1[0][1] = "Arwini";
        data1[0][2] = "0166678692";

        //2nd set
        data1[1][0] = "Qurinq ";
        data1[1][1] = "Alessow";
        data1[1][2] = "0566678713";

        //3rd set
        data1[2][0] = "Alissal ";
        data1[2][1] = "Alena";
        data1[2][2] = "0781441563";


        return data1;
    }*/
}
