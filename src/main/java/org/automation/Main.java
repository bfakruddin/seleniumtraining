package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//
//        WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys("Selenium");
//        element.submit();
//        driver.quit();

        System.setProperty("webdriver.gecko.driver", "/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/src/main/resources/drivers/geckodriver");
        WebDriver driver1 = new FirefoxDriver();

        driver1.get("https://www.google.com");
        WebElement element1 = driver1.findElement(By.name("qq"));
        element1.sendKeys("Tajmahal");
        element1.submit();
        driver1.quit();



    }
}