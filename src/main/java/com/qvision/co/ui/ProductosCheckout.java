package com.qvision.co.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosCheckout {

    public static final Target BOTON_CHECKOUT = Target.the("Productos en vista Checkout").located(By.xpath("  //a[@class='btn_action checkout_button']"));

}
