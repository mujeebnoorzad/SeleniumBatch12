package com.company.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

//Go to aa.com/homePage.do
//select depart date
//select return date
//select destination
//click on search
//quit the browser
public class Task {
    public static String url = "https://www.aa.com/homePage.do";

    public static <WebELement> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        Thread.sleep(2000);
        WebElement departB = driver.findElement(By.className("ui-datepicker-trigger"));
        departB.click();
        WebElement nextB = driver.findElement(By.xpath("//a[@data-handler=\"next\"]"));
        WebElement dMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]"));
        String dMonthText= dMonth.getText();

        while(!dMonthText.equals("June")) {
            nextB.click();
            dMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]"));
            dMonthText= dMonth.getText();
           nextB = driver.findElement(By.xpath("//a[@data-handler=\"next\"]"));


        }
        List<WebElement> deparD = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr/td"));
        for (WebElement deparDs: deparD) {
            if (deparDs.getText().equals("13")) {
                deparDs.click();
                break;
            }
        }

        WebElement returnB = driver.findElement(By.xpath("(//button[@class=\"ui-datepicker-trigger\"])[2]"));
        returnB.click();
        WebElement nextBtn = driver.findElement(By.xpath("//a[@data-handler=\"next\"]"));
        WebElement monthBtn = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]"));
        String monthBtnText=monthBtn.getText();

        while(!monthBtnText.equals("July")){
            nextBtn.click();
            monthBtn = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]"));
            monthBtnText=monthBtn.getText();
            nextBtn = driver.findElement(By.xpath("//a[@data-handler=\"next\"]"));
        }
        List<WebElement> returnDate = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tobody/tr/td"));
        for(WebElement returnDates:returnDate){
            if(returnDates.getText().equals("15")){
                returnDates.click();
                break;
            }

        }
        WebElement destination = driver.findElement(By.xpath("(//input[@name=\"destinationAirport\"])[1]"));
        destination.sendKeys("Afghistan", Keys.ENTER);
    }
}
