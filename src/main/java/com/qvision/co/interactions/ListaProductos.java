package com.qvision.co.interactions;

import com.qvision.co.ui.PortalVistaProductos;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ListaProductos implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> td = PortalVistaProductos.LISTADO_PRODUCTOS.resolveAllFor(actor);
        List<String> precios = td.stream().
                map(elementFacade -> elementFacade.getText().replace("$", ""))
                .collect(Collectors.toList());

        String precioMax = Collections.max(precios);
        String precioMin = Collections.min(precios);

        for (WebElementFacade webElementFacade : td) {

            if (webElementFacade.getText().replace("$", "").equals(precioMax) || equals(precioMin)) {
                PortalVistaProductos.BOTON_AGREGAR_CARRITO.resolveAllFor(actor).forEach(boton -> actor.attemptsTo(Click.on(boton)));
            }
        }
    }

    public static ListaProductos lista() {

        return instrumented(ListaProductos.class);
    }
}
