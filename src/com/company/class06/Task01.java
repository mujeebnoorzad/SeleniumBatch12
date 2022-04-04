package com.company.class06;
//Navigate to https://syntaxprojects.com/bootstrap-iframe.php
//verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
//verify enroll today button is enabled

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement headerText=driver.findElement(By.cssSelector("span.gum"));
        if(headerText.isDisplayed()){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
        Thread.sleep(3000);
        driver.switchTo().frame("FrameTwo");
        WebElement enrollB=driver.findElement(By.xpath("//div[text()='Enroll today']"));
        if(enrollB.isEnabled()){
            System.out.println("enabled");
        }else{
            System.out.println("disnabled");
        }
        Thread.sleep(3000);

        driver.quit();

    }
}