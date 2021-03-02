package com.CNN;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CNN_Login extends TestBase {
    /*
    mail22@yopmail.com
    TSkfmF5D9Fsz@eL
     */

    @Test(priority = 0)
    public static void CNN_login() throws InterruptedException {
        String email="mail22@yopmail.com";
        String password="TSkfmF5D9Fsz@eL";

        driver.findElement(By.cssSelector(".Flex-sc-1sqrs56-0 .user-icon")).click();
        driver.findElement(By.name("loginEmail")).sendKeys(email);
        driver.findElement(By.name("loginPassword")).sendKeys("TSkfmF5D9Fsz@eL");
        driver.findElement(By.xpath("//*[@id=\"login-form-button\"]")).click();

        Thread.sleep(5000);

        // Log Out
        driver.findElement(By.cssSelector("#account-header-button-desktop > div.Box-sc-1fet97o-0.hyVhvp")).click();
        driver.findElement(By.linkText("Log Out")).click();

    }


}
