package com.example.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class getMethods {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //get(url)
        driver.get("https://testautomationpractice.blogspot.com/");

        //getTitle()
        System.out.println("Title of the page:" +driver.getTitle());

        //getCurrentUrl()
        System.out.println("current url of the page:" +driver.getCurrentUrl());

        //getPageSource()
       // System.out.println("Source code of the page:" +driver.getPageSource());

        //getWindowHandle()
        String windowId= driver.getWindowHandle();
        System.out.println("window id of the single browser window: " +windowId);

        //getWindowHandles()
        driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
        Set <String> MultipleWinId= driver.getWindowHandles();
        System.out.println("Windows id of the multiple open browsers: " +MultipleWinId);

    }
}
