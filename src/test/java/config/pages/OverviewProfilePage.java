package config.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class OverviewProfilePage {

    /**** LOCATORS ****/
    SelenideElement OVERVIEW_TAB = $("[data-tab-item=overview]");
    SelenideElement OVERVIEW_RESULT_PANEL = $("#js-contribution-activity");

    /*** METHODS ***/
    public void openOverviewTab() {
        OVERVIEW_TAB.shouldHave(Condition.visible).click();
        OVERVIEW_RESULT_PANEL.shouldBe(Condition.visible);
    }
}

//ToDo
// 1. find locators
// 2. type methods
// 3. type page
// 4. make a test with "Overview"