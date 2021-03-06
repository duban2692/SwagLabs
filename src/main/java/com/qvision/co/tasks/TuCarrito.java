package com.qvision.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.qvision.co.ui.PortalVistaProductos.CARRITO_COMPRAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TuCarrito implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CARRITO_COMPRAS));

    }

    public static TuCarrito ProductosDeTuCarrito() {

        return instrumented(TuCarrito.class);
    }
}
