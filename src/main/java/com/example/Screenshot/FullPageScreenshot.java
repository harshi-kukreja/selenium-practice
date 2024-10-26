package com.example.Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class FullPageScreenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=cms/demo");
        driver.manage().window().maximize();

        TakesScreenshot ts=(TakesScreenshot) driver;
        File src= ts.getScreenshotAs(OutputType.FILE);
        File trg=new File(".\\PortionScreenshot\\fullPageScreenshot.png");
        FileUtils.copyFile(src,trg);

    }
}
