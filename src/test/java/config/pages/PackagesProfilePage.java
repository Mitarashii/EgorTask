package config.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PackagesProfilePage {
    /**** LOCATORS ****/
    SelenideElement PACKAGE_TAB = $("[data-tab-item=packages]");
    SelenideElement PACKAGE_RESULT_PANEL = $("#package-results");

    /*** METHODS ***/
    public void openPackagesTab() {
        if (!PACKAGE_RESULT_PANEL.isDisplayed() && PACKAGE_TAB.isDisplayed()) {
            PACKAGE_TAB.shouldHave(Condition.visible).click();
            PACKAGE_RESULT_PANEL.shouldBe(Condition.visible);
        }
    }
}
