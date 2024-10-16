package com.example.MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseActionMouseHover {
        public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://demo.opencart.com/");
            driver.manage().window().maximize();

            WebElement desktop= driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
//                    (By.xpath("//ul[@class=\"nav navbar-nav\"]/li[1]/a"));

            WebElement mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
                    //(By.xpath("//ul[@class=\"nav navbar-nav\"]/li[1]/div//li[2]/a"));

            Actions obj= new Actions(driver);
            obj.moveToElement(desktop).moveToElement(mac).click().perform();

            /*
            driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        WebElement country=driver.findElement(By.xpath("//span[@class=\"nav-line-2\"]//div"));

        WebElement language= driver.findElement(By.xpath("//div[@id=\"icp-language-settings\"]/div[@class=\"a-row a-spacing-mini\"][2]//span[@class=\"a-label a-radio-label\"]"));

        Actions obj= new Actions(driver);
        obj.moveToElement(country).moveToElement(language).click().perform();
             */
        }
    }
