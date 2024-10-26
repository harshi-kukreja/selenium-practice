package com.example.Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class PortionScreenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=cms/demo");
        driver.manage().window().maximize();

        WebElement ele=driver.findElement(By.xpath("//div[@class=\"col-sm-6 border-right\"]//a[@class=\"box-overlay\"]"));
        File src=ele.getScreenshotAs(OutputType.FILE);
        File trg=new File(".\\Screenshot\\Portion.png");
        FileUtils.copyFile(src,trg);

    }
}
