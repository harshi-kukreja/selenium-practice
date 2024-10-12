package com.example.HandleWebElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertsUsingSwitch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // normal alert with OK button
        driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();

        Thread.sleep(3000);
        Alert altName=driver.switchTo().alert();
        System.out.println(altName.getText());
        altName.accept();

        Thread.sleep(3000);

        //confirmation alert with ok and cancel button
        driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        Thread.sleep(3000);

        //confirmation alert with ok and cancel button
        driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
        Thread.sleep(3000);

        driver.switchTo().alert().dismiss();

        //prompt alert
        driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
        Thread.sleep(3000);

        Alert promptAlert=driver.switchTo().alert();

        Thread.sleep(3000);
        promptAlert.sendKeys("Welcome");
        Thread.sleep(5000);
        promptAlert.accept();


    }
}
