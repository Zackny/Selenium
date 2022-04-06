package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDowns {
    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        WebElement CreateButon = driver.findElement(By.linkText("Create new account"));
        CreateButon.click();
        Thread.sleep(2000);// na pop up mora da se doda sleep zbog sinhronizacije( ali wait je ispravno resenje)
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select select = new Select(year);
        select.selectByValue("2000");
        //System.out.println(year.getSize());
        // all options from DD
       List<WebElement> options= select.getOptions();//daje sve vrednosti iz drop downa
        for(WebElement option:options){
            System.out.println(option.getText());

        }


    }

}
