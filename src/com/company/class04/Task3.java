package com.company.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//HRMS Application Negative Login:
//Open chrome browser
//Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
//Enter valid username
//Leave password field empty
//Click on login button
//Verify error message with text "Password cannot be empty" is displayed.
public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("");
        WebElement loginButton = driver.findElement(By.cssSelector("input.button"));
        loginButton.click();
        WebElement emptyPassword = driver.findElement(By.cssSelector("span#spanMessage"));
        if(emptyPassword.isDisplayed()){
            System.out.println("Password buttom cann't empty is dispalyed");
        }
        driver.quit();
    }
}