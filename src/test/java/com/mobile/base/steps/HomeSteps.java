package com.mobile.base.steps;

import com.mobile.base.Methods.Methods;
import com.mobile.base.pages.LoginPages;
import com.thoughtworks.gauge.Step;

public class HomeSteps {
    private static final LoginPages loginPages = new LoginPages();

    Methods methods = new Methods();

    @Step("Close pop-ups")
    public void closePopUps() {
        loginPages.closePopUps();
    }

    @Step("bekle")
    public void implementation1() {
        methods.watingDriver(4);
    }
}
