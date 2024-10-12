package com.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByPartialLinkText {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        //open url
        driver.get("https://www.amazon.in/");
        //maximize the window
        driver.manage().window().maximize();
        //locate the web element by link text
        driver.findElement(By.partialLinkText("Today's")).click();
    }
}
