package com.mobile.base.steps;

import com.mobile.base.pages.FavoritePages;
import com.thoughtworks.gauge.Step;

public class FavoriteSteps {
    private static final FavoritePages favoritePages = new FavoritePages();

    @Step("click first book")
    public void implementation1() {
        favoritePages.clickFirstBook();
    }

    @Step("scroll to favorite button")
    public void implementation2() {
        favoritePages.scrollToFavorite();
    }

    @Step("click favorite button")
    public void implementation3() {
        favoritePages.clickFavoriteBTN();
    }

    @Step("click Home Page button")
    public void implementation4() {
        favoritePages.clickHomePage();
    }

    @Step("save book name")
    public void implementation5() {
        favoritePages.saveBookName();

    }

    @Step("go to my favorites")
    public void implementation6() {
        favoritePages.clickMyFavorites();

    }

    @Step("check saved book name")
    public void implementation7() {
        favoritePages.checkBookName();

    }

    @Step("remove book my favorites")
    public void implementation8() {
        favoritePages.removeBookMyFavorites();

    }
}
