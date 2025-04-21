package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    WebDriver driver;

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeCarga() {
        driver.get("url_de_la_pagina_de_carga");
    }

    public void seleccionarCargarDocumento() {
        driver.findElement(By.id("cargarDocumentoBtn")).click();
    }

    public void verificarFormularioDeCarga() {
        driver.findElement(By.id("formularioCarga")).isDisplayed();
    }
    
    public void cargarArchivoPequeno() {
        driver.findElement(By.id("inputFile")).sendKeys("ruta_al_archivo_pequeno.pdf");
        driver.findElement(By.id("submitBtn")).click();
    }
    
    public void verificarCargaExitosa() {
        driver.findElement(By.id("mensajeExito")).isDisplayed();
    }

    public void cargarArchivoGrande() {
        driver.findElement(By.id("inputFile")).sendKeys("ruta_al_archivo_grande.pdf");
        driver.findElement(By.id("submitBtn")).click();
    }
    
    public void verificarValidacionDeTamano() {
        // Método para verificar la validación del tamaño del archivo
    }

    public void verificarMensajeLimite() {
        driver.findElement(By.id("mensajeLimite")).isDisplayed();
    }
}