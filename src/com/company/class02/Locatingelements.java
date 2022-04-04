package com.company.class02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatingelements {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.findElement(By.id("email")).sendKeys("sytax@adfadf.com");
        driver.findElement(By.id("pass")).sendKeys("whatever");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.partialLinkText("Forget")).click();
       driver.quit();

    }
}
