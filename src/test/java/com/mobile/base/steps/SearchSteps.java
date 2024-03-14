package com.mobile.base.steps;

import com.mobile.base.pages.SearchPage;
import com.thoughtworks.gauge.Step;

public class SearchSteps {
    private static final SearchPage searchPage = new SearchPage();

    @Step("Click search button")
    public void clickSearchButton() {
        searchPage.clickNavigateSearch();
    }

    @Step("Click random categories")
    public void clickRandomCategories() {
        searchPage.clickRandomCategories();
    }

    @Step("Click show all button")
    public void clickShowAllBtn() {
        searchPage.clickShowAll();
    }

    @Step("Click first product")
    public void clickFirstProduct() {
        searchPage.clickFirstProd();
    }

    @Step("Scroll to categories")
    public void scrollToCategories() {
        searchPage.scrollToCategoriesElem();
    }

    @Step("Save categories Text")
    public void saveCategoriesTextInProd() {
        searchPage.saveProdCategories();
    }

    @Step("Save categories list text")
    public void saveCategoriesListText() {
        searchPage.saveCategoriesText();
    }

    @Step("Check categories text")
    public void checkCategories() {
        searchPage.checkCategoriesElement();
    }
}
