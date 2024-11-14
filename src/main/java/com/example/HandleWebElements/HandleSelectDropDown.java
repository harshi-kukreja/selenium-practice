package com.example.HandleWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");

        WebElement drp=driver.findElement(By.xpath("//select"));

        Select obj=new Select(drp);
        obj.selectByVisibleText("India");

        Thread.sleep(3000);

        obj.selectByValue("ATA");
        Thread.sleep(3000);

        obj.selectByIndex(9);
        Thread.sleep(3000);

        // select option from dropdown without using select class methods

        for (WebElement option : obj.getOptions()) {
           if( option.getText().equals("Cuba")){
               option.click();
               break;
           }
        }

    }
}
