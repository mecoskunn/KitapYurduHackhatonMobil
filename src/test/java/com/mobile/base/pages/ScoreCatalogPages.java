package com.mobile.base.pages;

import com.mobile.base.Methods.Methods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScoreCatalogPages extends ScoreCatalogPagesElements {
    Methods methods = new Methods();
    private Logger logger = LoggerFactory.getLogger(getClass());


    public void scrollScoreCatalog() {
        methods.scrollUntilVisable(BTN_ScoreCatalog);
    }

    public void clickScoreCatalog() {
        methods.waitUntilVisibleAndClick(BTN_ScoreCatalog);
    }

    public void saveFirstBookScore() {
        methods.saveElementGetText(TXB_FirstBookScore, "firstBookScore");
    }
    public void clickFirstBook() {
        methods.waitUntilVisibleAndClick(BTN_FirstBook);
    }

    public void checkScoreBook() {
        methods.saveElementGetText(TXB_BookScore, "bookScore");
        methods.checkEqualsOnKeyMap("firstBookScore","bookScore");
    }
}
