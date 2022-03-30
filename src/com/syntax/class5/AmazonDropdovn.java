package com.syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonDropdovn {

    public static String url = "http://amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoriesDD);//object of Select class

        List<WebElement> options = select.getOptions();
        for(WebElement option:options) {
            String optionText = option.getText();
            System.out.println(optionText);
        }

      /*  for(int i=0;i<options.size();i++){
        String optionText = options.get(i).getText();
           // System.out.println(options.get(i).getText());
            System.out.println(optionText);
        }
        */
        select.selectByValue("search-alias=appliances");

    }
}
