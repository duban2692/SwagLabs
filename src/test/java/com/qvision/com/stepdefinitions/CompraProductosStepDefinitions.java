package com.qvision.com.stepdefinitions;

import com.qvision.co.interactions.ListaProductos;
import com.qvision.co.models.ModeloLogin;
import com.qvision.co.questions.VerificarPantallaProductos;
import com.qvision.co.tasks.AbrirNavegador;
import com.qvision.co.tasks.FinalizarCompra;
import com.qvision.co.tasks.IniciarSesion;
import com.qvision.co.tasks.SeleccionProductos;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.qvision.co.ui.ConfirmaCheckout.ICONO_EXPRESS;
import static com.qvision.co.ui.PortalVistaProductos.ICONO_PRODUCTOS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraProductosStepDefinitions {

    @Managed
    private WebDriver browser;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que el usuario quiere iniciar sesion con sus credenciales$")
    public void queElUusuarioQuiereIniciarSesionConSusCredenciales(List<ModeloLogin> loginModelList) {

        theActorCalled("Usuario Portal ").wasAbleTo(AbrirNavegador.ejecutar(), IniciarSesion.conLasCredenciales(loginModelList.get(0)));
    }

    @Cuando("^sus credenciales son correctas$")
    public void susCredencialesSonCorrectas() {

        theActorInTheSpotlight().should((seeThat(VerificarPantallaProductos.existe(ICONO_PRODUCTOS))));
    }

    @Entonces("^el usuario selecciona sus productos y posteriormente los confirma$")
    public void elUsuarioSeleccionaSusProductosYPosteriormenteLosConfirma() {
        theActorInTheSpotlight().attemptsTo(ListaProductos.lista());
        theActorInTheSpotlight().attemptsTo(SeleccionProductos.seleccionados());
        theActorInTheSpotlight().attemptsTo(FinalizarCompra.confirmarCompra());
        theActorInTheSpotlight().should((seeThat(VerificarPantallaProductos.existe(ICONO_EXPRESS))));

    }
}