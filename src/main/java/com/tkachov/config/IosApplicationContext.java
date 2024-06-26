package com.tkachov.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.time.Duration;

@Configuration
@PropertySource("classpath:ios.properties")
@Profile("ios")
@ComponentScan("com.tkachov.ios")
public class IosApplicationContext {

    @Value("${deviceName}")
    private String deviceName;
    @Value("${platformVersion}")
    private String platformVersion;
    @Value("${automationName}")
    private String automationName;
    @Value("${platformName}")
    private String platformName;

    @Bean
    public AppiumDriver iosDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName", deviceName);
        capabilities.setCapability("appium:platformVersion", platformVersion);
        capabilities.setCapability("appium:automationName", automationName);
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("appium:newCommandTimeout", 20000);
        IOSDriver iosDriver = new IOSDriver(capabilities);
        iosDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return iosDriver;
    }
}
