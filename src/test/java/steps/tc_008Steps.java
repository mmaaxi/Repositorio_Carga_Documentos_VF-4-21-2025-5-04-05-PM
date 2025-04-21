package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {
    tc_008Page page = new tc_008Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("el usuario carga un documento PDF válido por primera vez")
    public void el_usuario_carga_un_documento_pdf_valido_por_primera_vez() {
        page.uploadDocument("ruta/al/documento.pdf");
    }

    @Then("el archivo se carga correctamente")
    public void el_archivo_se_carga_correctamente() {
        Assert.assertTrue(page.isUploadSuccessful());
    }

    @When("el usuario intenta cargar el mismo documento PDF nuevamente")
    public void el_usuario_intenta_cargar_el_mismo_documento_pdf_nuevamente() {
        page.uploadDocument("ruta/al/documento.pdf");
    }

    @Then("el sistema detecta el duplicado y muestra un mensaje informativo")
    public void el_sistema_detecta_el_duplicado_y_muestra_un_mensaje_informativo() {
        Assert.assertTrue(page.isDuplicateDetected());
    }
}