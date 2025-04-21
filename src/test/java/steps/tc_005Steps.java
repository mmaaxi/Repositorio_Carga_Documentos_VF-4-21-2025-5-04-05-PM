package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {

    tc_005Page uploadPage = new tc_005Page();

    @Given("I simulate a low connectivity environment")
    public void i_simulate_a_low_connectivity_environment() {
        Assert.assertTrue("Failed to simulate low connectivity", uploadPage.simulateLowConnectivity());
    }

    @When("I attempt to upload a PDF document")
    public void i_attempt_to_upload_a_pdf_document() {
        uploadPage.uploadPdfDocument();
    }

    @Then("the system should either retry the upload or inform the user of possible connection interruption")
    public void the_system_should_either_retry_or_inform_user() {
        String message = uploadPage.getUploadStatusMessage();
        Assert.assertTrue("Unexpected message received: " + message,
                message.contains("retrying") || message.contains("connection issue"));
    }
}