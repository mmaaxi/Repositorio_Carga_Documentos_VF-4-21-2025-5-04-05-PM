package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {

    WebDriver driver;

    By uploadOption = By.id("upload-option");
    By uploadForm = By.id("upload-form");
    By fileInput = By.id("file-input");
    By uploadButton = By.id("upload-button");
    By progressBar = By.id("progress-bar");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void clickUploadOption() {
        driver.findElement(uploadOption).click();
    }

    public void verifyUploadFormDisplayed() {
        assert driver.findElement(uploadForm).isDisplayed();
    }

    public void selectValidPDF() {
        driver.findElement(fileInput).sendKeys("path/to/valid.pdf");
    }

    public void verifyFileRecognizedAsPDF() {
        // Implement logic to verify the file is recognized as PDF
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public void verifyProgressBarDisplayed() {
        assert driver.findElement(progressBar).isDisplayed();
    }

    public void verifyDocumentStoredInDatabase() {
        // Implement logic to verify the document is stored in the database
    }

    public void verifyUniqueIdAssigned() {
        // Implement logic to verify the unique identifier is assigned
    }
}