package main.java.EditContactDetails;

import main.java.ConfigFile.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UpdateContactAuto extends ConfigAuto {

    @Test
    public void editContact(){

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
        driver.findElement(By.xpath("//*[@id=\"userDropdown\"]/span[2]")).click();
        try {



            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//*[@id=\"content\"]/nav/ul/li/div/a[2]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement m = driver.findElement(By.id("address-line-1"));
        m.clear();
        m.sendKeys("Ebon Road, North Calci, 9980");
        WebElement g = driver.findElement(By.id("city"));
        g.clear();
        g.sendKeys("Karolina");

        WebElement f = driver.findElement(By.id("postcode"));
        f.clear();
        f.sendKeys("4545646");


        //test with big mobile number
        WebElement w = driver.findElement(By.id("numberField"));
        w.clear();
        w.sendKeys("48846494887879879877");

        driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div/div/div/div[2]/div[6]/button")).click();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //test with small mobile number
        WebElement w1 = driver.findElement(By.id("numberField"));
        w1.clear();
        w1.sendKeys("488");

        driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div/div/div/div[2]/div[6]/button")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //test with valid mobile number
        WebElement w2 = driver.findElement(By.id("numberField"));
        w2.clear();
        w2.sendKeys("488456885");

        driver.findElement(By.xpath("//*[@id=\"profile-form\"]/div[2]/div/div/div/div[2]/div[6]/button")).click();


    }
}
