package com.syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownHandling {
    //dropDown finding elements and selecting
public static String url="https://www.syntaxprojects.com/basic-select-dropdown-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get(url);
        WebElement dayDD= driver.findElement(By.id("select-demo"));
        //select class must have parameter from webelement(name)
        Select select=new Select(dayDD);
        select.selectByIndex(3);// indexing starts from 0

        //Thread.sleep(1000);

        //select.deselectByVisibleText("Thursday");
       // Thread.sleep(1000);

        //select.selectByValue("Sunday");
        List<WebElement> allOptions=select.getOptions();
        int size=allOptions.size();
        System.out.println(size);

        for(int i=0;i<allOptions.size();i++){
           String option= allOptions.get(i).getText();
            System.out.println(option);
            select.selectByIndex(i);//selecting all elements one by one with for loop, and using select class
            Thread.sleep(1000);
        }


    }
}
