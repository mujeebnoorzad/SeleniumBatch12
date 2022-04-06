package com.company.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvanceWindowHandling {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        String mainPageHandle=driver.getWindowHandle();
        WebElement igButton= driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton= driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndButton= driver.findElement(By.linkText("Follow Instagram & Facebook"));
        igButton.click();
        fbButton.click();
        igAndButton.click();

        Set<String> allWindowHandle=driver.getWindowHandles();
        System.out.println(allWindowHandle.size());

       Iterator<String> it=allWindowHandle.iterator();
       while(it.hasNext()){
           String handle=it.next();
           if(!mainPageHandle.equals(handle)) {
               driver.switchTo().window(handle);
               String title = driver.getTitle();
               System.out.println(title);
               driver.close();

           }

       }
       driver.switchTo().window(mainPageHandle);
       igAndButton.click();

    }
}