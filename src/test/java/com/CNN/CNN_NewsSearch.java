package com.CNN;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CNN_NewsSearch extends TestBase {

    @Test
    public void search() throws InterruptedException {


     WebElement SearchBox=  driver.findElement(By.cssSelector("#header-nav-container > div > div.Grid-sc-1kcyc0j-0.sc-TOsTZ.gWxeje > div > div.Flex-sc-1sqrs56-0.sc-kvZOFW.cJcAaN > button > svg"));
        //waitUntilClickable("SearchBox", 5);
     SearchBox.click();

        WebElement HeaderSearchBar=driver.findElement(By.id("header-search-bar"));
        HeaderSearchBar.click();
        HeaderSearchBar.sendKeys("football");
        HeaderSearchBar.sendKeys(Keys.ENTER);

        String ActualURL=driver.getCurrentUrl();
        String ExpectedURL="https://edition.cnn.com/search?q=football";
        if(ExpectedURL.contains(ActualURL)){
            System.out.println("News Search Verified.");
        }
        else{
            System.out.println("News Search Verified. Verification failed.");
        }

    }
}
