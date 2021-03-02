package com.Amazon;

import com.Base.TestBase;
import com.Utilities.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Amazon_ItemSearch extends TestBase {

    @Test
    public static void itemSearch() throws InterruptedException, IOException {
        //Login
        Amazon_LoginLogout.login();

        WebElement SearchBox=driver.findElement(By.id("twotabsearchtextbox"));
        SearchBox.click();

        WebElement Searching=driver.findElement(By.id("twotabsearchtextbox"));

        //Excel implementation
        Xls_Reader reader=new Xls_Reader("./src/test/java/com/Amazon/SearchData.xlsx");
        String sheetName= "Sheet1";

        int rowCount=reader.getRowCount(sheetName);

        for(int rowNum=2; rowNum<=rowCount; rowNum++) {
            String keyword=reader.getCellData(sheetName, "Data", rowNum);
            String keyword2=reader.getCellData(sheetName, "Data", rowNum);

            //Search keyword from excel
            Searching.sendKeys(keyword);

            ////
            WebElement SearchBtn=driver.findElement(By.id("nav-search-submit-button"));
            SearchBtn.click();



            // Open book details page
            WebElement detailsPage=driver.findElement(By.linkText("Selenium Testing Tools Cookbook - Second Edition"));
            detailsPage.click();

            //Verification Book page
            String ExpectedBook = "Selenium Testing Tools Cookbook - Second Edition";
            String ActualBook=driver.findElement(By.id("productTitle")).getText();
            Assert.assertEquals(ExpectedBook, ActualBook);

            //Verification Book 1
            String pageSource=driver.getPageSource();
            boolean ActualText=pageSource.contains("Selenium Testing Tools Cookbook - Second Edition");
            if(ActualText==true){
                Assert.assertTrue(true);
                reader.setCellData(sheetName, "Result", rowNum, "Item Found");
            }
            else{
                Assert.assertTrue(false);
                reader.setCellData(sheetName, "Result", rowNum, "Item Not Found");
            }


            //Logout
            Amazon_LoginLogout.LogOut();
        }

    }
}
