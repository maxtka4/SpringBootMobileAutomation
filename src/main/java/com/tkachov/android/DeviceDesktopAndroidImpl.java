package com.tkachov.android;

import com.tkachov.BasePage;
import com.tkachov.DeviceDesktop;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class DeviceDesktopAndroidImpl extends BasePage implements DeviceDesktop {

    //for some reason Chrome browser is not started from appium capability created workaround
    private static final String CHROME_APP_XPATH = "//android.widget.TextView[@content-desc='Chrome']";

    public void openBrowser() {
        appiumDriver.findElement(By.xpath(CHROME_APP_XPATH)).click();
    }
}
