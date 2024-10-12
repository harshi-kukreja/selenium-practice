package com.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXpath {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        //open url
        driver.get("https://www.amazon.in/");
        //maximize the window
        driver.manage().window().maximize();

        //locate the web element by absolute xpath
        //driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/div/input")).sendKeys("iphone 15");

        //locate the web element by relative xpath with single attribute
        //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 16");

        //locate the web element by relative xpath with multiple attributes
        //driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"][@class=\"nav-input nav-progressive-attribute\"]")).sendKeys("watch");

        //locate the web element by xpath (AND)
        //driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\" and @class=\"nav-input nav-progressive-attribute\"]")).sendKeys("watch");

        //if one attribute is not correct
        //driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\" and @class=\"nav-input nav-progressive-attribut\"]")).sendKeys("watch");

        //locate the web element by xpath (OR)
        //driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\" or @class=\"nav-input nav-progressive-attribute\"]")).sendKeys("watch");

        //if one attribute is not correct
        //driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\" or @class=\"nav-input nav-progressive-attribut\"]")).sendKeys("watch");

        //locate the web element by xpath ( text() ) --link text
        //driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
        //locate the web element by xpath ( text() ) --inner text
        //System.out.println(driver.findElement(By.xpath("//*[text()='Minimum 50% off | Home, kitchen & more']")).getText());

        //Handling dynamic attributes (contains / starts-with)

        //locate the web element by xpath (contains)
        //driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("saree");

        //locate the web element by xpath (starts-with)
        //driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]")).sendKeys("toy");

        //locate the web element by Chained xpath
        driver.findElement(By.xpath("//a[@aria-label=\"Kitchen appliance\"]/div/img")).click();
    }
}
