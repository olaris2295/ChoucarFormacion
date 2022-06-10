#<> (Placeholder)
#""
##(Comments)


#Sample feature Definition Template
@Regresion

  Feature: Formulario Popup Validation
    El usuario debe poder ingresar al formulario los datos requeridos.
    Cada campo del formulario realiza validaciones de obligatoriedad,
    longitud y formato, el sistema debe presentar las validaciones respectivas
    para cada campo a través de un globo informativo.

  @CasoExitoso

  Scenario: Diligenciamiento exitoso del formulario Popup Validation,
            no se presenta ningún mensaje de validación.

    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio formulario Popup Validation
    Then Verifico ingreso exitoso
