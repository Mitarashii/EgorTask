package tests;

import com.codeborne.selenide.Selenide;
import config.pages.OverviewProfilePage;
import config.pages.PackagesProfilePage;
import config.pages.ProjectsProfilePage;
import config.pages.RepositoriesProfilePage;
import org.junit.jupiter.api.*;


import static com.codeborne.selenide.Selenide.*;

public class ProfileTabTests {

    /**** PAGES ****/
    RepositoriesProfilePage repositoryTab = new RepositoriesProfilePage();
    ProjectsProfilePage projectTab = new ProjectsProfilePage();
    PackagesProfilePage packagesTab = new PackagesProfilePage();
    OverviewProfilePage overviewTab = new OverviewProfilePage();

    /**** TEST DATA ****/
    public final String repositoryEgorTask = "EgorTask";

    @BeforeEach
    void beforeEach() {
        open("https://github.com/Mitarashii");
    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }

    @Test
    void openMitarashiiRepositories() {
        repositoryTab.openRepositoryTab();
        repositoryTab.searchRepositoryName(repositoryEgorTask);
    }

    @Test
    void openProjectsTab() {
        projectTab.openProjectsTab();
    }

    @Test
    void openPackagesTab() {
        packagesTab.openPackagesTab();
    }

    @Test
    void openOverviewPage() {
        overviewTab.openOverviewTab();
    }

    //
}
