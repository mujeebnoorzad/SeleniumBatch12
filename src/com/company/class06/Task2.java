package com.company.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Go to https://syntaxprojects.com/javascript-alert-box-demo.php
//click on each button and handle the alert accordingly
public class Task2 {
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement alertBox=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alertBox.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        Thread.sleep(2000);
        WebElement confirmBox=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmBox.click();
        Alert alert1=driver.switchTo().alert();
        alert1.accept();

        Thread.sleep(2000);
        WebElement promptBox=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        promptBox.click();
        Alert alert2=driver.switchTo().alert();
        alert2.accept();

        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.quit();

    }
}
