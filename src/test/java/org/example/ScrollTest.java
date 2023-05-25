package org.example;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ScrollTest extends BaseTest{

    @Test
    public void ScrolltoEnd() throws MalformedURLException, InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        scrollToEnd();
    }
}
