package com.mobile.base.steps;

import com.mobile.base.pages.ShoppingPages;
import com.thoughtworks.gauge.Step;

public class ShoppingSteps {

    private static final ShoppingPages shoppingPages = new ShoppingPages();

    @Step("Bildirim izinleri pop up ı geçilir pop up çıkmadıysa fail almadan çıkmadığı loglanır")
    public void skipPopUp() {
        shoppingPages.skipPopUp();
    }

    @Step("Alışverişe Başla Butonuna tıkla")
    public void clickStartShoppingBTN() {
        shoppingPages.clickStartShoppingBTN();
    }

    @Step("Kategoriler butonuna tıkla")
    public void clickCategoriesBTN() {
        shoppingPages.clickCategoriesBTN();
    }

    @Step("Kategoriler ekranına gidildiği kontrol et")
    public void checkCategoriesScreen() {
        shoppingPages.checkCategoriesScreen();
    }

    @Step("Kadın kategorisine tıkla")
    public void clickWomanCategoryBTN() {
        shoppingPages.clickWomanCategoryBTN();
    }

    @Step("Aksesuar başlığına kaydır")
    public void scrollToAccessory() {
        shoppingPages.scrollToAccessory();
    }

    @Step("Çanta kategorisine tıkla")
    public void clickBagCategoryBTN() {
        shoppingPages.clickBagCategoryBTN();
    }

    @Step("Markalar seçeneğine tıkla")
    public void clickBrandsBTN() {
        shoppingPages.clickBrandsBTN();
    }

    @Step("Rastgele <markaSayisi> marka seçimi yap")
    public void randomSelectBrand(int brandCount) {
        shoppingPages.randomSelectBrand(brandCount);
    }

    @Step("Markaların ürün sayılarını topla ve kaydet")
    public void sumProductsCount() {
        shoppingPages.sumProductsCount();
    }

    @Step("Uygula Butonuna Tıkla")
    public void clickApplyBTN() {
        shoppingPages.clickApplyBTN();

    }

    @Step("Searchbox içerisindeki ürün sayısını kaydet")
    public void saveProductCountInSearchBOX() {
        shoppingPages.saveProductCountInSearchBOX();
    }

    @Step("Kaydedilen toplam ürün sayısı ile eşit mi kontrol et")
    public void checkSumProductCountInSearchBOX() {
        shoppingPages.checkSumProductCountInSearchBOX();
    }

    @Step("Sırala butonuna tıkla")
    public void clickSortBTN() {
        shoppingPages.clickSortBTN();
    }

    @Step("Çok satılanlar checkboxına tıkla")
    public void clickCokSatanlar() {
        shoppingPages.clickCokSatanlar();
    }

    @Step("Sayfada sıralanan <urunIndex>. ürünün fiyat bilgisini kaydet")
    public void savePrice(int productIndex) {
        shoppingPages.savePrice(productIndex);
    }

    @Step("Sayfada sıralanan <urunIndex>. ürüne tıkla")
    public void clickIndexProduct(int productIndex) {

    }

    @Step("Ürün sayfasındaki fiyat bilgisini kaydet")
    public void saveProductPriceOnProductPage() {
        shoppingPages.saveProductPriceOnProductPage();
    }

    @Step("Kaydedilen Fiyat bilgisiyle karşılaştır")
    public void checkProductPrice() {
        shoppingPages.checkProductPrice();
    }

    @Step("Sepete Ekle Butonuna Tıkla")
    public void clickAddToCartBTN() {
        shoppingPages.clickAddToCartBTN();
    }

    @Step("Login Ekranında olduğunu kontrol et")
    public void checkOnLoginScreen() {
        shoppingPages.checkOnLoginScreen();
    }

}
