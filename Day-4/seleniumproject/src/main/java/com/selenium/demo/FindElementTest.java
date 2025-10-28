package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementTest {
    public static void main(String[] args) {
        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Find the search box and type text
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver ");
        searchBox.sendKeys(Keys.ENTER);

        // Wait for a few seconds to see the search results
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser
        driver.quit();
    }
}
