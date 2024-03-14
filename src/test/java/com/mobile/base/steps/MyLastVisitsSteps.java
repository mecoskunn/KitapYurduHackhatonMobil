package com.mobile.base.steps;

import com.mobile.base.pages.MyLastVisitsPages;
import com.thoughtworks.gauge.Step;

public class MyLastVisitsSteps {

    MyLastVisitsPages myLastVisitsPages = new MyLastVisitsPages();

    @Step("click best seller")
    public void implementation1() {
        myLastVisitsPages.clickBestSeller();
    }

    @Step("scroll <3> times")
    public void implementation2(Integer times) {
        System.out.println("Times:" + times);
        myLastVisitsPages.scrollThreeTimes(times);
    }

    @Step("select book")
    public void implementation3() {
        myLastVisitsPages.selectBook();

    }

    @Step("scroll my last visits")
    public void implementation4() {
        myLastVisitsPages.scrollMyLastVisits();

    }

    @Step("click my last visits book")
    public void implementation5() {
        myLastVisitsPages.clickMyLastVisitBook();

    }

    @Step("save visit book name")
    public void implementation6() {
        myLastVisitsPages.saveVisitBookName();

    }

    @Step("check saved visit book name")
    public void implementation7() {
        myLastVisitsPages.checkSavedVisitBookName();

    }
}
