package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        // Set the correct path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.google.com");

        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}
