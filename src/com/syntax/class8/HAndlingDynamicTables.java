package com.syntax.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HAndlingDynamicTables {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr"));
        for (int i = 1; i < rows.size(); i++) {
            String text = rows.get(i).getText();
            System.out.println(text);
            if (text.contains("Bob Feather")) {
                List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@class = 'SampleTable']/tbody/tr/td[1]"));
                checkboxes.get(i - 1).click();
            }
        }


    }
}
