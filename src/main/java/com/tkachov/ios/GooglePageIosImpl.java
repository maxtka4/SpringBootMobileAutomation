package com.tkachov.ios;

import com.tkachov.BasePage;
import com.tkachov.GooglePage;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class GooglePageIosImpl extends BasePage implements GooglePage {

    private static final String SEARCH_BOX_NAME = "TabBarItemTitle";
    private static final String SEARCH_BOX_KEYBOARD_NAME = "URL";
    private static final String GO_BUTTON_NAME = "Go";
    private static final String SEARCH_RESULTS_CONTAINS = "//XCUIElementTypeLink[contains(@name, '%s')]";

    public void searchFor(String keywordToSearch) {
        appiumDriver.findElement(By.name(SEARCH_BOX_NAME)).click();
        appiumDriver.findElement(By.name(SEARCH_BOX_KEYBOARD_NAME)).sendKeys(keywordToSearch);
        appiumDriver.findElement(By.name(GO_BUTTON_NAME)).click();
    }

    public boolean verifySearchResultsContains(String url) {
        return appiumDriver.findElement(By.xpath(String.format(SEARCH_RESULTS_CONTAINS, url))).isDisplayed();
    }
}
