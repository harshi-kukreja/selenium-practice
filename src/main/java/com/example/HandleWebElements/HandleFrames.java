package com.example.HandleWebElements;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleFrames {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");

        //Frame1

        WebElement frame1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Frame1");

        driver.switchTo().defaultContent();
        //Frame2

        WebElement frame2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Frame2");

        driver.switchTo().defaultContent();

        //Frame3

        WebElement frame3=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Frame3");

        //iframe

        //WebElement iframe= driver.findElement(By.xpath("//form[@id=\"mG61Hd\"]"));
        driver.switchTo().frame(0);

        WebElement rbtn= driver.findElement(By.xpath("//div[@id=\"i8\"]//div[@class=\"rseUEf nQOrEb\"]"));

        //when we are directly performing actions on inner frame, getting ElementNotInteractableException
        // to resolve this used javascript executor
        JavascriptExecutor obj= (JavascriptExecutor)driver;
        obj.executeScript("arguments[0].click();",rbtn);

        WebElement cbox=driver.findElement(By.xpath("//div[@id=\"i19\"]"));
        obj.executeScript("arguments[0].click();",cbox);

        driver.switchTo().defaultContent();
    }
}
