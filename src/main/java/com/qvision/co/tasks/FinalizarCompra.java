package com.qvision.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.qvision.co.ui.ConfirmaCheckout.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FinalizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("Juan").into(FIRST_NAME),
                (Enter.theValue("Monsalve").into(LAST_NAME)),
                (Enter.theValue("59").into(ZIP_POSTAL)),
                (Click.on(CONTINUAR)),
                (Click.on(FINALIZAR)));

    }

    public static FinalizarCompra confirmarCompra() {

        return instrumented(FinalizarCompra.class);
    }
}
