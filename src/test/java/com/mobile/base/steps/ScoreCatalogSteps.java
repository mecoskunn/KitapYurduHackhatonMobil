package com.mobile.base.steps;

import com.mobile.base.pages.LoginPages;
import com.mobile.base.pages.ScoreCatalogPages;
import com.thoughtworks.gauge.Step;

public class ScoreCatalogSteps {
    private static final LoginPages loginPages = new LoginPages();
    private static final ScoreCatalogPages scoreCatalogPages = new ScoreCatalogPages();

    @Step("scroll score catalog")
    public void implementation1() {
        scoreCatalogPages.scrollScoreCatalog();
    }

    @Step("click score catalog")
    public void implementation2() {
        scoreCatalogPages.clickScoreCatalog();

    }

    @Step("save first book score")
    public void implementation5() {
        scoreCatalogPages.saveFirstBookScore();
    }

    @Step("click first book in score catalog")
    public void implementation3() {
        scoreCatalogPages.clickFirstBook();

    }

    @Step("check saved score book")
    public void implementation4() {
        scoreCatalogPages.checkScoreBook();

    }
}
