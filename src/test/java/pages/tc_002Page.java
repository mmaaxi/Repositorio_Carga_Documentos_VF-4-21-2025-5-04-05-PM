package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    By uploadOption = By.id("uploadOption");
    By uploadForm = By.id("uploadForm");
    By fileInput = By.id("fileInput");
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadSection() {
        // navigate to the upload section where users can upload documents
    }

    public void clickUploadOption() {
        driver.findElement(uploadOption).click();
    }

    public void verifyUploadFormIsDisplayed() {
        driver.findElement(uploadForm).isDisplayed();
    }

    public void uploadInvalidFormatDocument() {
        driver.findElement(fileInput).sendKeys("path/to/invalidFormatDocument.docx");
    }

    public void verifyInvalidFormatWarning() {
        // add logic to verify the system identifies the format as not allowed
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public void verifyErrorMessageDisplayed() {
        driver.findElement(errorMessage).isDisplayed();
    }
}