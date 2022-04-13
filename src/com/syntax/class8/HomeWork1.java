package com.syntax.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HomeWork1 {
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) {
        /*
        Go to https://demoqa.com/browser-windows
click on New Tab and print the text from new tab in the console
click on New Window and print the text from new window in the console
click on New Window Message and print the text from new window in the console
Verify (compare) the titles for each page
Print out the title of the all pages

         */
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainHAndle = driver.getWindowHandle();

        WebElement newTab = driver.findElement(By.id("tabButton"));

        WebElement newWindow = driver.findElement(By.id("windowButton"));

        WebElement newWindowMessage = driver.findElement(By.id("messageWindowButton"));
        newTab.click();
        newWindow.click();
        newWindowMessage.click();

        Set<String> allhandles = driver.getWindowHandles();
        Iterator<String> it = allhandles.iterator();
        while (it.hasNext()) {
           it.next();


            String text = driver.getTitle();
            System.out.println(text);
        }


    }
}
