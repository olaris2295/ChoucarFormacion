package com.choucair.formacion;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith (CucumberWithSerenity.class)

@CucumberOptions (
        features = "src/test/resources/feature/Colorlib/Forms/PopupValidation.feature",
        snippets = CAMELCASE,
        tags = "@Caso Exitoso")

public class RunnerTags {
}
