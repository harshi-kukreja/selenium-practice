package com.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByName {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        //open url
        driver.get("https://www.opencart.com/blog");
        //maximize the window
        driver.manage().window().maximize();
        //locate the web element by name
        driver.findElement(By.name("filter_search")).sendKeys("Cart");
    }
}
