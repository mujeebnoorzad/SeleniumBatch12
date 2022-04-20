package com.company.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class RightAndDouble {
    public static String url = "https://demo.guru99.com/test/simple_context_menu.html";

    public static <WebELement> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);


        WebElement rightClick=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
        Actions action=new Actions(driver);
        action.contextClick(rightClick).perform();

        WebElement editOptiom= driver.findElement(By.xpath("//span[text()=\"Edit\"]"));
        //editOptiom.click();
        action.click(editOptiom).perform();
        Thread.sleep(1000);

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement doubleBtn= driver.findElement(By.xpath("//button[contains(text(),\"Double-Click\")]"));
        action.doubleClick(doubleBtn).perform();
        System.out.println(alert.getText());
        alert.accept();


    }
}