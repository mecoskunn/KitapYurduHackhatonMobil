package com.mobile.base.pages;


import com.mobile.base.Methods.Methods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShoppingPages extends ShoppingElements {

    Methods methods = new Methods();
    private Logger logger = LoggerFactory.getLogger(getClass());

    public void skipPopUp() {
        if (!methods.waitUntilVisible(permissionAllowButton, 5)) {
            logger.info("Bildirimlere izin ver ekranı çıkmadı.");
            return;
        }
        methods.waitUntilVisibleAndClick(permissionAllowButton);

    }

    public void clickStartShoppingBTN() {
        methods.waitUntilVisibleAndClick(startShoppingBTN);
    }

    public void clickCategoriesBTN() {
        methods.waitUntilVisibleAndClick(navCategories);
    }

    public void checkCategoriesScreen() {
        methods.waitUntilVisible(contentDescCategories);
    }

    public void clickWomanCategoryBTN() {
        methods.waitUntilVisibleAndClick(womanCategoryBTN);
    }

    public void scrollToAccessory() {
        while (!methods.waitUntilVisible(bagCategory, 2)) {
            methods.scrollDown(8, 1);
        }
    }

    public void clickBagCategoryBTN() {
        methods.waitUntilVisibleAndClick(bagCategory);
    }

    public void clickBrandsBTN() {
        methods.waitUntilVisibleAndClick(brandsTextView);
    }

    public void randomSelectBrand(int brandCount) {
        methods.clickRandom(brands, brandCount);
    }

    public void sumProductsCount() {
        // keyMap üzerine "sumProductsCount" key olarak kaydeder
        methods.sumProductsCount();
    }

    public void clickApplyBTN() {
        methods.clickAndWait(applyBTN,5);
    }

    public void saveProductCountInSearchBOX() {
        methods.saveElementGetNumberInTXT(searchBOX, "productCountInSearchBOX");
    }

    public void checkSumProductCountInSearchBOX() {
        methods.checkEqualsOnKeyMap("sumProductsCount", "productCountInSearchBOX");
    }

    public void clickSortBTN() {
        methods.waitUntilVisibleAndClick(sortBTN);
    }

    public void clickCokSatanlar() {
        methods.clickAndWait(cokSatanlarBTN, 5);
    }

    public void savePrice(int productIndex) {
        // keyMap üzerine "firstPrice" key olarak kaydeder.
        methods.clickIndexListElementAndSave(productAndpromotionPrice, productIndex);
    }

    public void saveProductPriceOnProductPage() {
        methods.waitUntilVisible(productAndpromotionPrice);
        methods.saveElementGetText(productAndpromotionPrice, "secondPrice");
    }

    public void checkProductPrice() {
        methods.checkEqualsOnKeyMap("firstPrice", "secondPrice");
    }

    public void clickAddToCartBTN() {
        methods.waitUntilVisibleAndClick(cardAddToCartBTN);
    }

    public void checkOnLoginScreen() {
        methods.waitUntilVisible(loginBTN);
    }


}
