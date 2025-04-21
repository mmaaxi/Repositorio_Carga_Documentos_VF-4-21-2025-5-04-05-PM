package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {

    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginBtn");
    private By accessDeniedMessage = By.id("accessDeniedMessage");
    private By uploadFunctionalityLink = By.id("uploadFunctionality");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void verifyAccessDeniedToUpload() {
        // Logic to verify access is denied to upload functionality.
        if (driver.findElements(uploadFunctionalityLink).isEmpty()) {
            System.out.println("Access to upload functionality is restricted as expected.");
        } else {
            throw new AssertionError("User has access to upload functionality when it shouldn't.");
        }
    }

    public void navigateToUploadFunctionality() {
        driver.findElement(uploadFunctionalityLink).click();
    }

    public void verifyAccessDeniedMessage() {
        String message = driver.findElement(accessDeniedMessage).getText();
        if (message.equals("Access denied")) {
            System.out.println("Access denied message displayed correctly.");
        } else {
            throw new AssertionError("Incorrect access denied message.");
        }
    }
}