package com.syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.

         */
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjjwK7owuT2AhVECc0KHa7sAyUQPAgI");
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement element= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        element.sendKeys("Admin");
        WebElement password=driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
        WebElement login=driver.findElement(new By.ByCssSelector("input[id='btnLogin']"));
       login.click();
       WebElement SyntaxLogo=driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));

        System.out.println(SyntaxLogo.isDisplayed());
        driver.close();


    }
}
