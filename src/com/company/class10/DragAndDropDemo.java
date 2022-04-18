package com.company.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {
    public static String url = " https://jqueryui.com/droppable/";

    public static <WebELement> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        driver.switchTo().frame(0);

        WebElement dragable= driver.findElement(By.id("draggable"));
        WebElement dropable=driver.findElement(By.id("droppable"));

        Actions action=new Actions(driver);
        //action.dragAndDrop(dragable,dropable).perform();
        action.clickAndHold(dragable).moveToElement(dropable).release().build().perform();

    }
}