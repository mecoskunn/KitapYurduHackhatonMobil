package com.mobile.base.pages;

import com.mobile.base.Methods.Methods;

public class MyLastVisitsPages extends MyLastVisitsPagesElements {
    Methods methods = new Methods();

    public void clickBestSeller() {
        methods.waitUntilVisibleAndClick(TXB_BestSeller);
    }


    public void scrollThreeTimes(Integer times) {
        methods.scrollTimes(7, 4, times);
    }

    public void selectBook() {
        methods.waitUntilVisibleAndClick(BTN_Book);
    }

    public void scrollMyLastVisits() {
        methods.scrollUntilVisable(TXB_MyLastVisits);
    }

    public void clickMyLastVisitBook() {
        methods.waitUntilVisibleAndClick(BTN_MyLastVisitsBook);
    }

    public void saveVisitBookName() {
        methods.saveElementGetText(BTN_TextViewProductName,"visit_book_name");
    }

    public void checkSavedVisitBookName() {
        methods.saveElementGetText(BTN_TextViewProductName,"MyLastvisit_book_name");
        methods.checkEqualsOnKeyMap("visit_book_name","MyLastvisit_book_name");
    }
}
