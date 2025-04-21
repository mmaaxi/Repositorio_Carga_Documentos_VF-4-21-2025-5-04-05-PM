package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_009Page;

public class tc_009Steps {

    WebDriver driver;
    tc_009Page page;

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        page = new tc_009Page(driver);
    }

    @When("inicia sesión con un usuario sin permisos para cargar documentos")
    public void inicia_sesion_con_un_usuario_sin_permisos_para_cargar_documentos() {
        page.login("usuario_sin_permisos", "contraseña");
    }

    @Then("el sistema restringe el acceso a la función de carga")
    public void el_sistema_restringe_el_acceso_a_la_funcion_de_carga() {
        page.verifyAccessDeniedToUpload();
    }

    @When("el usuario intenta acceder a la funcionalidad de carga de documentos")
    public void el_usuario_intenta_acceder_a_la_funcionalidad_de_carga_de_documentos() {
        page.navigateToUploadFunctionality();
    }

    @Then("se muestra un mensaje de acceso denegado o redirección a la página de permisos")
    public void se_muestra_un_mensaje_de_acceso_denegado_o_redireccion_a_la_pagina_de_permisos() {
        page.verifyAccessDeniedMessage();
        driver.quit();
    }
}