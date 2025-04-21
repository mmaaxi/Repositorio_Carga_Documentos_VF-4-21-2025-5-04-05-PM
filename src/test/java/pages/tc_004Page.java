package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {
    WebDriver driver;

    private By cargaDocumentoInput = By.id("archivoCarga");
    private By procesarMetadatosButton = By.id("procesarMetadatos");
    private By erroresMetadatos = By.id("erroresMetadatos");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void cargarDocumentoPDF(String filePath) {
        WebElement uploadElement = driver.findElement(cargaDocumentoInput);
        uploadElement.sendKeys(filePath);
    }

    public void procesarMetadatos() {
        driver.findElement(procesarMetadatosButton).click();
    }

    public boolean inconsistenciasPresentes() {
        return driver.findElement(erroresMetadatos).isDisplayed();
    }
}