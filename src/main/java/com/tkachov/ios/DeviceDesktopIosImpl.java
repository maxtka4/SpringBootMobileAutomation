package com.tkachov.ios;

import com.tkachov.BasePage;
import com.tkachov.DeviceDesktop;
import io.appium.java_client.ios.IOSDriver;
import org.springframework.stereotype.Component;

@Component
public class DeviceDesktopIosImpl extends BasePage implements DeviceDesktop {

    private static final String SAFARI_BUNDLE_ID = "com.apple.mobilesafari";

    public void openBrowser() {
        ((IOSDriver) appiumDriver).activateApp(SAFARI_BUNDLE_ID);
    }
}
