package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        // Lunch the Chrome Browser
        // 1 setup Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open the Url into Browser
        driver.get(baseUrl);

        // Printing the title of the page
        System.out.println("Title of the page: " + driver.getTitle());

        // Printing the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Printing the page source
        System.out.println("Page Source: " + driver.getPageSource());

        // Enter the email to email field
        // get element from Browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // get element from username
        WebElement username = driver.findElement(By.name("username"));
        // find username and input data
        username.sendKeys("Gaurang");

        // finding element for password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("ABCDEFG"); // password input in password field

        driver.close(); // closing Browser

    }
}
