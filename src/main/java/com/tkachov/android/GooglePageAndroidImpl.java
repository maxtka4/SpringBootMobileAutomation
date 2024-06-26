package com.tkachov.android;

import com.tkachov.BasePage;
import com.tkachov.GooglePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.springframework.stereotype.Component;

@Component
public class GooglePageAndroidImpl extends BasePage implements GooglePage {

    private static final String SEARCH_BOX_ID = "com.android.chrome:id/search_box_text";
    private static final String SEARCH_RESULTS_CONTAINS = "//android.view.View[contains(@content-desc, '%s')]";
    private static final String NATIVE_APP_CONTEXT = "NATIVE_APP";

    public void searchFor(String keywordToSearch) {
        appiumDriver.findElement(By.id(SEARCH_BOX_ID)).sendKeys(keywordToSearch);
        new Actions(appiumDriver).sendKeys(Keys.ENTER).perform();
    }

    public boolean verifySearchResultsContains(String url) {
        ((AndroidDriver) appiumDriver).context(NATIVE_APP_CONTEXT);
        return appiumDriver.findElement(By.xpath(String.format(SEARCH_RESULTS_CONTAINS, url))).isDisplayed();
    }
}
