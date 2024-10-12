package com.example.HandleWebElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlertUsingExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // normal alert with OK button
        driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();

        Thread.sleep(3000);
        Alert altName = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(altName.getText());
        altName.accept();

        Thread.sleep(3000);

    }
}
