package com.qvision.co.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PortalLoginPage {

    public static final Target USERNAME = Target.the("Campo Usuario").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("Campo Contraseña").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Botón Ingresar").located(By.xpath("//input[@class='btn_action']"));
}
