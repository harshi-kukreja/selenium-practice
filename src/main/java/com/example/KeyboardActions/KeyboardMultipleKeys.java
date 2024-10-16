package com.example.KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMultipleKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        WebElement TextBox1 = driver.findElement(By.id("inputText1"));
        WebElement TextBox2 = driver.findElement(By.id("inputText2"));

        //enter text in TextBox1
        TextBox1.sendKeys("Harshi");

        Actions obj = new Actions(driver);

        //select text from TextBox1 ctrl+A
        obj.keyDown(Keys.CONTROL);
        obj.sendKeys("a");
        obj.keyUp(Keys.CONTROL);
        obj.perform();

        // copy the selected text ctrl+c
        obj.keyDown(Keys.CONTROL);
        obj.sendKeys("c");
        obj.keyUp(Keys.CONTROL);
        obj.perform();

        //use Tab ket to shift to TextBox2
        obj.sendKeys(Keys.TAB);
        obj.perform();

        // paste the selected text ctrl+v
        obj.keyDown(Keys.CONTROL);
        obj.sendKeys("v");
        obj.keyUp(Keys.CONTROL);
        obj.perform();

        if (TextBox1.getAttribute("value").equals(TextBox2.getAttribute("value")))
            System.out.println("text copied");
        else
            System.out.println("text not copied");


    }
}
