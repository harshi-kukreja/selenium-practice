package com.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateByClassName {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        //open url
        driver.get("https://www.amazon.in/");
        //maximize the window
        driver.manage().window().maximize();
        //locate the web element by class name
        List<WebElement> TotalValueWithThisClassName= driver.findElements(By.className("nav-progressive-content"));
        System.out.println("Total values located with this class name: " +TotalValueWithThisClassName.size());

    }
}
