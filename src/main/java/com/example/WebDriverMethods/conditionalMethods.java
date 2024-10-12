package com.example.WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethods {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //isDisplayed()
        WebElement displayStatus =driver.findElement(By.xpath("//div[@class=\"widget Wikipedia\"]/h2"));
        System.out.println("display status:" +displayStatus.isDisplayed());

        //isEnabled()
        WebElement enableStatus = driver.findElement(By.xpath("//input[@id=\"phone\"]"));
        System.out.println("text box enable status:" +enableStatus.isEnabled());

        //isSelected()
        WebElement maleRadioButton= driver.findElement(By.xpath("//input[@id=\"male\"]"));
        System.out.println("before selecting male radio button:" +maleRadioButton.isSelected());

        WebElement femaleRadioButton= driver.findElement(By.xpath("//input[@id=\"female\"]"));
        System.out.println("before selecting female radio button:" +femaleRadioButton.isSelected());

        maleRadioButton.click();
        System.out.println("after selecting male radio button:" +maleRadioButton.isSelected());
        System.out.println("female radio button:" +femaleRadioButton.isSelected());

        WebElement checkbox= driver.findElement(By.xpath("//div[@class=\"form-group\"]/div[4]/input"));
        System.out.println("before selecting checkbox:" +checkbox.isSelected());

        checkbox.click();
        System.out.println("after selecting checkbox:" +checkbox.isSelected());
    }
}
