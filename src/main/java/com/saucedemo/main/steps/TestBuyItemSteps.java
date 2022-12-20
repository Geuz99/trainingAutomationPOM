package com.saucedemo.main.steps;

import com.saucedemo.main.pages.TestCartPage;
import com.saucedemo.main.pages.TestCheckOutPage;
import com.saucedemo.main.pages.TestCompletePage;
import com.saucedemo.main.pages.TestOverViewPage;
import com.saucedemo.main.util.GeneralUtil;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBuyItemSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestBuyItemSteps.class);

    @Page
    TestCartPage cartPage;

    @Page
    TestCheckOutPage checkOutPage;

    @Page
    TestOverViewPage overViewPage;

    @Page
    TestCompletePage completePage;

    public void clickBtnCheck() {
        cartPage.clickBtnCheck();
    }

    public void validarInformation(String titleInfo) {
        String s = GeneralUtil.formatMessageInformation("validando el ingreso de datos despues de realizar el check de nuestro item en el carrito de compras");
        LOGGER.info(s);
        MatcherAssert.assertThat("Se realizo correctamente el paso a ingresar nuestr informacion", titleInfo.contains(checkOutPage.InfoText.getText()));
    }

    public void ingresarInformacion(String firstName, String lastName, String zip) {
        checkOutPage.ingresarInfo(firstName, lastName, zip);
    }

    public void clickContinue() {
        checkOutPage.clickBtnContinue();
    }

    public void validarOverView(String overView) {
        String s = GeneralUtil.formatMessageInformation("Validando la pagina de overview");
        LOGGER.info(s);
        MatcherAssert.assertThat("Se realizo correctamente el paso al overview", overView.contains(overViewPage.OverViewText.getText()));
    }

    public void clickFinish() {
        overViewPage.clickFinish();
    }

    public void validarComplete(String complete) {
        String s = GeneralUtil.formatMessageInformation("Validando la completacion del item agregado al carrito de compras");
        LOGGER.info(s);
        MatcherAssert.assertThat("Se realizo correctamente la compra", complete.contains(completePage.CompleteText.getText()));
    }
}
