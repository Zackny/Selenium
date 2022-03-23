package com.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) {
        /*
        HW
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser

navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser

         */
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Elon");
        driver.findElement(By.id("customer.lastName")).sendKeys("Musk");
        driver.findElement(By.id("customer.address.street")).sendKeys("123 Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Los Angeles");
        driver.findElement(By.id("customer.address.state")).sendKeys("California");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("123456");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("381634445559");
        driver.findElement(By.id("customer.ssn")).sendKeys("3625-00-000");
        driver.findElement(By.id("customer.username")).sendKeys("user");
        driver.findElement(By.id("customer.password")).sendKeys("password");
        driver.findElement(By.id("repeatedPassword")).sendKeys("password");
        driver.findElement(By.className("button")).click();
        driver.close();
    }
}
