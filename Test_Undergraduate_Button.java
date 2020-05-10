package com.Selenium_for_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class Test_Undergraduate_Button {
    //This test check the functionality of the Undergraduate Calendar button transparency when you hover the mouse.
    //The output after running, it might be transparent before the mouse move.

    public static void main(String[] args) {
        // Create an instance of the driver
        System.setProperty("webdriver.opera.driver", "C:/Users/fatih/Desktop/Java/operadriver_win64/operadriver.exe");
        WebDriver driver = new OperaDriver();

        // Navigate to a web page
        String baseUrl = "https://www.na.edu/academics/academic-calendar/";
        driver.get(baseUrl);

        //   WebElement link_Academics = driver.findElement(By.linkText("Academics"));
        WebElement link_grdcal = driver.findElement(By.id("fusion-tab-undergraduatecalendar"));

        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_grdcal)
                .build();
        String bgColor = link_grdcal.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);
        mouseOverHome.perform();
        bgColor = link_grdcal.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);

    }

}
