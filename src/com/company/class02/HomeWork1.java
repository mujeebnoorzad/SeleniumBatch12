package com.company.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Mujeeb");
        driver.findElement(By.id("customer.lastName")).sendKeys("Noorzad");
        driver.findElement(By.id("customer.address.street")).sendKeys("3030 Freedom");
        driver.findElement(By.id("customer.address.city")).sendKeys("Sacramento");
        driver.findElement(By.id("customer.address.state")).sendKeys("CA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("95666");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-23-2222");
        driver.findElement(By.id("customer.username")).sendKeys("mujeebKhan");
        driver.findElement(By.id("customer.password")).sendKeys("123456");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456");
        driver.findElement(By.className("button")).click();
        driver.quit();


    }
}
