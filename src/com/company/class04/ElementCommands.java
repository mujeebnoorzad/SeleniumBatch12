package com.company.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Form");
       WebElement mariedRaidoButton= driver.findElement(By.xpath("(//input[@name='optradio'])[1]"));

       boolean isMarried=mariedRaidoButton.isEnabled();
        System.out.println( isMarried);

        if(!isMarried) {
            System.out.println("not Enabled");
        }else{
            System.out.println("Enalble");
            boolean isMarriedDisplayed=mariedRaidoButton.isDisplayed();
            System.out.println(isMarriedDisplayed);

            boolean isMarriedSelected=mariedRaidoButton.isSelected();
            System.out.println("Before chlicking"+isMarriedSelected);
            mariedRaidoButton.click();
            isMarriedSelected=mariedRaidoButton.isSelected();
            System.out.println("After chlicking"+isMarriedSelected);

            driver.quit();
        }
    }
}
