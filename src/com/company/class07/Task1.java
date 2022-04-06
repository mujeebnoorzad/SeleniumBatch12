package com.company.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

//Go to https://demoqa.com/browser-windows
//click on New Tab and print the text from new tab in the console
//click on New Window and print the text from new window in the console
//click on New Window Message and print the text from new window in the console
//Verify (compare) the titles for each page
//Print out the title of the all pages
public class Task1 {
    public static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();
        WebElement tabButton=driver.findElement(By.xpath("//button[@id='tabButton']"));
        WebElement windowButton= driver.findElement(By.xpath("//button[@id='windowButton']"));
        WebElement windowMsgButton=driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
        tabButton.click();
        System.out.println(tabButton);
        windowButton.click();
        System.out.println(windowButton);
        windowMsgButton.click();
        System.out.println(windowMsgButton);


        Set<String> allWindowHandle=driver.getWindowHandles();
        System.out.println(allWindowHandle.size());

        Iterator<String> it=allWindowHandle.iterator();
        while(it.hasNext()){
            String handle=it.next();

                String title = driver.getTitle();
                System.out.println(title);

            }
            driver.quit();

        }


    }

