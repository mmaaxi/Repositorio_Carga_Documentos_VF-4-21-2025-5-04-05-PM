package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page tcPage;

    public tc_001Steps() {
        this.driver = Hooks.driver;
        tcPage = new tc_001Page(driver);
    }

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        tcPage.navigateToUploadPage();
    }

    @When("El usuario selecciona la opción 'Cargar documento'")
    public void el_usuario_selecciona_la_opcion_cargar_documento() {
        tcPage.clickUploadOption();
    }

    @Then("Se despliega el formulario para la carga de documentos")
    public void se_despliega_el_formulario_para_la_carga_de_documentos() {
        tcPage.verifyUploadFormDisplayed();
    }

    @When("El usuario selecciona un archivo PDF válido desde el sistema de archivos")
    public void el_usuario_selecciona_un_archivo_pdf_válido_desde_el_sistema_de_archivos() {
        tcPage.selectValidPDF();
    }

    @Then("El archivo seleccionado es reconocido como PDF")
    public void el_archivo_seleccionado_es_reconocido_como_pdf() {
        tcPage.verifyFileRecognizedAsPDF();
    }

    @When("El usuario hace clic en el botón 'Cargar'")
    public void el_usuario_hace_clic_en_el_botón_cargar() {
        tcPage.clickUploadButton();
    }

    @Then("El sistema inicia el proceso de carga y muestra una barra de progreso")
    public void el_sistema_inicia_el_proceso_de_carga_y_muestra_una_barra_de_progreso() {
        tcPage.verifyProgressBarDisplayed();
    }

    @And("El documento se almacena correctamente en la base de datos")
    public void el_documento_se_almacena_correctamente_en_la_base_de_datos() {
        tcPage.verifyDocumentStoredInDatabase();
    }

    @Then("El documento se almacena y se asigna un identificador único")
    public void el_documento_se_almacena_y_se_asigna_un_identificador_único() {
        tcPage.verifyUniqueIdAssigned();
    }
}