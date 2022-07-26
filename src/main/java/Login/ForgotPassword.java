package main.java.Login;

import main.java.ConfigFile.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ForgotPassword extends ConfigAuto{

    @Test
    public void FrgtPwd(){

        WebDriver driver = configAuto1();
        driver.findElement(By.className("login-btn")).click();
        driver.findElement(By.linkText("Forgot Password?")).click();
        driver.findElement(By.id("inputEmail")).sendKeys("qa2222@yopmail.com");
        driver.findElement(By.className("btn-success")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.linkText("Login Here")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();

    }
}
