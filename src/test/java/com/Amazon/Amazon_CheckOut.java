package com.Amazon;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Amazon_CheckOut extends TestBase {

    @Test
    public void checkOut() throws InterruptedException {
        Amazon_LoginLogout.login();

        //Cart
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]"));
        cart.click();

        //Checkout
        WebElement checkOut= getElementByXpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input");
        checkOut.click();
        Thread.sleep(2000);

        //Logout
        driver.navigate().back();
        Amazon_LoginLogout.LogOut();

    }

}
