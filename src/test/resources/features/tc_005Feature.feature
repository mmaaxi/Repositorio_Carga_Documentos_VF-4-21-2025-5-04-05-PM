Feature: Validate upload process under low connectivity conditions

  Scenario: Validate PDF upload under low connectivity
    Given I simulate a low connectivity environment
    When I attempt to upload a PDF document
    Then the system should either retry the upload or inform the user of possible connection interruption