package com.company.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommonDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();



    }
}
