package com.qvision.co.tasks;

import com.qvision.co.models.ModeloLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.qvision.co.ui.PortalLoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    private ModeloLogin loginModel;

    public IniciarSesion(ModeloLogin loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(System.getProperty(loginModel.getUsername())).into(USERNAME),
                Enter.theValue(System.getProperty(loginModel.getPassword())).into(PASSWORD),
                Click.on(LOGIN_BUTTON));
    }

    public static IniciarSesion conLasCredenciales(ModeloLogin loginModel) {
        return instrumented(IniciarSesion.class, loginModel);
    }
}
