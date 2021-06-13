package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ForumCinemasSettings;

public class ForumCinemasSettingsSteps {

    ForumCinemasSettings forumCinemasSettings = new ForumCinemasSettings();

    @When("Open Profile Tab")
    public void openProfileTab() { forumCinemasSettings.openProfile(); }

    @Then("^Click On Change Profile Information$")
    public void clickOnChangeProfileInformation() { forumCinemasSettings.profileInformation(); }

    @And("^Change Name$")
    public void changeName() { forumCinemasSettings.changeName(); }

    @And("^Last Name$")
    public void lastName() { forumCinemasSettings.changeLastName(); }

    @And("^Date$")
    public void date() { forumCinemasSettings.changeDate(); }

    @And("^Month$")
    public void month() { forumCinemasSettings.changeMonth(); }

    @And("^Year$")
    public void year() { forumCinemasSettings.changeYear(); }

    @And("^Save Changes$")
    public void saveChanges() { forumCinemasSettings.saveChanges(); }
}
