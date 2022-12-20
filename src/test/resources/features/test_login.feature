Feature: Automatizacion de la pagina de saucedemo. se realiza esta prueba de entradas a la pagina para el mejoramiento de la pagina.

  @login
  Scenario: ingresar a la aplicacion con credenciales
    Given que el usuario ingrese a la pagina web
    When el usuario ingrese las credenciales
    And dar click en el boton de login
    Then validamos que estemos en la pagina principal "PRODUCTS"

  @addFilter
  Scenario: Filtrar los productos de precio menor a mayor
    Given dar click en el boton de filtracion
    When el usuario seleccione ordenar precio menor a mayor
    Then validamos que los precios si esten ordenados segun su precio "PRICE (LOW TO HIGH)"

  @addToCart
  Scenario: Agregar un producto al carrito
    Given Seleccione un item al carrito de compras
    When ingresamos al carrito de compras
    Then Validamos que el producto se encuentre en el carrito "Sauce Labs Onesie"

  @BuyItem
    Scenario: Realizar la compra del item cargado al carrito de compras
    When dar click en el boton de check
    And Validamos estar en la pagina del checkout "CHECKOUT: YOUR INFORMATION"
    And ingresamos nuestros datoe a la aplicacion "Anderson" "Zuleta" "CF"
    And dar click en el boton de continue
    And validamos estar en la pagina de checkout overview "CHECKOUT: OVERVIEW"
    And dar click en el boton de finish
    Then validamos que estemos en la pagina complete "CHECKOUT: COMPLETE!"

  @returnToLogin
  Scenario: Regresar a la pagina de login
    Given dar click en el boton de menu
    And dar click en el logout
    Then validar que estemos en el login "login_logo"
