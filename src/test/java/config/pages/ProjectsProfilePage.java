package config.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProjectsProfilePage {

    /**** LOCATORS ****/
    SelenideElement PROJECTS_TAB = $("[data-tab-item=projects]");
    SelenideElement PROJECTS_RESULT_PANEL = $("#projects-results");

    /*** METHODS ***/
    public void openProjectsTab() {
        PROJECTS_TAB.shouldHave(Condition.visible).click();
        PROJECTS_RESULT_PANEL.shouldBe(Condition.visible);

    }
}