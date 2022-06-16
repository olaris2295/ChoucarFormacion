package com.choucair.formacion.definition;

import com.choucair.formacion.steps.PopupValidationsSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PopupValidationDefinition {

    @Steps
    PopupValidationsSteps popupValidationsSteps;


    @Given("Autentico en colorlib con usuario {string} y clave {string}")
    public void autenticoEnColorlibConUsuarioYClave(String Usuario, String Clave) {
        popupValidationsSteps.login_colorlib(Usuario, Clave);


    }
    @Given("Ingreso a la funcionalidad Forms Validation")
    public void ingresoALaFuncionalidadFormsValidation() {

    }
    @When("Diligencio formulario Popup Validation")
    public void diligencioFormularioPopupValidation() {

    }
    @Then("Verifico ingreso exitoso")
    public void verificoIngresoExitoso() {

    }


}
