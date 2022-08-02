package main.java.AddRecipientAuto;

import main.java.ConfigFile.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class AddRecipientAccountTx extends ConfigAuto {

    @Test(dataProvider = "dataProviderRecipientAccountTx")
    public void AccountTx(String fname, String lname, String acno, String mno) {

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

        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div/div[1]/div/h4[2]/a")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@id=\"countryList\"]/div[17]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div/div[2]/div[1]/a/div")).click();
        driver.findElement(By.id("first-name")).sendKeys(fname);
        driver.findElement(By.id("last-name")).sendKeys(lname);
        driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[4]/div/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[4]/div/div/div[2]/div[1]")).click();
        driver.findElement(By.id("account-number")).sendKeys(acno);
        driver.findElement(By.id("sortcode")).sendKeys("4546");
        driver.findElement(By.id("mobile-number-number")).sendKeys(mno);
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

        driver.quit();

    }


    @DataProvider
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
    }
}
