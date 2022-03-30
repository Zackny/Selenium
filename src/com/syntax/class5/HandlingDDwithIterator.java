package com.syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class HandlingDDwithIterator {
    public static String url = "https://www.amazon.com/";

    public static void main(String[] args) {
//primer loopinga kroz dropDowm manue uz pomoc Iterator i while loop
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement options = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(options);
        boolean isMulti = select.isMultiple();
        System.out.println(isMulti);
        if (!isMulti) {
            List<WebElement> option = select.getOptions();
            Iterator<WebElement> it = option.iterator();//interface
            while (it.hasNext()) {
                WebElement ddOption = it.next();
                String optionText = ddOption.getText();
                System.out.println(optionText);
            }

        }


    }
}
