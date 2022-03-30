package com.syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleOptionsDD {
//selectovanje(vise opcija) multiple dropDowns
public static String url="https://www.syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement statesDD=driver.findElement(By.name("States"));
        Select select=new Select(statesDD);
       boolean isMultiple =select.isMultiple();//ugradjen method iz Jave: isMultiple();pokazuje da li je moguce multi selektovati
        System.out.println(isMultiple);

        if(isMultiple){
            List<WebElement> options=select.getOptions();
            for(WebElement option:options){
                String optionText=option.getText();
                select.selectByVisibleText(optionText);
                Thread.sleep(1000);
                System.out.println(optionText);
            }

        }
       // select.deselectByIndex(5); primer deselect nakon selektovanja
            select.deselectAll();




    }
}
