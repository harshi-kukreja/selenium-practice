package com.example.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //this element is taking time to load
        //Thread.sleep(3000);

        WebElement username= wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[@placeholder=\"Username\"]")));
        username.sendKeys("Admin");
        //driver.findElement(By.xpath("//input[@placeholder=\"Nombre de usuario\"]")).sendKeys("Admin");

    }
}
