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

        //World news
        WebElement worldNews=driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[1]/a"));
        worldNews.click();
        String ActualTitleWorld=driver.getTitle();
        String ExpectedTitleWorld="World news – breaking news, videos and headlines - CNN";
        if(ExpectedTitleWorld.equals(ActualTitleWorld)){
            System.out.println("World news page Verified.");
        }
        else{
            System.out.println("World news page Verification failed.");
        }

        scrollingToBottomofAPage();

        driver.navigate().back();

        //Business news
        WebElement businessNews=driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[3]/a"));
        businessNews.click();
        String ActualTitleBusiness=driver.getTitle();
        String ExpectedTitleBusiness="Breaking News, Latest News and Videos - CNN";
        if(ExpectedTitleBusiness.equals(ActualTitleBusiness)){
            System.out.println("Business news page Verified.");
        }
        else{
            System.out.println("Business news page Verification failed.");
        }
        scrollingToBottomofAPage();

        driver.navigate().back();

        //Health news
        WebElement health=driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[4]/a"));
        health.click();
        String ActualTitleHealth=driver.getTitle();
        String ExpectedTitleHealth="Health News - CNN";
        if(ExpectedTitleBusiness.equals(ActualTitleBusiness)){
            System.out.println("Health news page Verified.");
        }
        else{
            System.out.println("Health news page Verification failed.");
        }
        scrollingToBottomofAPage();

        driver.navigate().back();

        //Entertainment news
        WebElement entertainment=driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[5]/a"));
        entertainment.click();
        String ActualTitleEntertainment=driver.getTitle();
        String ExpectedTitleEntertainment="Entertainment News - Celebrities, Movies, TV, Music - CNN";
        if(ExpectedTitleBusiness.equals(ActualTitleBusiness)){
            System.out.println("Entertainment news page Verified.");
        }
        else{
            System.out.println("Entertainment news page Verification failed.");
        }
        scrollingToBottomofAPage();

        driver.navigate().back();

        //Style news
        WebElement style=driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[5]/a"));
        style.click();
        String ActualTitleStyle=driver.getTitle();
        String ExpectedTitleStyle="CNN Style - Fashion, beauty, design, art, architecture and luxury";
        if(ExpectedTitleBusiness.equals(ActualTitleBusiness)){
            System.out.println("Style news page Verified.");
        }
        else{
            System.out.println("Style news page Verification failed.");
        }
        scrollingToBottomofAPage();

        driver.navigate().back();

        //Travel news
        WebElement travel=driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[5]/a"));
        travel.click();
        String ActualTitleTravel=driver.getTitle();
        String ExpectedTitTravel="CNN Travel | Global Destinations, Tips & Video";
        if(ExpectedTitleBusiness.equals(ActualTitleBusiness)){
            System.out.println("Travel news page Verified.");
        }
        else{
            System.out.println("Travel news page Verification failed.");
        }
        scrollingToBottomofAPage();

        driver.navigate().back();

        // Log Out
        driver.findElement(By.cssSelector("#account-header-button-desktop > div.Box-sc-1fet97o-0.hyVhvp")).click();
        driver.findElement(By.linkText("Log Out")).click();

    }


}
