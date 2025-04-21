package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_008Page {
    WebDriver driver;
    WebDriverWait wait;

    By uploadInput = By.id("uploadInput");
    By uploadButton = By.id("uploadButton");
    By successMessage = By.id("successMessage");
    By duplicateMessage = By.id("duplicateMessage");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadDocument(String filePath) {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadSuccessful() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).isDisplayed();
    }

    public boolean isDuplicateDetected() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(duplicateMessage)).isDisplayed();
    }
}