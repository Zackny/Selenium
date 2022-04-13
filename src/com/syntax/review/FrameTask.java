package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameTask {
    public static String url = "https://chercher.tech/practice/frames";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.id("topic"));

        System.out.println(topic.getText());

        driver.switchTo().frame(1);
        WebElement drop = driver.findElement(By.tagName("select"));
        Select select=new Select(drop);
        select.selectByIndex(2);

        driver.switchTo().defaultContent();

        driver.switchTo().frame(0);
        driver.switchTo().frame(0);





    }
}
