package main.java.Login;

import Utilities.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Utilities.DataDrivenMethod;

import java.io.IOException;
import java.util.ArrayList;


public class LoginAuto extends ConfigAuto {


    @Test
    public void loginA() throws IOException {

        WebDriver driver=configAuto1();
        DataDrivenMethod dd = new DataDrivenMethod();
        ArrayList login1 = dd.getData("Login_1","Login");
        ArrayList pwd1 = dd.getData("Password_2","Login");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.id("email")).sendKeys((CharSequence) login1.get(1));
        driver.findElement(By.id("inputPassword")).sendKeys((CharSequence) pwd1.get(1));
        driver.findElement(By.xpath("//i[@id='eye']")).click();
        driver.findElement(By.className("btn-login")).click();

        driver.close();
    }



}
