package com.example.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 1. go to this site
        driver.get("https://testautomationpractice.blogspot.com/");

        // 2. provide some string and search for it
        driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("selenium");
        driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]")).click();

        // 3. click on each link using for loop
        List <WebElement> links= driver.findElements(By.xpath("//div[@class=\"wikipedia-search-results\"]//a"));
        System.out.println();
        // 4. get window's id for every browser window

        // 5. close specific browser window

    }
}
