package com.company.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//Go to ebay.com
       // get all the categories and print them in the console
       // select Computers/Tables & Networking
       // click on search
       // verify the header
public class Task3 {
    public static String url="https://www.ebay.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categories= driver.findElement(By.cssSelector("select[id='gh-cat']"));
        Select select=new Select(categories);
        List<WebElement> options=select.getOptions();

        for(WebElement option:options) {

            System.out.println(option.getText());
        }
        select.selectByValue("58058");
        WebElement search= driver.findElement(By.cssSelector("select[name='_sacat']"));
        search.click();
        Thread.sleep(1000);

        if (driver.getTitle().equals("select Computers/Tables & Networking")){
            System.out.println("title correct");
        }else{
            System.out.println("title not correct");
        }
        driver.quit();
        }
    }

