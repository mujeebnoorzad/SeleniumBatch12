package com.company.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//navigate to http://www.uitestpractice.com/Students/Contact
//click on the link
//get text
//print out in the console
public class Task2 {
    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement ajaxLink=driver.findElement(By.linkText("This is a Ajax link"));
        ajaxLink.click();

        WebElement text= driver.findElement(By.xpath("//div[@id='Result']"));
        String resultText=text.getText();
        System.out.println(resultText);

    }
}