package com.tkachov.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.time.Duration;

@Configuration
@PropertySource("classpath:android.properties")
@Profile("android")
@ComponentScan(basePackages = "com.tkachov.android")
public class AndroidApplicationContext {

    @Value("${avd}")
    private String avd;
    @Value("${automationName}")
    private String automationName;
    @Value("${platformName}")
    private String platformName;

    @Bean
    public AppiumDriver androidDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:avd", avd);
        capabilities.setCapability("appium:automationName", automationName);
        capabilities.setCapability("platformName", platformName);
        AndroidDriver androidDriver = new AndroidDriver(capabilities);
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return androidDriver;
    }
}
