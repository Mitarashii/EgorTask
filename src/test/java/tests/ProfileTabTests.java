package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import config.pages.ProjectsProfilePage;
import config.pages.RepositoriesProfilePage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



import static com.codeborne.selenide.Selenide.*;

public class ProfileTabTests {

    /**** PAGES ****/
    RepositoriesProfilePage repositoryTab = new RepositoriesProfilePage();
    ProjectsProfilePage projectTab = new ProjectsProfilePage();

    /**** TEST DATA ****/
    public final String repositoryEgorTask = "EgorTask";

    @BeforeAll
    static void beforeAll() {
        open("https://github.com/Mitarashii");
    }

    @AfterAll
    static void afterAll() {
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

    // Сделать тест на открытие вкладки Projects по аналогии с Repositories
}
