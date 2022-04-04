package com.company.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class review01 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement femalebtn=driver.findElement(By.xpath("//input[@name='optradio'and@value='Female']"));
        // check if the radio btn is enabled
        System.out.println("the female radio btn is enabled"+femalebtn.isEnabled());
        // check if the radio btn isDisplayed
        System.out.println("the female radio btn is displayed"+femalebtn.isDisplayed());
        // check if its select or not
        System.out.println("the female radio btn is select"+femalebtn.isSelected());

        if(!femalebtn.isSelected()){
            femalebtn.click();
        }
        System.out.println("the female radio btn is select"+femalebtn.isSelected());

        //to get all the links in the current webpage nad print their text
        List<WebElement> links=driver.findElements(By.tagName("a"));
        for(WebElement link:links){
            String name=link.getText();
            if(!name.isEmpty()){
                System.out.println(name);
            }
        }
    }
}
