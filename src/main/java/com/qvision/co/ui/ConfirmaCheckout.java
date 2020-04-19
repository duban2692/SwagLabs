package com.qvision.co.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmaCheckout {

    public static final Target FIRST_NAME = Target.the("First name").located(By.id("first-name"));
    public static final Target LAST_NAME = Target.the("Last name Contraseña").located(By.id("last-name"));
    public static final Target ZIP_POSTAL = Target.the("Zip postal").located(By.id("postal-code"));
    public static final Target CONTINUAR = Target.the("Continuar").located(By.xpath("//input[@class='btn_primary cart_button']"));
    public static final Target FINALIZAR = Target.the("Finalizar").located(By.xpath("//a[@class='btn_action cart_button']"));
    public static final Target ICONO_EXPRESS = Target.the("Express").located(By.xpath("//div[@class='pony_express']"));

}

