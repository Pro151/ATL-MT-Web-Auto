package main.java.AddRecipientAuto;

import Utilities.ConfigAuto;
import Utilities.DataDrivenMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class AddRecipientOTCCashTx extends ConfigAuto {

    @Test
    public void OTCCashTrans() throws IOException {


        WebDriver driver = configAuto1();
        DataDrivenMethod dd = new DataDrivenMethod();
        ArrayList login1 = dd.getData("Login_1", "Login");
        ArrayList pwd1 = dd.getData("Password_2", "Login");
        ArrayList fname1 = dd.getData("F_name", "Add_recipient_OTC");
        ArrayList lname1 = dd.getData("L_name", "Add_recipient_OTC");
        ArrayList add1 = dd.getData("add_1", "Add_recipient_OTC");
        ArrayList city1 = dd.getData("city_2", "Add_recipient_OTC");
        ArrayList pno1 = dd.getData("M_no", "Add_recipient_MW");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("email")).sendKeys((CharSequence) login1.get(1));
        driver.findElement(By.id("inputPassword")).sendKeys((CharSequence) pwd1.get(1));
        driver.findElement(By.xpath("//i[@id='eye']")).click();
        driver.findElement(By.className("btn-login")).click();


        for (int l = 1; l <= 5; l++) {

            driver.findElement(By.xpath("//*[@id=\"wrapper\"]/ul/li[3]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div/div[1]/div/h4[2]/a")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            driver.findElement(By.xpath("//*[@id=\"countryList\"]/div[17]/div/a")).click();
            driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/div/div/div/div/div/div[2]/div[3]/a/div/h6")).click();
            driver.findElement(By.id("first-name")).sendKeys((CharSequence) fname1.get(l));
            driver.findElement(By.id("last-name")).sendKeys((CharSequence) lname1.get(l));
            driver.findElement(By.id("address-line-1")).sendKeys((CharSequence) add1.get(l));
            driver.findElement(By.id("city")).sendKeys((CharSequence) city1.get(l));
            driver.findElement(By.id("mobile-number-number")).sendKeys((CharSequence) pno1.get(l));
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[7]/div/div/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[7]/div/div/div[2]/div[2]")).click();
            driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div[8]/div/button")).click();
        }


        driver.quit();
    }

    /*@DataProvider
    public Object[][] dataProviderRecipientOTCcashTx() {


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Object[][] data1 = new Object[3][3];
        //1st set
        //1st set
        data1[0][0] = "Aderina ";
        data1[0][1] = "Quisoqi";
        data1[0][2] = "676997864";

        //2nd set
        data1[1][0] = "Safar ";
        data1[1][1] = "Rejak";
        data1[1][2] = "676007871";

        //3rd set
        data1[2][0] = "Alibaba ";
        data1[2][1] = "Gabiela";
        data1[2][2] = "718122158";


        return data1;
    }*/
}
