package com.Selenium_for_Testing;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class Test_RequestInfo {
    //This test check the functionality of request info.
    //It will help enter the details

    public static void main(String[] args) {
        // Create an instance of the driver
        System.setProperty("webdriver.opera.driver", "C:/Users/fatih/Desktop/Java/operadriver_win64/operadriver.exe");
        WebDriver driver = new OperaDriver();

        // Navigate to a web page
        String baseUrl = "https://www.na.edu/";
        driver.get(baseUrl);

        WebElement request = driver.findElement(By.xpath("//a[@href='/request-information/']"));
        request.click();

    }

    @Test
    public void request() {
        // Create an instance of the driver
        System.setProperty("webdriver.opera.driver", "C:/Users/fatih/Desktop/Java/operadriver_win64/operadriver.exe");
        WebDriver driver = new OperaDriver();

        // Navigate to a web page
        String baseUrl = "https://www.na.edu/request-information/";
        driver.get(baseUrl);

        WebElement Elmnt = driver.findElement(By.className("fusion-builder-row-2"));
        Actions actions = new Actions(driver);
        actions.moveToElement(Elmnt);
        actions.perform();


    }

}