package com.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocateByCSS_TagAndClass {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //open url
        driver.get("https://www.amazon.in/");
        //maximize the window
        driver.manage().window().maximize();
        //locate the web element by CSS selector(class)
//        WebElement SearchBox= driver.findElement(By.cssSelector(".nav-input"));
//        SearchBox.sendKeys("earphone");
        //locate the web element by CSS selector(Tag and class)
        driver.findElement(By.cssSelector("input.nav-input")).sendKeys("iphone15");
    }
}
