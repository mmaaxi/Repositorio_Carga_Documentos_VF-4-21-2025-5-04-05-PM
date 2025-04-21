package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.*;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page page;

    public tc_002Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc_002Page.class);
    }

    @Given("el usuario está en la interfaz de usuario con la opción para cargar documentos")
    public void el_usuario_está_en_la_interfaz_de_usuario_con_la_opción_para_cargar_documentos() {
        page.navigateToUploadSection();
    }

    @When("el usuario selecciona la opción 'Cargar documento'")
    public void el_usuario_selecciona_la_opcion_Cargar_documento() {
        page.clickUploadOption();
    }

    @Then("el formulario para la carga de documentos se muestra")
    public void el_formulario_para_la_carga_de_documentos_se_muestra() {
        page.verifyUploadFormIsDisplayed();
    }

    @When("el usuario intenta cargar un archivo con formato DOCX")
    public void el_usuario_intenta_cargar_un_archivo_con_formato_DOCX() {
        page.uploadInvalidFormatDocument();
    }

    @Then("el sistema identifica el formato como no permitido")
    public void el_sistema_identifica_el_formato_como_no_permitido() {
        page.verifyInvalidFormatWarning();
    }

    @When("el usuario hace clic en el botón 'Cargar'")
    public void el_usuario_hace_clic_en_el_botón_Cargar() {
        page.clickUploadButton();
    }

    @Then("el sistema muestra un mensaje de error indicando que el formato del archivo no es permitido")
    public void el_sistema_muestra_un_mensaje_de_error_indicando_que_el_formato_del_archivo_no_es_permitido() {
        page.verifyErrorMessageDisplayed();
    }
}