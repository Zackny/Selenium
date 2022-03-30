package com.syntax.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxDemo {
    public static String url="https://www.syntaxprojects.com/basic-checkbox-demo.php";
// click and looping through check boxes
    public static  void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        List<WebElement> optionCheckBoxdriver=driver.findElements(new By.ByCssSelector("input[class='cb1-element']"));
        int size=optionCheckBoxdriver.size();
        System.out.println(size);
        for(WebElement option :optionCheckBoxdriver) {
           String checkBoxText= option.getAttribute("value");
           if(checkBoxText.equals("Option-2")){
               option.click();
               break;
           }


        }


    }
}
