package com.example.HandleWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaticWebTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/ecosystem/");

        // 1. find rows
        int rows = driver.findElements(By.xpath("//table[@class=\"table\"]//tr")).size();
        System.out.println("total rows:" + rows);

        // 2. find cols
        int cols = driver.findElements(By.xpath("//table[@class=\"table\"]/thead/tr/th")).size();
        System.out.println("total cols:" + cols);

        // 3. retrieve specific row and col data

        String data = driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr[2]/td[1]")).getText();
        System.out.println(data);

        // 4. retrieve all data from the table

//        for (int r=1; r<=rows; r++)
//        {
//            for (int c=1; c<=cols; c++){
//             String tableData= driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
//                System.out.println(tableData);
//            }
//        }

        // 5. print author of javascript

//        for (int r = 1; r <= rows; r++) {
            String language = driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr[3]/td[1]")).getText();

            if (language.equals("JavaScript")) {
                String author = driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr[3]/td[2]")).getText();
                System.out.println(language);
                System.out.println(author);
            }
        }
    }
//    }

