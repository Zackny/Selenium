package com.syntax.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

/**
 * click on Help link
 * switch between tabs
 */
public class SimpleWindowHandling {
    public static String url = "http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();//get window handle for the main page
        System.out.println(mainPageHandle);

        WebElement heploLink = driver.findElement(By.linkText("Help"));
        heploLink.click();

        Set<String> allWindowHandles=driver.getWindowHandles();// store all handles in a set
        System.out.println(allWindowHandles);

       Iterator<String> it = allWindowHandles.iterator();//have an iterator in order to iterate through the handles
       mainPageHandle= it.next();//take the first step and assign the main handle
       String childHandle=it.next();//take the secomd step and have child handle
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(childHandle);
        driver.close();
        driver.switchTo().window(mainPageHandle);
        heploLink.click();
        driver.quit();
    }
}
