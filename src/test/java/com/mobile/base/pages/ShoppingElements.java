package com.mobile.base.pages;

import org.openqa.selenium.By;

public class ShoppingElements {

    protected static By permissionAllowButton = By.id("com.android.permissioncontroller:id/permission_allow_button");
    protected static By permissionDenyButton = By.id("com.android.permissioncontroller:id/permission_deny_button");
    protected static By startShoppingBTN = By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore");
    protected static By navCategories = By.id("com.ozdilek.ozdilekteyim:id/nav_categories");
    protected static By contentDescCategories = By.xpath("//android.widget.LinearLayout[@content-desc=\"Kategoriler\"]");
    protected static By womanCategoryBTN = By.xpath("//android.widget.TextView[@text=\"Kadın\"]");
    protected static By scrollToCategory = By.id("com.ozdilek.ozdilekteyim:id/recyclerCategories");
    protected static By bagCategory = By.xpath("//android.widget.TextView[@resource-id=\"com.ozdilek.ozdilekteyim:id/subItem\" and @text=\"Çanta\"]");
    protected static By brandsTextView = By.xpath("//android.widget.TextView[@resource-id=\"com.ozdilek.ozdilekteyim:id/quickFilterTextView\" and @text=\"Markalar\"]");
    protected static By brands = By.xpath("//android.widget.CheckBox[@resource-id=\"com.ozdilek.ozdilekteyim:id/rbSingleSelection\"]");
    protected static By applyBTN = By.id("com.ozdilek.ozdilekteyim:id/applyButton");
    protected static By searchBOX = By.id("com.ozdilek.ozdilekteyim:id/textViewSearch");
    protected static By sortBTN = By.id("com.ozdilek.ozdilekteyim:id/rlSort");
    protected static By cokSatanlarBTN = By.xpath("//android.widget.RadioButton[@resource-id=\"com.ozdilek.ozdilekteyim:id/radioButton\" and @text=\"Çok Satanlar\"]");
    protected static By promotionPrice = By.id("com.ozdilek.ozdilekteyim:id/textViewPromotionPrice");
    protected static By productPrice = By.id("com.ozdilek.ozdilekteyim:id/textViewProductPrice");
    protected static By productAndpromotionPrice = By.xpath("//android.widget.TextView[@resource-id=\"com.ozdilek.ozdilekteyim:id/textViewProductPrice\"] | //android.widget.TextView[@resource-id=\"com.ozdilek.ozdilekteyim:id/textViewPromotionPrice\"] | //android.widget.TextView[@resource-id=\"com.ozdilek.ozdilekteyim:id/tvNoDiscountItemPrice\"]");
    protected static By cardAddToCartBTN = By.id("com.ozdilek.ozdilekteyim:id/cardAddToCart");
    protected static By loginBTN = By.id("com.ozdilek.ozdilekteyim:id/btnLogin");


}
