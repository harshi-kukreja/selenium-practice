package com.example.KeyboardActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardSingleKey {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/key_presses");
        driver.manage().window().maximize();

        Actions obj = new Actions(driver);

        obj.sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);

        obj.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(3000);

        obj.sendKeys(Keys.BACK_SPACE).perform();
        Thread.sleep(3000);

        obj.sendKeys(Keys.ARROW_LEFT).perform();

    }
}
