package com.example.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDragAndDrop {
        public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();

            driver.get("https://jqueryui.com/droppable/");
            driver.manage().window().maximize();

            WebElement Fname=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
            driver.switchTo().frame(Fname);

            WebElement src= driver.findElement(By.id("draggable"));

            WebElement target= driver.findElement(By.id("droppable"));

            Actions obj= new Actions(driver);
            //obj.dragAndDrop(src,target).perform();
            obj.clickAndHold(src).moveToElement(target).release().perform();
        }
    }

