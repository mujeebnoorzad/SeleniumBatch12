package com.company.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//HRMS blank password validation
//Navigate to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//Enter valid username and leave password field empty
//Click on login button
//Verify error message with text "Password cannot be empty" is displayed
public class HW2 {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static <WebELement> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("gfghfhf");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement beEmpty= driver.findElement(By.name("Submit"));
        if(!loginButton.isDisplayed()){
            System.out.println("Password is empty");
        }else{
            System.out.println("Password cannot be empty");
        }

    }
}