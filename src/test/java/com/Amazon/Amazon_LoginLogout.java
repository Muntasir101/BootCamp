package com.Amazon;

import com.Base.TestBase;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.Map;

public class Amazon_LoginLogout extends TestBase {

    @Test(priority = 0)
    public static void login() throws InterruptedException {
       String email="oceanize.muntasir@gmail.com";
        String password="mizan2010";

        WebElement SignElement = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div"));
        SignElement.click();
        driver.findElement(By.id("ap_email")).sendKeys(email);
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".a-button-inner > #continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys(password);
        Thread.sleep(2000);

        driver.findElement(By.id("signInSubmit")).click();

    }

    @Test(priority = 1)
    public static void logOut() throws InterruptedException {
        login();
        LogOut();

    }

    //Common Logout. Anyone can use it
    public static void LogOut() throws InterruptedException {
        WebElement Account = driver.findElement(By.id("nav-link-accountList"));
        Actions builder = new Actions(driver);
        builder.moveToElement(Account).perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Sign Out")).click();
    }

}
