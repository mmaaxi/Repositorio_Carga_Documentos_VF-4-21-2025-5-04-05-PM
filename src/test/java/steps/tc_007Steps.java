package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("El usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navegarAPaginaDeCarga();
    }

    @When("El usuario carga un documento PDF válido")
    public void elUsuarioCargaUnDocumentoPDFValido() {
        page.cargarDocumentoPDF("ruta/del/documento.pdf");
    }

    @Then("El sistema procesa la carga del documento")
    public void elSistemaProcesaLaCargaDelDocumento() {
        Assert.assertTrue(page.esCargaProcesada());
    }

    @And("El usuario recibe una notificación de confirmación de carga exitosa")
    public void elUsuarioRecibeUnaNotificacionDeConfirmacionDeCargaExitosa() {
        Assert.assertTrue(page.esNotificacionDeCargaExitosaVisible());
    }

    @And("El documento aparece en la lista de documentos cargados")
    public void elDocumentoApareceEnLaListaDeDocumentosCargados() {
        Assert.assertTrue(page.esDocumentoListadoCorrectamente());
    }
}