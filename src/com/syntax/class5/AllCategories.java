package com.syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AllCategories {
    /*
    Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header

     */
    public static String url = "https://www.ebay.com/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement options = driver.findElement(By.name("_sacat"));
        Select select = new Select(options);
        List<WebElement> allOpt = select.getOptions();
        for (WebElement allOptions : allOpt) {
            String getTxt = allOptions.getText();

            System.out.println(getTxt);
        }
        options.click();
        select.selectByVisibleText("Computers/Tablets & Networking");

        WebElement opt = driver.findElement(new By.ByCssSelector("input[type='submit']"));
        opt.click();
        WebElement element = driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));
        /*
        if(element.isDisplayed()){
            System.out.println("Is displayed");
        }else{
            System.out.println("Not displayed");
        }
        */


        boolean isElementDisplayed = element.isDisplayed();
        System.out.println(isElementDisplayed);
        driver.quit();

    }
}
