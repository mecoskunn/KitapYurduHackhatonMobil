package com.mobile.base.pages;

import org.openqa.selenium.By;

public class ScoreCatalogPagesElements {
    protected static By BTN_ScoreCatalog = By.xpath("//android.view.View[@content-desc=\"Puan Kataloğu Tümü\"]");
    protected static By BTN_FirstBook = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.mobisoft.kitapyurdu:id/recycler_view\"]/android.view.ViewGroup[1]");
    protected static By TXB_FirstBookScore = By.xpath("//android.widget.TextView[@resource-id=\"com.mobisoft.kitapyurdu:id/textViewLeftPrice\"]");
    protected static By TXB_BookScore = By.id("com.mobisoft.kitapyurdu:id/textViewSellPriceBottom");

}
