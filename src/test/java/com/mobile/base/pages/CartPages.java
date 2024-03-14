package com.mobile.base.pages;

import com.mobile.base.Methods.Methods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CartPages extends CartElements{
    Methods methods = new Methods();
    private Logger logger = LoggerFactory.getLogger(getClass());

    public void clickFirstInerestProd(){
        methods.waitUntilVisibleAndClick(BTN_FirstInterestProd);
    }
    public void clickAddToCart(){
        methods.waitUntilVisibleAndClick(BTN_AddToCart);
    }
    public void clickNavigateCart(){
        methods.waitUntilVisibleAndClick(BTN_NavigateToCart);
    }
    public void clikDelBtnInCart(){
        methods.waitUntilVisibleAndClick(BTN_DeleteProdInCart);
    }
    public void clickDelSure(){
        methods.waitUntilVisibleAndClick(BTN_DelSure);
    }
    public void clickNavigateHomePage(){
        methods.waitUntilVisibleAndClick(BTN_NavigateHome);
        methods.waitUntilVisibleAndClick(BTN_NavigateHome);
    }
    public void clickBestSellerSecond(){
        methods.waitUntilVisibleAndClick(BTN_BestSellerSecond);
    }
    public void clickAddOneMoreBtn(){
        methods.waitUntilVisibleAndClick(BTN_Plus);
    }
    public void clickSecondInterestProd(){
        methods.waitUntilVisibleAndClick(BTN_SecondInterestProd);
    }
    public void clickBuyButton(){
        methods.waitUntilVisibleAndClick(BTN_Continue);
    }
    public void clickBackBtn(){
        methods.waitUntilVisibleAndClick(BTN_Back);
    }
}
