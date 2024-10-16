package com.example.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionRightClick {
        public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();

            driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
            driver.manage().window().maximize();

            WebElement btn= driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));

            Actions obj= new Actions(driver);
            obj.contextClick(btn).perform();
        }
    }
