package com.Selenium_for_Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class Test_Integration_Login {
    //This test create integration test to login with student Id and password.
    //I used my student ID but fakepassword.

    public static void main(String[] args) {
        // Create an instance of the driver
        System.setProperty("webdriver.opera.driver", "C:/Users/fatih/Desktop/Java/operadriver_win64/operadriver.exe");
        WebDriver driver = new OperaDriver();

    String baseUrl = "https://login.microsoftonline.com/common/oauth2/authorize?client_id=00000006-0000-0ff1-ce00-000000000000&response_mode=form_post&response_type=code+id_token&scope=openid+profile&state=OpenIdConnect.AuthenticationProperties%3dNLmFQNPqgKAnd5I_rZtVy16nd1-liNi-PQX-ZviFaGwkIRm_ZvSoeqyNiZM3YFgstfkEbUYsi8TGGIEGVh1CW9U20ETQKtgSAPhAEk9-9UMsLZG_GViqGawEHCffNz-u_7_trUJAkGaEueO1QOU4dA&nonce=637242208796364429.MGZkNjlkMjYtMTQzYi00NTIzLTliOTAtZjcwNGVlMThkZWRlZDRhNWU0ZWYtMzU3My00ZWYxLWFjNTUtOWQ1NjI0NzAwMzhl&redirect_uri=https%3a%2f%2fportal.office.com%2flanding&ui_locales=en-US&mkt=en-US&client-request-id=d8bd7e7d-ee2d-4d7a-9f4c-6b6bf4208eee";
        driver.get(baseUrl);
        driver.manage().window().maximize();

    // Get the WebElement corresponding to the Email, Next, Password
    WebElement email = driver.findElement(By.xpath("//input[@type='email' and @name='loginfmt' and @id='i0116']"));
    WebElement next = driver.findElement(By.id("idSIButton9"));
    WebElement pswd = driver.findElement(By.xpath("//input[@name='passwd' and @id='i0118']"));
    WebElement next2 = driver.findElement(By.id("idSIButton9"));
        email.sendKeys("fsis@na.edu");
        next.click();
        pswd.sendKeys("fakepassword");
        next2.submit();

    }
}