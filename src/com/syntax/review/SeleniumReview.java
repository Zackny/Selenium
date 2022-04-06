package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumReview {
    public static String url="https://www.syntaxprojects.com/basic-radiobutton-demo.php";

    public static void main(String[] args) {

        //radiobuttons
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //Xpath jos jedan nacin
        WebElement findElement=driver.findElement(By.xpath("//input[@value='Female' and @type='radio' and @name='optradio']"));
        findElement.isEnabled();
        System.out.println(findElement);
        //check is displayed
        System.out.println("the femail button is displayed "+findElement.isDisplayed());
        System.out.println("the femail button is selected "+findElement.isSelected());

        if(!findElement.isSelected()){
            findElement.click();
        }
        System.out.println("the femail button is selected "+findElement.isSelected());

        //links task
       List<WebElement> links= driver.findElements(By.tagName("a"));
        for(WebElement link:links){
           String textPrint =link.getText();
           if(!textPrint.isEmpty()){
               System.out.println(textPrint);
           }


        }

    }
}