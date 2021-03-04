package com.CNN;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CNN_Logout extends TestBase {

    @Test(priority = 0)
    public static void logout() throws InterruptedException {

        CNN_Login.login();

        // Log Out
        driver.findElement(By.cssSelector("#account-header-button-desktop > div.Box-sc-1fet97o-0.hyVhvp")).click();
        driver.findElement(By.linkText("Log Out")).click();
    }

}
