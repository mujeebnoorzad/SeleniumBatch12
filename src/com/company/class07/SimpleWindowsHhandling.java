package com.company.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowsHhandling {
    public static String url = "https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();// get window handle for the main page
        System.out.println(mainPageHandle);
        WebElement helpLink=driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles=driver.getWindowHandles();// store all the handle in a set
        System.out.println(allWindowHandles.size());

        Iterator<String> it=allWindowHandles.iterator();// have an iterator through the handles
        mainPageHandle=it.next();// take the first step and assign the main handle
        String childHandle=it.next();// take the second step and have a child handle
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(childHandle);

        driver.close();
        driver.switchTo().window(mainPageHandle);
        helpLink.click();


    }
}
