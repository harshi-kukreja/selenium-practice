package com.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateByTagName {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        //open url
        driver.get("https://www.amazon.in/");
        //maximize the window
        driver.manage().window().maximize();
        //locate the web element by Tag Name
        //if we want to locate all the web elements with same tag name
        List<WebElement> TotalLinks= driver.findElements(By.tagName("a"));
        System.out.println("Total number of links present on the web page: " +TotalLinks.size());

        List<WebElement> TotalImages= driver.findElements(By.tagName("img"));
        System.out.println("Total number of images present on the web page: " +TotalImages.size());
    }
}
