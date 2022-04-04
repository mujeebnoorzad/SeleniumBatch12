package com.company.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
    public static String url="https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.partialLinkText("Create new account")).click();
        Thread.sleep(1000);
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
        Thread.sleep(1000);

        WebElement monthD= driver.findElement(By.id("month"));
        Select selectMonth=new Select(monthD);
        selectMonth.selectByVisibleText("Mar");

        WebElement dayD= driver.findElement(By.id("day"));
        Select selectDay=new Select(dayD);
        selectDay.selectByVisibleText("10");

        WebElement yearD=driver.findElement(By.id("year"));
        Select selectYear=new Select(yearD);
        selectYear.selectByVisibleText("2000");

        WebElement gender=driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
        gender.click();
        WebElement submit=driver.findElement(By.name("websubmit"));
        submit.click();

        driver.quit();
 }
}



