package com.company.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reviewCheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        WebElement checkbox1=driver.findElement(By.cssSelector("input#isAgeSelected"));
        System.out.println("the checkbox is selcted"+checkbox1.isSelected());
        checkbox1.click();
        Thread.sleep(2000);


    }
}
