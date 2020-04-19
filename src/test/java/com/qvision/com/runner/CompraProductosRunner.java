package com.qvision.com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources.features/compra.productos.feature",
        glue = "com.qvision.com.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@CompraProductos"
)

public class CompraProductosRunner {
}
