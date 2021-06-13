import helpers.CommonForumCinemas;
import org.junit.Test;
import pages.ForumCinemasLogin;
import pages.ForumCinemasSettings;


public class ForumCinemasPOM {
    CommonForumCinemas commonForumCinemas = new CommonForumCinemas();
    ForumCinemasLogin forumCinemasLogin = new ForumCinemasLogin();
    ForumCinemasSettings forumCinemasSettings = new ForumCinemasSettings();

    @Test
    public void ForumCinemasPOM() {
        commonForumCinemas.startChrome();

        forumCinemasLogin.openForumCinemas();
        forumCinemasLogin.pressLogin();
        forumCinemasLogin.enterUserName();
        forumCinemasLogin.enterPassword();
        forumCinemasLogin.enterProfile();

        forumCinemasSettings.openProfile();
        forumCinemasSettings.profileInformation();
        forumCinemasSettings.changeName();
        forumCinemasSettings.changeLastName();
        forumCinemasSettings.changeDate();
        forumCinemasSettings.changeMonth();
        forumCinemasSettings.changeYear();
        forumCinemasSettings.saveChanges();

        commonForumCinemas.stopChrome();

    }
}
