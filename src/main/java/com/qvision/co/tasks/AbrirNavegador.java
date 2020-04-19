package com.qvision.co.tasks;

import com.qvision.co.ui.PortalUrl;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(new PortalUrl()));

    }

    public static AbrirNavegador ejecutar() {

        return instrumented(AbrirNavegador.class);
    }
}
