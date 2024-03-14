package com.mobile.base.pages;

import org.openqa.selenium.By;

public class SearchElement {
    protected static By BTN_Search = By.id("com.mobisoft.kitapyurdu:id/navigation_search");
    protected static By CategoriesList = By.xpath("//android.widget.TextView[@resource-id=\"com.mobisoft.kitapyurdu:id/textViewName\"]");
    protected static By BTN_ShowAll = By.id("com.mobisoft.kitapyurdu:id/btnGoToProduct");
    protected static By BTN_FirstProd = By.xpath("(//android.widget.ImageView[@content-desc=\"Ürün görseli\"])[1]");
    protected static By ProdCategories = By.xpath("//android.widget.TextView[@resource-id=\"com.mobisoft.kitapyurdu:id/textViewCategory\"]");


}
