package com.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCSS_TagClassAttribute {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //open url
        driver.get("https://www.amazon.in/");
        //maximize the window
        driver.manage().window().maximize();
        //locate the web element by CSS selector(Tag, class and attribute)
        driver.findElement(By.cssSelector("input.nav-input[type=\"text\"]")).sendKeys("earphone");
        //locate the web element by CSS selector(class and attribute)
        driver.findElement(By.cssSelector(".nav-input[type='submit']")).click();
    }
}
