package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.TestBuyItemSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestBuyItemDefinitions {

    @Steps
    TestBuyItemSteps testBuyItemSteps;

    @When("^dar click en el boton de check$")
    public void dar_click_en_el_boton_de_check() {
        testBuyItemSteps.clickBtnCheck();
    }

    @And("^Validamos estar en la pagina del checkout \"([^\"]*)\"$")
    public void validamos_estar_en_la_pagina_del_checkout_something(String titleInfo) {
        testBuyItemSteps.validarInformation(titleInfo);
    }

    @And("^ingresamos nuestros datoe a la aplicacion \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresamos_nuestros_datoe_a_la_aplicacion_something_something_something(String firstName, String lastName, String zip) {
        testBuyItemSteps.ingresarInformacion(firstName, lastName, zip);
    }

    @And("^dar click en el boton de continue$")
    public void dar_click_en_el_boton_de_continue() {
        testBuyItemSteps.clickContinue();
    }

    @And("^validamos estar en la pagina de checkout overview \"([^\"]*)\"$")
    public void validamos_estar_en_la_pagina_de_checkout_overview_something(String overView) {
        testBuyItemSteps.validarOverView(overView);
    }

    @And("^dar click en el boton de finish$")
    public void dar_click_en_el_boton_de_finish() {
        testBuyItemSteps.clickFinish();
    }

    @Then("^validamos que estemos en la pagina complete \"([^\"]*)\"$")
    public void validamos_que_estemos_en_la_pagina_complete_something(String complete){
        testBuyItemSteps.validarComplete(complete);
    }

}
