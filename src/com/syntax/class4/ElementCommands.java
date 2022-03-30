package com.syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Form");
        WebElement merriedRadioButton=driver.findElement(By.xpath("(//input[@name = 'optradio'])[1]"));
       boolean ismerriedRadioButtonEnabled= merriedRadioButton.isEnabled();
        System.out.println(ismerriedRadioButtonEnabled);

        if(!ismerriedRadioButtonEnabled){
            System.out.println("Not enabled");
        }else{
            System.out.println("Enabled");
        }
      boolean ismerriedRadioButtonDisplayed=merriedRadioButton.isDisplayed();
        System.out.println(ismerriedRadioButtonDisplayed);

        boolean ismerriedRadioButtonSelected=merriedRadioButton.isSelected();
        System.out.println("Before clicking "+ismerriedRadioButtonSelected);
        merriedRadioButton.click();
        boolean ismerriedRadioButtonselected = merriedRadioButton.isSelected();


        System.out.println("After clicking "+ismerriedRadioButtonSelected);

        driver.quit();

    }
}
