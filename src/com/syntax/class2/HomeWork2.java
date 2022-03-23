package com.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {
/*
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser
        */
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https:/fb.com");
        driver.findElement(By.partialLinkText("Create new")).click();
        driver.findElement(By.partialLinkText("Sign")).click();
        driver.findElement(By.name("firstname")).sendKeys("Tom");
        driver.findElement(By.name("lastname")).sendKeys("Jery");
        driver.findElement(By.name("reg_email__")).sendKeys("zzzz@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("zzzz@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password");
        Thread.sleep(5000);
        driver.findElement(By.name("websubmit")).click();
       // driver.findElement(By.linkText("https://static.xx.fbcdn.net/rsrc.php/v3/y2/r/__geKiQnSG-.png")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
