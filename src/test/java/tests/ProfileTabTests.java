package tests;

import com.codeborne.selenide.Selenide;
import main.config.BaseSetup;
import main.pages.OverviewProfilePage;
import main.pages.PackagesProfilePage;
import main.pages.ProjectsProfilePage;
import main.pages.RepositoriesProfilePage;
import org.junit.jupiter.api.*;


import static com.codeborne.selenide.Selenide.*;

public class ProfileTabTests extends BaseSetup {

    /**** PAGES ****/
    RepositoriesProfilePage repositoryTab = new RepositoriesProfilePage();
    ProjectsProfilePage projectTab = new ProjectsProfilePage();
    PackagesProfilePage packagesTab = new PackagesProfilePage();
    OverviewProfilePage overviewTab = new OverviewProfilePage();

    /**** TEST DATA ****/

    @BeforeEach
    void beforeEach() {
        open(mitarashiiProfileUrl);
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

}
