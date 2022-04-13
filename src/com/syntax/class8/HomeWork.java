package com.syntax.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeWork {
    public static String url = " https://the-internet.herokuapp.com/dynamic_controls";

    /*
    go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled

     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement remButton = driver.findElement(By.xpath("//button[text()='Remove']"));
        remButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

        WebElement txt = driver.findElement(By.id("message"));
        boolean txtConfirmation = txt.isDisplayed();
        System.out.println("Text \"It's gone\" is displayed: " + txtConfirmation);

        WebElement enableButton = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Disable']")));

        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        if (textBox.isEnabled()) {

            textBox.sendKeys("Syntax");
            System.out.println("Text box is enabled!");
        }
        WebElement disableButton = driver.findElement(By.xpath("//button[text()='Disable']"));
        disableButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enable']")));
        if (!textBox.isEnabled()) {
            System.out.println("Text box is disabled");
        }
        driver.quit();
    }

}
