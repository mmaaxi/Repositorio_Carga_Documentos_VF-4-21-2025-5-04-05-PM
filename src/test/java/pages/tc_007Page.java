package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_007Page {

    WebDriver driver;

    By botonCargarDocumento = By.id("uploadButton");
    By mensajeExitoCarga = By.id("successMessage");
    By listaDocumentos = By.id("documentList");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navegarAPaginaDeCarga() {
        driver.get("http://www.ejemplo.com/cargarDocumento");
    }

    public void cargarDocumentoPDF(String rutaArchivo) {
        WebElement cargarInput = driver.findElement(By.id("fileInput"));
        cargarInput.sendKeys(rutaArchivo);
        driver.findElement(botonCargarDocumento).click();
    }

    public boolean esCargaProcesada() {
        // Implementar lógica que verifique si el sistema ha procesado la carga
        return true; // Valor de prueba, implementar lógica necesaria
    }

    public boolean esNotificacionDeCargaExitosaVisible() {
        return driver.findElement(mensajeExitoCarga).isDisplayed();
    }

    public boolean esDocumentoListadoCorrectamente() {
        // Implementar lógica que verifique que el documento esté listado correctamente
        return driver.findElement(listaDocumentos).isDisplayed(); // Valor de prueba
    }
}