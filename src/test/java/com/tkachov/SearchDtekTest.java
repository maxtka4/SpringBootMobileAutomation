package com.tkachov;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class SearchDtekTest extends ParentTest {

    @Autowired
    GooglePage googlePage;
    @Autowired
    DeviceDesktop deviceDesktop;

    @Test
    void searchDtekInGoogle() {
        deviceDesktop.openBrowser();
        googlePage.searchFor("dtek");
        assertTrue(googlePage.verifySearchResultsContains("dtek.com"),
                "The dtek.com should be presented in search results");
    }
}
