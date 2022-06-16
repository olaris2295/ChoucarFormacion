package com.choucair.formacion.steps;
import com.choucair.formacion.pageobjects.ColorLibLoginPage;
import net.thucydides.core.annotations.Step;
public class PopupValidationsSteps {

    ColorLibLoginPage colorLibLoginPage;

    @Step
    public void login_colorlib(String strUsuario, String strPass) {
        // a. Abrir navegador con la url de prueba
        colorLibLoginPage.open();

    //b. Ingresar usuario demo
    /* c. Ingresar password demo
    d. Clic en botón sign in */

    colorLibLoginPage.IngresarDatos(strUsuario, strPass);
    //e. Verificar la autenticación (label en home)

        colorLibLoginPage.VerificarHome();
    }
}
