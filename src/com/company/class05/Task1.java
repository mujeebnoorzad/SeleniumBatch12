package com.company.class05;

       // TC 1: Facebook dropdown verification
//Open chrome browser
//Go to "https://www.facebook.com"
//click on create new account
//Verify:
//month dd has 12 month options
//day dd has 31 day options
//year dd has 115 year options
//Select your date of birth
//Quit browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {
    public static String url="https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        WebElement createNewAc=driver.findElement(By.linkText("Create new account"));
        createNewAc.click();
        Thread.sleep(1000);

        WebElement monthDD=driver.findElement(By.id("month"));
        Select selectM=new Select(monthDD);
        List<WebElement> optionM=selectM.getOptions();
        int sizeMonth=optionM.size();
        if(sizeMonth==12) {
            System.out.println("month dd has 12 month options");
        }else{
            System.out.println("month dd has not 12 month options"+sizeMonth);
        }
        WebElement dayDD= driver.findElement(By.id("day"));
        Select selectD=new Select(dayDD);
        List<WebElement> optionD=selectD.getOptions();
        int sizeDay=optionD.size();
        if(sizeDay==31) {
            System.out.println("day dd has 31 day options");

        }else{
            System.out.println("day dd has not 31 day options"+sizeDay);
        }
        WebElement yearDD= driver.findElement(By.id("year"));
        Select selectY=new Select(yearDD);
        List<WebElement> optionY= selectY.getOptions();
        int sizeYear=optionY.size();
        if(sizeYear==15){
            System.out.println("year dd has 115 year options");
        }else{
            System.out.println("year dd has not 115 year options"+sizeYear);
        }
        selectM.selectByVisibleText("Feb");
        selectD.selectByIndex(3);
        selectY.selectByValue("1992");

        driver.quit();


    }
}
