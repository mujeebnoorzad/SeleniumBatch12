package com.company.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
       http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
       click on leave
      --- click on leave list
      --- choose from "From calendar"
      --- choose from "To calendar"
       click only on cancelled and rejected checkboxes
       uncheck Pending Approval
       select IT support from DD
       click search
       quit the browser
        */
public class Task {
    public static String url = " http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static <WebELement> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //login actions
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();
        WebElement fromCalendar = driver.findElement(By.id("calFromDate"));
        fromCalendar.click();

        WebElement yearD= driver.findElement(By.className("ui-datepicker-year"));
        Select select=new Select(yearD);
        select.selectByVisibleText("1992");

        WebElement montD= driver.findElement(By.className("ui-datepicker-month"));
        Select select1=new Select(montD);
        select1.selectByVisibleText("Feb");

        List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class= 'ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement fromDate : fromDates) {
            String dateText = fromDate.getText();
            if (dateText.equals("3")) {
                fromDate.click();
                break;


            }
        }
        Thread.sleep(2000);
        WebElement calD= driver.findElement(By.id("calToDate"));
        calD.click();
       WebElement mDate= driver.findElement(By.className("ui-datepicker-month"));
     Select select2=new Select(mDate);
     select2.selectByVisibleText("Apr");

     List<WebElement> fromDs=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr/td"));
     for(WebElement fromD:fromDs){
         String dateText=fromD.getText();
         if (dateText.equals("13")){
             fromD.click();;
             break;
         }
     }
     Thread.sleep(2000);
     WebElement rejectedB=driver.findElement(By.xpath("//input[@value=\"-1\"]"));
     rejectedB.click();
     WebElement cancelledB= driver.findElement(By.xpath("//input[@value=\"0\"]"));
     cancelledB.click();
     WebElement pendingApprovalB=driver.findElement(By.xpath("//input[@value=\"1\"]"));
     pendingApprovalB.click();

     WebElement subU= driver.findElement(By.id("leaveList_cmbSubunit"));
     Select select3=new Select(subU);
     select3.selectByVisibleText("IT Support");

     WebElement searchB=driver.findElement(By.id("btnSearch"));
     searchB.click();

     driver.quit();

    }
       }










