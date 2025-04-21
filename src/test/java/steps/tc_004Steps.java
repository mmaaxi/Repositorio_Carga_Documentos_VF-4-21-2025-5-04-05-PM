package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page documentPage = new tc_004Page();

    @Given("el usuario carga un documento PDF con metadatos completos e incorrectos")
    public void cargarDocumentoConMetadatosIncorrectos() {
        documentPage.cargarDocumentoPDF("path/to/documento.pdf");
    }

    @When("el sistema procesa los metadatos del documento")
    public void sistemaProcesaMetadatos() {
        documentPage.procesarMetadatos();
    }

    @Then("el sistema resalta inconsistencias o errores en los metadatos, solicitando corrección")
    public void verificarErroresEnMetadatos() {
        Assert.assertTrue(documentPage.inconsistenciasPresentes(), "No se resaltaron inconsistencias o errores en los metadatos.");
    }
}