package com.mobile.base.pages;

import com.mobile.base.Methods.Methods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FavoritePages extends FavoritePagesElements {
    Methods methods = new Methods();
    private Logger logger = LoggerFactory.getLogger(getClass());


    public void clickFirstBook() {
        methods.waitUntilVisibleAndClick(firstImageViewProduct);
    }

    public void scrollToFavorite() {
        methods.scrollUntilVisable(BTN_AddFavorite);
    }

    public void clickFavoriteBTN() {
        methods.waitUntilVisibleAndClick(BTN_AddFavorite);
    }

    public void clickHomePage() {
        methods.waitUntilVisibleAndClick(BTN_NavigationHome);
    }

    public void saveBookName() {
        methods.saveElementGetText(BTN_TextViewProductName, "book_name");
    }

    public void clickMyFavorites() {
        methods.waitUntilVisibleAndClick(BTN_Navigationfavorites);
    }

    public void checkBookName() {
        methods.saveElementGetText(BTN_TextViewProductName, "my_favorite_book_name");
        methods.checkEqualsOnKeyMap("book_name", "my_favorite_book_name");
    }

    public void removeBookMyFavorites() {
        methods.waitUntilVisibleAndClick(BTN_FavoriteIcon);
    }
}
