package com.syntax.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandleStaticWebTables {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id=table = 'task-table']/tbody/tr"));
        System.out.println(rowData.size());
        System.out.println("*****************************************");
        Iterator<WebElement> it = rowData.iterator();//creating iterator
        while (it.hasNext()) {
            WebElement row = it.next();//getting next element
            String rowText = row.getText();
            System.out.println(rowText);

        }

        System.out.println("***********************************");
        List<WebElement> colData = driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));
        System.out.println(colData.size());
        for(WebElement cd:colData){
          String text=  cd.getText();

            System.out.println(text);
        }


    }
}