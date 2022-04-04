package com.company.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenicationAlert {
    public static String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
                               //username:password@
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
}