package com.Selenium_for_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

public class Test_Search {
    //This test check the functionality of the Search Bar.
    //It will type Texas in uppercase and highlightedit and Search it.

    public static void main(String[] args) {
        // Create an instance of the driver
        System.setProperty("webdriver.opera.driver", "C:/Users/fatih/Desktop/Java/operadriver_win64/operadriver.exe");
        WebDriver driver = new OperaDriver();

        // Navigate to a web page
        String baseUrl = "https://www.na.edu";

        driver.get(baseUrl);
        WebElement search = driver.findElement(By.name("s"));
        WebElement searchbutton = driver.findElement(By.className("ubermenu-search-submit"));

        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(search)
                .click()
                .keyDown(search, Keys.SHIFT)
                .sendKeys(search, "texas")
                .keyUp(search, Keys.SHIFT)
                .doubleClick(search)
         //       .contextClick()
                .build();

        seriesOfActions.perform();
        searchbutton.click();

    }
}
