package com.Selenium_for_Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class Test_broken_url {

    public static void main(String[] args) {
        // Create an instance of the driver
        System.setProperty("webdriver.opera.driver", "C:/Users/fatih/Desktop/Java/operadriver_win64/operadriver.exe");
        WebDriver driver = new OperaDriver();

        // Navigate to a web page
        String homePage = "https://www.na.edu/";
        driver.get(homePage);

        // Creating the code for the broken urls
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;

        List<WebElement> links = driver.findElements(By.tagName("a"));

        Iterator<WebElement> it = links.iterator();

        while(it.hasNext()){
            url = it.next().getAttribute("href");
            System.out.println(url);

            // checking if URL in <a> tag or empty
            if(url == null || url.isEmpty()){
                System.out.println("URL is not related with <a> tag or it is empty");
                continue;
            }

            // checking if URL's domain is different
            if(!url.startsWith(homePage)){
                System.out.println("URL's domain is different, skipping it.");
                continue;
            }

            // checking the links broken or valid
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                huc.setRequestMethod("HEAD");
                huc.connect();
                respCode = huc.getResponseCode();
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }
}