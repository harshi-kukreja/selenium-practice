package com.example.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import static java.lang.Thread.sleep;

public class browserMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //get(url)
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
        Thread.sleep(2000);

        //driver.close();
        driver.quit();

    }
}
