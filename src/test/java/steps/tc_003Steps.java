package steps;

import pages.tc_003Page;
import io.cucumber.java.en.*;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("el usuario está en la página de carga de documentos")
    public void usuarioEnPaginaCarga() {
        page.navegarAPaginaDeCarga();
    }

    @When("selecciona la opción 'Cargar documento'")
    public void seleccionaOpcionCargarDocumento() {
        page.seleccionarCargarDocumento();
    }

    @Then("se despliega el formulario de carga")
    public void desplegarFormularioDeCarga() {
        page.verificarFormularioDeCarga();
    }
    
    @When("el usuario carga un archivo PDF pequeño")
    public void cargaArchivoPDFPequeño() {
        page.cargarArchivoPequeno();
    }
    
    @Then("el archivo se carga sin problemas")
    public void archivoCargaSinProblemas() {
        page.verificarCargaExitosa();
    }

    @When("el usuario carga un archivo PDF grande")
    public void cargaArchivoPDFGrande() {
        page.cargarArchivoGrande();
    }
    
    @Then("el sistema valida el tamaño del archivo")
    public void sistemaValidaTamanoArchivo() {
        page.verificarValidacionDeTamano();
    }

    @Then("informa sobre límites de tamaño o muestra un mensaje adecuado")
    public void informaSobreLimites() {
        page.verificarMensajeLimite();
    }
}