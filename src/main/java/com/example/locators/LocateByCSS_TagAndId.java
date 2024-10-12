package com.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCSS_TagAndId {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //open url
        driver.get("https://www.amazon.in/");
        //maximize the window
        driver.manage().window().maximize();
        //locate the web element by CSS selector(Id)
        driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).click();
        //locate the web element by CSS selector(Tag and Id)
        driver.findElement(By.cssSelector("input#ap_email")).sendKeys("7404885085");

    }
}
