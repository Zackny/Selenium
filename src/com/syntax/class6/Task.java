package com.syntax.class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
public static String url="https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        /*
        Navigate to https://syntaxprojects.com/bootstrap-iframe.php
verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
verify enroll today button is enabled


         */
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement heder=driver.findElement(By.xpath("//span[@class=\"gum\"]"));
        String text=heder.getText();
        System.out.println(text);
        if(heder.isDisplayed()){
            System.out.println("Heder is displayed");
        }else{
            System.out.println("Not displayed");
        }
        driver.switchTo().frame("FrameTwo");
        WebElement button=driver.findElement(By.xpath("//div[@class='text-block-2 lg']"));
        if(button.isEnabled()){
            System.out.println("Button enroll today is enabled");
        }else{
            System.out.println("Button enroll today is not enabled");

        }
        button.click();
        Thread.sleep(4000);
        driver.switchTo().defaultContent();
        driver.quit();

    }
}
