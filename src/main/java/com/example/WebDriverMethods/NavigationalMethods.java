package com.example.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //navigate().to()
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
        Thread.sleep(2000);

        //navigate().back()
        driver.navigate().back();
        Thread.sleep(2000);

        //navigate().forward()
        driver.navigate().forward();
        Thread.sleep(2000);

        //navigate().refresh()
        driver.navigate().refresh();


    }
}
