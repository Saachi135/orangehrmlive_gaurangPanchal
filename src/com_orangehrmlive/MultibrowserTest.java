package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultibrowserTest {
    static String browser = "Firefox";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }
        // Input Url
        driver.get(baseUrl);

        // we give implicit wait time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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



