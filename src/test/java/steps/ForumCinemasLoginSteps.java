package steps;

import cucumber.api.java.en.And;
import pages.ForumCinemasLogin;

public class ForumCinemasLoginSteps {

    ForumCinemasLogin forumCinemasLogin = new ForumCinemasLogin();

    @And("Open ForumCinemas Homepage")
    public void openForumCinemasHomepage() { forumCinemasLogin.openForumCinemas(); }

    @And("^Press Login$")
    public void pressLogin() { forumCinemasLogin.pressLogin(); }

    @And("^Enter Username$")
    public void enterUsername() { forumCinemasLogin.enterUserName(); }

    @And("^Enter Password$")
    public void enterPassword() { forumCinemasLogin.enterPassword(); }

    @And("^Enter Profile$")
    public void enterProfile() { forumCinemasLogin.enterProfile(); }

}
