package com.Selenium_for_Testing;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class Test_ApplyNow {
    //This test check the functionality of apply Now.
    //It will help enter the details

    public static void main(String[] args) {

        // Create an instance of the driver
        System.setProperty("webdriver.opera.driver", "C:/Users/fatih/Desktop/Java/operadriver_win64/operadriver.exe");
        WebDriver driver = new OperaDriver();

        // Navigate to a web page
        String baseUrl = "https://www.na.edu/";
        driver.get(baseUrl);

        // Finding the element
        WebElement applynow = driver.findElement(By.id("menu-item-654"));
        applynow.click();

    }

    @Test
    public void admission() {
        // Create an instance of the driver
        System.setProperty("webdriver.opera.driver", "C:/Users/fatih/Desktop/Java/operadriver_win64/operadriver.exe");
        WebDriver driver = new OperaDriver();

        // Navigate to a web page
        String baseUrl = "https://apply.na.edu/admission";
        driver.get(baseUrl);

        // Finding the element
        WebElement apply = driver.findElement(By.xpath("//a[@href='/admission/register']"));
        apply.click();
    }

    @Test
    public void register() {
        // Create an instance of the driver
        System.setProperty("webdriver.opera.driver", "C:/Users/fatih/Desktop/Java/operadriver_win64/operadriver.exe");
        WebDriver driver = new OperaDriver();

        // Navigate to a web page
        String baseUrl = "https://apply.na.edu/admission/register";
        driver.get(baseUrl);

        // Finding the elements
        WebElement fullname = driver.findElement(By.xpath("//input[@id='user_fullname']"));
        WebElement email = driver.findElement(By.id("user_username"));
        WebElement pswd1 = driver.findElement(By.id("user_plainPassword_first"));
        WebElement pswd2 = driver.findElement(By.id("user_plainPassword_second"));
        WebElement checkbox1 = driver.findElement(By.id("user_subscribenews"));
        WebElement checkbox2 = driver.findElement(By.id("user_termsaccepted"));
        WebElement signup = driver.findElement(By.id("btnSubmitSignUp"));

        // Sending text to the elements
        fullname.click();
        fullname.sendKeys("fatih sis");
        email.click();
        email.sendKeys("fsis@na.edu");
        pswd1.click();
        pswd1.sendKeys("fakepassword");
        pswd2.click();
        pswd2.sendKeys("fakepassword");
        checkbox1.click();
        checkbox2.click();
        signup.click();
    }

}