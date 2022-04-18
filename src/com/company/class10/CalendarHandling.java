package com.company.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarHandling {
    public static String url = " https://www.delta.com/";

    public static <WebELement> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        WebElement calButton = driver.findElement(By.id("calReturnLabelCont"));
        calButton.click();
        WebElement nextB = driver.findElement(By.xpath("//span[text()=\"Next\"]"));
        WebElement dMonth = driver.findElement(By.className("dl-datepicker-month-0"));
        String dMonthText = dMonth.getText();

        while (!dMonthText.equals("August")) {
            nextB.click();
            dMonthText = dMonth.getText();
        }
        List<WebElement> deparD = driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
        for (WebElement deparDs: deparD) {
            if (deparDs.getText().equals("13")) {
                deparDs.click();
                break;
            }
        }
        WebElement rMonth= driver.findElement(By.className("dl-datepicker-month-1"));
        String rMonthNext=rMonth.getText();

        while(!rMonthNext.equals("November")){
            nextB.click();
            rMonthNext=rMonth.getText();
        }
        List<WebElement> returnDs=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));
        for(WebElement returnD:returnDs){
            if(returnD.getText().equals("30")){
                returnD.click();
                break;
            }
        }
        WebElement doneB= driver.findElement(By.className("donebutton"));
        doneB.click();

    }
}
