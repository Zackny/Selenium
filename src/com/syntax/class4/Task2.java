package com.syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        /*
        TC 1: Amazon link count:
Open chrome browser
Go to "https://www.amazon.com/"
Get all links
Get number of links that has text
Print to console only the links that has text


         */

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chrome.com");
        driver.get("https://www.amazon.com/");
        List<WebElement> allList=driver.findElements(By.tagName("a"));
        System.out.println(allList.size());

        for (WebElement list:allList
             ) {
            String linkText=list.getText();
            String allLinks=list.getAttribute("href");

            if(!linkText.isEmpty()){
                System.out.println(linkText+" "+allLinks);
            }


        }

    }
}
