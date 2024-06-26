package com.tkachov;

public interface GooglePage {
    void searchFor(String keywordToSearch);
    boolean verifySearchResultsContains(String url);
}
