package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static String url = "https://www.syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement checkBox1 = driver.findElement(new By.ByCssSelector("input#isAgeSelected"));
        System.out.println("check box is selected: " + checkBox1.isSelected());
        checkBox1.click();
        Thread.sleep(3000);
        checkBox1.click();
        WebElement element = driver.findElement(By.xpath("//div[text()='Single Checkbox Demo']"));
        String st = element.getText();
        System.out.println("hed text: " + st);
       List<WebElement> boxes= driver.findElements(By.xpath("//input[@class=\"cb1-element\"]"));
        for(WebElement checBox:boxes){
            checBox.click();
        }
        for(WebElement checBox:boxes){
            checBox.click();//deselecting(same way as selectin with loop)
        }



    }
}
