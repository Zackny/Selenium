package com.syntax.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    /**
     * click on buttons and open new windows (tabs)
     * switch to windows and perform different actions
     */
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainHandle=driver.getWindowHandle();
        WebElement igButton=driver.findElement(By.linkText("Follow On Instagram"));
        WebElement ifButton=driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton=driver.findElement(By.linkText("Follow Instagram & Facebook"));

        igButton.click();
        ifButton.click();
        igAndFbButton.click();

       Set<String> allWindowHandles= driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> it=allWindowHandles.iterator();
        while(it.hasNext()){//start itereting through the handles
            String handle=it.next();//get a next handle
            if(!mainHandle.equals(handle)){//set a condition
                driver.switchTo().window(handle);//switch to a window which is not aqual to main page handle
                //driver.menage().window().maximaize();
                String title=driver.getTitle();
                System.out.println(title);
                driver.close();

            }
        }
       driver.switchTo().window(mainHandle);
        igButton.click();
        driver.close();

    }
}
