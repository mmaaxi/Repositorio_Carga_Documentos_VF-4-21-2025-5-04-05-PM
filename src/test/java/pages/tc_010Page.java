package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    WebDriver driver;

    private By documentSelector = By.id("document_selector");
    private By deleteOption = By.id("delete_option");
    private By deleteConfirmationButton = By.id("confirm_delete_button");
    private By confirmationMessage = By.id("confirmation_message");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDocument() {
        WebElement document = driver.findElement(documentSelector);
        document.click();
    }

    public boolean isDeleteOptionDisplayed() {
        return driver.findElement(deleteOption).isDisplayed();
    }

    public void clickDeleteDocumentAndConfirm() {
        driver.findElement(deleteOption).click();
        driver.findElement(deleteConfirmationButton).click();
    }

    public boolean isDocumentDeletedMessageDisplayed() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }
}