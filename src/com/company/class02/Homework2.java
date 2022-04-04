package com.company.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");

       driver.findElement(By.partialLinkText("Create new account")).click();
       Thread.sleep(2000);
       WebElement fristname= driver.findElement(By.name("firstname"));
       fristname.sendKeys("jan");
       WebElement lastname=driver.findElement(By.name("lastname"));
       lastname.sendKeys("khan");
       WebElement email=driver.findElement(By.name("reg_email__"));
       email.sendKeys("mujeeb@gmail.com");
        WebElement reemail=driver.findElement(By.name("reg_email_confirmation__"));
        reemail.sendKeys("mujeeb@gmail.com");
        WebElement newpassword=driver.findElement(By.id("password_step_input"));
        newpassword.sendKeys("12345678");
        WebElement birthdaymonth=driver.findElement(By.name("birthday_month"));
        birthdaymonth.sendKeys("Mar");
        WebElement birthdayday=driver.findElement(By.name("birthday_day"));
        birthdayday.sendKeys("18");
        WebElement birthdayear=driver.findElement(By.name("birthday_year"));
        birthdayear.sendKeys("2000");
        WebElement gender=driver.findElement(By.name("sex"));
      gender.sendKeys("Male");
        driver.findElement(By.partialLinkText("websubmit")).click();
          driver.quit();


    }

}
