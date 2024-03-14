package com.mobile.base.steps;

import com.mobile.base.pages.CartPages;
import com.thoughtworks.gauge.Step;

public class CartSteps {
    private static final CartPages cartPages = new CartPages();


    @Step("Click first interst product")
    public void clickFirstInterestPrd() {
        cartPages.clickFirstInerestProd();
    }

    @Step("Click add to cart button")
    public void clickAddToCartBtn() {
        cartPages.clickAddToCart();
    }

    @Step("Click navigate cart button")
    public void clickNavigateToCartBtn() {
        cartPages.clickNavigateCart();
    }

    @Step("Click delete button in cart")
    public void clickDeleteBtnInCart() {
        cartPages.clikDelBtnInCart();
    }

    @Step("Click delete sure button")
    public void clickDeleteSureButton() {
        cartPages.clickDelSure();
    }

    @Step("Click navigate home page")
    public void clickNavigateHomePage() {
        cartPages.clickNavigateHomePage();
    }

    @Step("Click secon best seller product")
    public void clickSecondBestSellerProduction() {
        cartPages.clickBestSellerSecond();
    }

    @Step("Click add one more product button")
    public void clickAddOneMore() {
        cartPages.clickAddOneMoreBtn();
    }

    @Step("Click second interest product")
    public void clickSecondInterest() {
        cartPages.clickSecondInterestProd();
    }

    @Step("Click buy button")
    public void clickBuyBtn() {
        cartPages.clickBuyButton();
    }

    @Step("Click back button")
    public void clickBackButton() {
        cartPages.clickBackBtn();
    }
}
