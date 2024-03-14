package com.mobile.base.pages;

import org.openqa.selenium.By;

public class MyLastVisitsPagesElements {
    protected static By TXB_BestSeller = By.xpath("//android.view.View[@content-desc=\"Çok Satanlar Tümü\"]");
    protected static By BTN_Book = By.xpath("//android.widget.ImageView[@content-desc=\"Ürün görseli\"]");
    protected static By TXB_MyLastVisits = By.xpath("//android.widget.TextView[@resource-id=\"com.mobisoft.kitapyurdu:id/textViewListTitle\" and @text=\"Son Gezdikleriniz\"]");
    protected static By BTN_MyLastVisitsBook = By.id("com.mobisoft.kitapyurdu:id/imageViewProduct");

    protected static By BTN_TextViewProductName = By.id("com.mobisoft.kitapyurdu:id/textViewProductName");

}

