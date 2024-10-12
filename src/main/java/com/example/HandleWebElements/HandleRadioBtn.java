package com.example.HandleWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioBtn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement Mradiobtn=driver.findElement(By.xpath("//input[@class=\"form-check-input\" and @type=\"radio\" and @value=\"male\"]"));
        Mradiobtn.click();

        Thread.sleep(300);

        WebElement Fradiobtn= driver.findElement(By.xpath("//input[@class=\"form-check-input\" and @type=\"radio\" and @value=\"female\"]"));
        Fradiobtn.click();

        Thread.sleep(3000);
        if(Fradiobtn.isEnabled()){
            Mradiobtn.click();
        }
    }
}
