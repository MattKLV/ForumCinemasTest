package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import helpers.CommonForumCinemas;

public class CommonForumCinemasSteps {

    CommonForumCinemas common = new CommonForumCinemas();

    @Given("Open Chrome")
    public void openChrome() { common.startChrome(); }

    @And("Close Chrome")
    public void closeChrome() { common.stopChrome(); }

}
