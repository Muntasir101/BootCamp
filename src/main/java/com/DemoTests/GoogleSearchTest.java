package com.DemoTests;

import com.Base.TestBase;
import com.itextpdf.text.DocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleSearchTest extends TestBase {

    @Test()
    public void testDemo2() throws IOException, DocumentException {

        WebElement element= getElementByName("q");
        element.sendKeys("Test Automation");
        element.submit();

        captureScreenshot(driver,"Google Search");



    }
}
