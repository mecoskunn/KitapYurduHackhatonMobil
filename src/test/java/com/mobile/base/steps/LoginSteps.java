package com.mobile.base.steps;

import com.mobile.base.pages.LoginPages;
import com.thoughtworks.gauge.Step;

public class LoginSteps {
    private static final LoginPages loginPages = new LoginPages();


    @Step("click account button")
    public void clickAccountBtn() {
        loginPages.clickAccountBTN();
    }

    @Step("enter <burcuonal1145@gmail.com>  email adress and <burcu123> password")
    public void implementation1(String email, String password) {
        loginPages.enterEmailPassword(email, password);
    }

    @Step("click login button")
    public void implementation2() {
        loginPages.clikLoginBTN();
    }

    @Step("clik Okey button")
    public void implementation3() {
        loginPages.clikOKEY_BTN();
    }
}
