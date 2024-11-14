package com.example.HandleWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class HandleCheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1. select specific checkbox

        //driver.findElement(By.xpath("//input[@id=\"monday\"]")).click();

        //2. select all checkboxes
/*
        List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class=\"form-check-input\"][@type=\"checkbox\"]"));
        for (WebElement cb: checkboxes){
            cb.click();
        }

        Thread.sleep(3000);

        //deselect all checkboxes

        for (WebElement cb: checkboxes){
            cb.click();
        }
*/

        //3. select first 3 checkboxes (total size - number of checkbox that we want to select = starting index)
//        List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class=\"form-check-input\"][@type=\"checkbox\"]"));
//
//        for (int i = 0; i < 3; i++) {
//            checkboxes.get(i).click();
//        }


        //4. select last 2 checkboxes

//        List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class=\"form-check-input\"][@type=\"checkbox\"]"));
//
//        for (int i = 5; i < checkboxes.size(); i++) {
//            checkboxes.get(i).click();
//        }


        //5. select multiple checkboxes and then unselect checkboxes based on condition
//        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\"][@type=\"checkbox\"]"));
//        for (WebElement cb : checkboxes) {
//            String checkboxName = cb.getAttribute("id");
//            //System.out.println(text);
//            if (checkboxName.equals("wednesday") || checkboxName.equals("sunday")) {
//                cb.click();
//            }
//        }
//
//        Thread.sleep(3000);

//        for(int i = 0; i < checkboxes.size(); i++) {
//            if (checkboxes.get(i).isSelected()) {
//                checkboxes.get(i).click();
//            }
//        }

        // select any 3 checkboxes randomly
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\"][@type=\"checkbox\"]"));
        Collections.shuffle(checkboxes, new Random());

        int count=0;
        for (WebElement cb : checkboxes) {

            if (count<3) {
                if (!cb.isSelected()) {
                    cb.click();
                }
                count++;
            }else {
                break;
            }
        }

        Thread.sleep(3000);
    }
}

