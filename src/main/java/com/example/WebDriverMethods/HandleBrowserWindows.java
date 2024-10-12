package com.example.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class HandleBrowserWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.amazon.in/");
        driver.get("https://www.flipkart.com/");

        ArrayList<String> windowId= new ArrayList<>(driver.getWindowHandles());
        // Set<String> windowId= driver.getWindowHandles();
        for(String id:windowId){
            Thread.sleep(3000);
            driver.switchTo().window(id);
        }
        Thread.sleep(3000);
        driver.switchTo().window(windowId.get(0));;

    }
}
