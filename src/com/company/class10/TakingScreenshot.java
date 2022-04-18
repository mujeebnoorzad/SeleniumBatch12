package com.company.class10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenshot {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        WebElement username = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
        password.sendKeys("test");
        WebElement loginB = driver.findElement(By.className("button"));
        loginB.click();

        TakesScreenshot ts=(TakesScreenshot) driver;
        ts.getScreenshotAs(OutputType.FILE);
        File srcFile=ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(srcFile,new File("screenshots/SmartBear/adminLogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

