package com.example.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DropDownDatePicker {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //date to be select 9/Mar/2020
        String date = "9";

        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.findElement(By.xpath("//input[@id='dob']")).click();

        WebElement mon = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
        Select obj1 = new Select(mon);
        obj1.selectByVisibleText("Mar");

        Select obj2 = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        obj2.selectByVisibleText("2020");

        List<WebElement> dates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));

        for (WebElement ele : dates) {
            String dt = ele.getText();

            if (dt.equals(date)) {
                ele.click();
                break;
            }
        }
    }
}
