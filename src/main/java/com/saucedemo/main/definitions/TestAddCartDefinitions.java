package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.TestAddCartSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestAddCartDefinitions {

    @Steps
    TestAddCartSteps testAddCartSteps;

    @Given("^Seleccione un item al carrito de compras$")
    public void seleccione_un_item_al_carrito_de_compras() {
        testAddCartSteps.addItemToCart();
    }

    @When("^ingresamos al carrito de compras$")
    public void ingresamos_al_carrito_de_compras() {
        testAddCartSteps.clickCart();
    }


    @Then("Validamos que el producto se encuentre en el carrito {string}")
    public void validamos_que_el_producto_se_encuentre_en_el_carrito(String itemName) {
        testAddCartSteps.validarItemOnCart(itemName);
    }

}
