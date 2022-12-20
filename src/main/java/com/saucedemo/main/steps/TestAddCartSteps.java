package com.saucedemo.main.steps;

import com.saucedemo.main.pages.*;
import com.saucedemo.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestAddCartSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestAddCartSteps.class);

    @Page
    HomePage homePage;

    @Page
    TestCartPage cartPage;

    public void addItemToCart() {
        homePage.addItem();
    }

    public void clickCart() {
        homePage.clikOnCart();
    }

    public void validarItemOnCart(String itemName) {
        String s = GeneralUtil.formatMessageInformation("Validando la agregacion de un item al carrito de compras");
        LOGGER.info(s);
        MatcherAssert.assertThat("Producto en el carrito!", itemName.contains(cartPage.ItemText.getText()));
    }

}
