package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibMenuPage extends PageObject {

    //Menu forms
    @FindBy(xpath=)
    public WebElementFacade txtUsername;

    //Campo Password
    @FindBy (xpath="//*[@id='login']/form/input[2]")
    public WebElementFacade txtPassword;

    //Botón Sign in
    @FindBy (xpath="//*[@id='login']/form/button")
    public WebElementFacade btnSignIn;

}
