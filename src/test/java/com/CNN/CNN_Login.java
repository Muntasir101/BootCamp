package com.CNN;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CNN_Login extends TestBase {
    /*
    mail22@mail.com
    TSkfmF5D9Fsz@eL
     */

    @Test(priority = 0)
    public static void CNN_login() throws InterruptedException {
        String email="mail22@mail.com";
        String password="TSkfmF5D9Fsz@eL";

        driver.findElement(By.cssSelector(".Flex-sc-1sqrs56-0 .user-icon")).click();
        driver.findElement(By.name("loginEmail")).sendKeys(email);
        driver.findElement(By.name("loginPassword")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"login-form-button\"]")).click();

    }
}
