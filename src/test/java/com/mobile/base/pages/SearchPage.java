package com.mobile.base.pages;

import com.mobile.base.Methods.Methods;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchPage extends SearchElement{
    Methods methods = new Methods();
    private Logger logger = LoggerFactory.getLogger(getClass());

    public void clickNavigateSearch(){
        methods.waitUntilVisibleAndClick(BTN_Search);
    }
    public void clickRandomCategories(){
        methods.clickRandomElement(CategoriesList);
    }
    public void clickShowAll(){
        methods.waitUntilVisibleAndClick(BTN_ShowAll);
    }
    public void clickFirstProd(){
        methods.waitUntilVisibleAndClick(BTN_FirstProd);
    }
    public void scrollToCategoriesElem(){
        methods.scrollUntilVisable(ProdCategories);
    }
    public void saveProdCategories(){
        methods.saveElementGetText(ProdCategories,"inprod");
    }
    public void saveCategoriesText(){
        methods.saveElementGetText(CategoriesList,"incategories");
    }
    public void checkCategoriesElement(){
        methods.checkContainsOnKeyMap("inprod","incategories");
    }
}
