package com.example.Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class WebElementScreenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=cms/demo");
        driver.manage().window().maximize();

        WebElement logo= driver.findElement(By.xpath("//img[@src=\"application/view/image/icon/opencart-logo.png\"]"));

        File src=logo.getScreenshotAs(OutputType.FILE);
        File trg= new File(".\\PortionScreenshot\\logo.png");
        FileUtils.copyFile(src,trg);

    }
}
