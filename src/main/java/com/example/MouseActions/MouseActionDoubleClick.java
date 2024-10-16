package com.example.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDoubleClick {
        public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();

            driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
            driver.manage().window().maximize();

            driver.switchTo().frame("iframeResult");

            WebElement field1= driver.findElement(By.xpath("//input[@id=\"field1\"]"));
            field1.clear();
            field1.sendKeys("Double Click");

            WebElement field2= driver.findElement(By.xpath("//input[@id=\"field2\"]"));
            field2.clear();
            field2.sendKeys("Double Click");

            WebElement btn= driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));

            Actions obj= new Actions(driver);
            obj.doubleClick(btn).perform();
        }
    }
