package com.mobile.base.pages;

import org.openqa.selenium.By;

public class CartElements {
    protected static By BTN_FirstInterestProd = By.xpath("(//android.widget.ImageView[@resource-id=\"com.mobisoft.kitapyurdu:id/imageViewProduct\"])[1]");
    protected static By BTN_AddToCart = By.id("com.mobisoft.kitapyurdu:id/addToCartNormalView");
    protected static By BTN_NavigateToCart = By.xpath("//android.widget.FrameLayout[@content-desc=\"Sepetim\"]/android.widget.FrameLayout");
    protected static By BTN_DeleteProdInCart = By.id("com.mobisoft.kitapyurdu:id/buttonDelete");
    protected static By BTN_DelSure = By.xpath("//android.widget.RelativeLayout[@content-desc=\"Sil\"]");
    protected static By BTN_NavigateHome = By.id("com.mobisoft.kitapyurdu:id/navigation_home");
    protected static By BTN_BestSellerSecond = By.xpath("(//android.widget.ImageView[@resource-id=\"com.mobisoft.kitapyurdu:id/imageViewProduct\"])[6]");
    protected static By BTN_Plus = By.id("com.mobisoft.kitapyurdu:id/buttonPlus");
    protected static By BTN_SecondInterestProd = By.xpath("(//android.widget.ImageView[@resource-id=\"com.mobisoft.kitapyurdu:id/imageViewProduct\"])[2]");
    protected static By BTN_Continue = By.id("com.mobisoft.kitapyurdu:id/btnContinue");
    protected static By BTN_Back = By.id("com.mobisoft.kitapyurdu:id/btn_ic_back");
}
