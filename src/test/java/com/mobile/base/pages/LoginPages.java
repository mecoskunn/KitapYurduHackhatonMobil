package com.mobile.base.pages;

import com.mobile.base.Methods.Methods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPages extends LoginElements {
    Methods methods = new Methods();
    private Logger logger = LoggerFactory.getLogger(getClass());

    public void closePopUps() {
        if (methods.waitUntilVisible(buttonClose, 2)) {
            methods.waitUntilVisibleAndClick(buttonClose);
        }
    }

    public void clickAccountBTN() {
        methods.waitUntilVisibleAndClick(BTN_account);
    }


    public void enterEmailPassword(String email, String password) {
        methods.waitUntilVisibleAndSendKeys(TXB_email, email);
        methods.waitUntilVisibleAndSendKeys(TXB_password, password);
        methods.watingDriver(2);
    }

    public void clikLoginBTN() {
        methods.waitUntilVisibleAndClick(BTN_Login);
        methods.watingDriver(3);
    }

    public void clikOKEY_BTN() {
        if (methods.waitUntilVisible(BTN_confirmButton, 2)) {
            methods.waitUntilVisibleAndClick(BTN_confirmButton);
        }
    }
}
