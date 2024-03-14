package com.mobile.base.pages;

import org.openqa.selenium.By;

public class LoginElements {
    protected static By buttonClose = By.id("com.mobisoft.kitapyurdu:id/buttonClose");
    protected static By BTN_account = By.id("com.mobisoft.kitapyurdu:id/btn_ic_header_account");
    protected static By BTN_Login = By.id("com.mobisoft.kitapyurdu:id/btnLogin");
    protected static By BTN_confirmButton = By.id("com.mobisoft.kitapyurdu:id/confirmButton");
    protected static By TXB_email = By.xpath("(//android.widget.EditText[@resource-id=\"com.mobisoft.kitapyurdu:id/inputEditText\"])[1]");
    protected static By TXB_password = By.xpath("(//android.widget.EditText[@resource-id=\"com.mobisoft.kitapyurdu:id/inputEditText\"])[2]");
    protected static By contentDescCategories = By.xpath("//android.widget.LinearLayout[@content-desc=\"Kategoriler\"]");

}
