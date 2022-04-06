package com.syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GotoFB {
    public static String url = "https://www.facebook.com/";

    /*
    Go to facebook sign up page
Fill out the whole form
Click signup

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement CreateButon = driver.findElement(By.linkText("Create new account"));
        CreateButon.click();
       Thread.sleep(2000);
        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("Zack");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Zac");
        WebElement email = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
        email.sendKeys("zzz@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("zzz@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password");
        WebElement month=driver.findElement(By.id("month"));
        Select select=new Select(month);
        List<WebElement>allElementh=select.getOptions();
        select.selectByVisibleText("Jan");
        Thread.sleep(1000);
        WebElement days=driver.findElement(By.id("day"));
        Select day=new Select(days);
        List<WebElement> dayList=day.getOptions();
        day.selectByValue("12");
        Thread.sleep(1000);
        WebElement year=driver.findElement(By.id("year"));
        Select years=new Select(year);
        List<WebElement>yearList=years.getOptions();
        years.selectByValue("2002");
        Thread.sleep(1000);
        WebElement button=driver.findElement(By.xpath("//input[@value=2]"));
        button.click();
        Thread.sleep(1000);
        WebElement signButton=driver.findElement(By.name("websubmit"));
                signButton.click();
    }


}
