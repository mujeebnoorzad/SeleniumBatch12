package com.company.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxDemo {
    public static String url="https://syntaxprojects.com/basic-checkbox-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        List<WebElement> optionCheckBoxs=driver.findElements(By.cssSelector("input[class='cb1-element']"));
       int size=optionCheckBoxs.size();
        System.out.println(size);

        for(WebElement option:optionCheckBoxs){

           String checkBoxs=option.getAttribute("value");

           if (checkBoxs.equals("Option 2")){
               option.click();
               break;
           }
        }

    }
}
