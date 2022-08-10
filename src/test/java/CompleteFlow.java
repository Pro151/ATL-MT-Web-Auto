package test.java;

import Utilities.ConfigAuto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompleteFlow extends ConfigAuto {
    @Test
    public void AllFlow() {

        WebDriver driver = configAuto1();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/nav/ul[2]/li[1]/a")).click();
        driver.findElement(By.id("email")).sendKeys("qa9999@yopmail.com");
        driver.findElement(By.id("password")).sendKeys("Qa123!");
        driver.findElement(By.xpath("//i[@id='eye2']")).click();
        driver.findElement(By.id("confirm-password")).sendKeys("Qa123!@");
        driver.findElement(By.xpath("//i[@id='eye3']")).click();
        driver.findElement(By.className("btn-register")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement msg = driver.findElement(By.xpath("//div[@class='header']"));
        String text = msg.getText();
        System.out.println(text);
        String expectedText = "Oops! something wasn't correct";
        Assert.assertEquals(text, expectedText);

        if (text.equals(expectedText)) {

            System.out.println("Matched");
            driver.findElement(By.xpath("/html/body/main/div/div/div/div/div/div[2]/div/p[2]/a")).click();
            driver.findElement(By.id("email")).sendKeys("qa9999@yopmail.com");
            driver.findElement(By.id("inputPassword")).sendKeys("Qa123!");
            driver.findElement(By.xpath("//i[@id='eye']")).click();
            driver.findElement(By.className("btn-login")).click();

        } else {

            System.out.println("Registration success");
        }

        for (int i = 1; i <= 4; i++) {
            driver.findElement(By.xpath("//button[@data-value='2']")).click();
        }
        driver.findElement(By.className("btn-success")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
