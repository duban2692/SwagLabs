package com.qvision.co.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class VerificarPantallaProductos implements Question<Boolean> {

    private Target productos;

    public VerificarPantallaProductos(Target productos) {

        this.productos = productos;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(productos, WebElementStateMatchers.isVisible());
        return productos.resolveFor(actor).isVisible();
    }

    public static VerificarPantallaProductos existe(Target Productos) {

        return new VerificarPantallaProductos(Productos);
    }
}
