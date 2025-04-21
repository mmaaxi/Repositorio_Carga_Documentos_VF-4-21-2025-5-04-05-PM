package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_010Page;
import static org.junit.Assert.assertTrue;

public class tc_010Steps {

    WebDriver driver;
    WebDriverWait wait;
    tc_010Page page;

    @Given("El usuario ha iniciado sesión en el sistema")
    public void elUsuarioHaIniciadoSesionEnElSistema() {
        // Código para iniciar sesión. E.g., driver.get("login_url");
        page = new tc_010Page(driver);
    }

    @When("Selecciona un documento previamente cargado")
    public void seleccionaUnDocumentoPreviamenteCargado() {
        page.selectDocument();
    }

    @Then("El sistema muestra la opción de eliminación")
    public void elSistemaMuestraLaOpcionDeEliminacion() {
        assertTrue(page.isDeleteOptionDisplayed());
    }

    @When("Hace clic en 'Eliminar documento' y confirma la acción")
    public void haceClicEnEliminarDocumentoYConfirmaLaAccion() {
        page.clickDeleteDocumentAndConfirm();
    }

    @Then("El sistema elimina el documento de la lista y de la base de datos, mostrando un mensaje de confirmación")
    public void elSistemaEliminaElDocumentoDeLaListaYDeLaBaseDeDatosMostrandoUnMensajeDeConfirmacion() {
        assertTrue(page.isDocumentDeletedMessageDisplayed());
    }
}