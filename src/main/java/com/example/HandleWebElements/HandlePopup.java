package com.example.HandleWebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlePopup {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //driver.get("https://the-internet.herokuapp.com/basic_auth");

        //syntax (driver.get("https://username:pwd@the-internet.herokuapp.com/basic_auth");)
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    }
}
