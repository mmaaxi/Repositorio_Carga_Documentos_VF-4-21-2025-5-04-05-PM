package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("inicia la carga de un documento PDF")
    public void inicia_la_carga_de_un_documento_pdf() {
        page.startUploadingPDF();
    }

    @Then("el sistema comienza el proceso de carga")
    public void el_sistema_comienza_el_proceso_de_carga() {
        Assert.assertTrue(page.isUploadInProgress());
    }

    @When("la conexión a internet es interrumpida durante la carga")
    public void la_conexión_a_internet_es_interrumpida_durante_la_carga() {
        page.interruptInternetConnection();
    }

    @Then("el proceso de carga se detiene y se muestra un mensaje de error de conexión")
    public void el_proceso_de_carga_se_detiene_y_se_muestra_un_mensaje_de_error_de_conexión() {
        Assert.assertTrue(page.isErrorDisplayed());
    }

    @When("la conexión a internet es restablecida e intenta cargar nuevamente")
    public void la_conexión_a_internet_es_restablecida_e_intenta_cargar_nuevamente() {
        page.restoreInternetConnectionAndRetry();
    }

    @Then("el sistema permite reintentar la carga exitosamente")
    public void el_sistema_permite_reintentar_la_carga_exitosamente() {
        Assert.assertTrue(page.isUploadSuccessful());
    }
}