package com.company.review03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);


        WebElement simpleAlert= driver.findElement(By.xpath("//button[@onclick=\"myAlertFunction()\"]"));
        simpleAlert.click();
        Alert SimpleAlert = driver.switchTo().alert(); // switch the focus to alert
        Thread.sleep(2000);

        WebElement jsAlert= driver.findElement(By.xpath("//button[@onclick=\"myConfirmFunction()\"]"));
        jsAlert.click();
        Thread.sleep(2000);
        driver.switchTo().alert();









    }
}