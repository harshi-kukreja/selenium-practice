package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        //launch browser
        WebDriver driver= new ChromeDriver();

        //open url
        driver.get("https://www.tutorialspoint.com/selenium/selenium_environment_setup.htm");

        //get title of the page
        System.out.println( "Title:" +driver.getTitle() );

        //get current url of the page
        System.out.println("Current url:" +driver.getCurrentUrl());

        //get PageSource of the Page
        System.out.println(driver.getPageSource());

        //close browser
        driver.close();
    }
}
